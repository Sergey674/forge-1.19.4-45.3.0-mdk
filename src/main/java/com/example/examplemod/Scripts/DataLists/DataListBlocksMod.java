package com.example.examplemod.Scripts.DataLists;

import com.example.examplemod.Blocks.BlockMod;
import com.example.examplemod.Scripts.ModSystems.HolderObjectsMod;

import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class DataListBlocksMod {
    private final HolderObjectsMod holder;

    public DataListBlocksMod(HolderObjectsMod holder) {
        this.holder = holder;
    }

    public void register() {
        // holder.registerBlock(Blocks.GRASS_BLOCK, new BlockMod(2));
        //holder.registerBlock(Blocks.DIRT, new BlockMod(5));
        // holder.registerBlock(Blocks.OAK_LOG, new BlockMod(2));
        // holder.registerBlock(Blocks.STONE, new BlockMod(4));
        // holder.registerBlock(Blocks.DEEPSLATE, new BlockMod(5));
        holder.registerBlock(Blocks.COBBLED_DEEPSLATE, new BlockMod(5));
    }
}
