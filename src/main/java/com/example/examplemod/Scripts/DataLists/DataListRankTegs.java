package com.example.examplemod.Scripts.DataLists;
import com.example.examplemod.Blocks.BlockMod;
import com.example.examplemod.Scripts.ModSystems.HolderObjectsMod;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class DataListRankTegs {
    private final HolderObjectsMod holder;

    public DataListRankTegs(HolderObjectsMod holder) {
        this.holder = holder;
    }

    public void register(ServerLevel level) {
        // Получаем реестр тегов через уровень
        var registry = level.registryAccess()
            .registryOrThrow(Registries.BLOCK);

        // Слой 1 — самые широкие категории по типу инструмента
        registerByTag(registry, BlockTags.MINEABLE_WITH_HOE, 1);
        //registerByTag(registry, BlockTags.MINEABLE_WITH_SWORD, 1);
        registerByTag(registry, BlockTags.MINEABLE_WITH_SHOVEL, 2);
        registerByTag(registry, BlockTags.MINEABLE_WITH_AXE, 3);
        registerByTag(registry, BlockTags.MINEABLE_WITH_PICKAXE, 4);

        // Слой 3 — требования к тиру инструмента (самые конкретные)
        registerByTag(registry, BlockTags.NEEDS_STONE_TOOL, 5);
        registerByTag(registry, BlockTags.NEEDS_IRON_TOOL, 6);
        registerByTag(registry, BlockTags.NEEDS_DIAMOND_TOOL, 7);

        registerByTag(registry, BlockTags.REPLACEABLE_PLANTS, 1);
        registerByTag(registry, BlockTags.SAPLINGS, 1);
        registerByTag(registry, BlockTags.WALL_POST_OVERRIDE, 1);
        registerByTag(registry, BlockTags.WOODEN_PRESSURE_PLATES, 2);
        registerByTag(registry, BlockTags.FLOWERS, 1);
        registerByTag(registry, BlockTags.WOOL, 1);
        registerByTag(registry, BlockTags.LEAVES, 1);

        //registerByTag(registry, BlockTags.DARK_OAK_LOGS, 4);
        //registerByTag(registry, BlockTags.DIRT, 2); kelp
        //registerByTag(registry, BlockTags.LOGS, 3);
        //registerByTag(registry, BlockTags.STONE_ORE_REPLACEABLES, 4);
        //registerByTag(registry, BlockTags.DEEPSLATE_ORE_REPLACEABLES, 5);
        // и так далее
    }

    private void registerByTag(Registry<Block> registry, 
                                TagKey<Block> tag, int rank) {
        registry.getTagOrEmpty(tag).forEach(holder -> {
            holder.value();
            Block block = holder.value();
            this.holder.registerBlock(block, new BlockMod(rank));
        });
    }
}
