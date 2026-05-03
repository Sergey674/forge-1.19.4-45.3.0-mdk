package com.example.examplemod.Scripts.ModSystems.HardnessScripts;

import org.stringtemplate.v4.compiler.CodeGenerator.primary_return;

import com.example.examplemod.Scripts.Services.ISourceHardnessRank;

import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class StrengthHandler {
    private ISourceHardnessRank sourceHardnessRank;
    private HardnessConfig config;
    private float lastMultiplier;
    
    public StrengthHandler(ISourceHardnessRank source, HardnessConfig config){
        sourceHardnessRank = source;
        this.config = config;
    }
    
    @SubscribeEvent
    public void onBreakSpeed(PlayerEvent.BreakSpeed event) {
        Player player = event.getEntity();
        BlockState state = event.getState();
        ItemStack heldItem = player.getMainHandItem();

        // Проверяем подходит ли инструмент по типу
        boolean correctType = heldItem.isCorrectToolForDrops(state);

        int toolRank = correctType 
            ? sourceHardnessRank.getToolRank(heldItem.getItem())
            : 2; // не подходит по типу → ранг как у руки

        int blockRank = sourceHardnessRank.getBlockRank(state.getBlock());

        int diff = blockRank - toolRank + config.SHIFT;

        float multiplier;
        if (diff > 0) {
            // Штраф — инструмент слабее
            multiplier = 1 + config.FINE_PERCENTAGE * diff;
        } else {
            // Бонус или норма — инструмент сильнее или равен
            multiplier = 1f; // diff < 0 ? 1.0f / config.BONUS : 1.0f;
        }
        lastMultiplier = multiplier;
        // Делим скорость на множитель (больше множитель → медленнее)
        event.setNewSpeed(event.getNewSpeed() / multiplier);
    }

    @SubscribeEvent
    public void onBlockBreak(BlockEvent.BreakEvent event) {
        if (!(event.getPlayer() instanceof ServerPlayer player)) return;

        BlockState state = event.getState();
        ItemStack heldItem = player.getMainHandItem();

        int toolRank = sourceHardnessRank.getToolRank(heldItem.getItem());
        int blockRank = sourceHardnessRank.getBlockRank(state.getBlock());

        int diff = blockRank - toolRank + config.SHIFT;
        float additionalDamage = diff * config.DURABILITY_COST;

        // Гарантированная часть
        int guaranteed = (int) additionalDamage;

        // Вероятностная часть
        float chance = additionalDamage - guaranteed;
        int random = player.getRandom().nextFloat() < chance ? 1 : 0;

        int toSpend = guaranteed + random;

        player.sendSystemMessage(Component.literal(
        String.format("BlockRank: %d | ToolRank: %d | diff: %d | multiplier: %.2f | toSpend: %d",
            blockRank, toolRank, diff, lastMultiplier, toSpend)
        ));

        boolean correctType = heldItem.isCorrectToolForDrops(state);
        if (!correctType) return;

        if (diff <= 0) return;

        if (toSpend > 0) {
            heldItem.hurtAndBreak(toSpend, player,
                p -> p.broadcastBreakEvent(player.getUsedItemHand()));
        }
    }
}
