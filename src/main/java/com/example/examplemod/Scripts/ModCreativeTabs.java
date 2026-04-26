package com.example.examplemod.Scripts;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.example.examplemod.ExampleMod;

@Mod.EventBusSubscriber(modid = ExampleMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTabs {
    public static CreativeModeTab test_tab;

    @SubscribeEvent
    public static void regTab(CreativeModeTabEvent.Register e) {
        test_tab = e.registerCreativeModeTab(new ResourceLocation(ExampleMod.MODID, "test_tab"),
                builder -> builder.icon(() -> new ItemStack(ItemStack.EMPTY.getItem()))
                .title(Component.translatable("creativemodetab.test_tab")));
    }
}
