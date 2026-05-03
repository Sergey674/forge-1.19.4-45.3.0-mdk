package com.example.examplemod.Scripts.ModSystems;

import java.util.HashMap;
import java.util.Map;

import com.example.examplemod.Blocks.BlockMod;
import com.example.examplemod.Items.ItemMod;
import com.example.examplemod.Scripts.Services.ISourceHardnessRank;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class HolderObjectsMod implements ISourceHardnessRank {
    private final Map<Block, BlockMod> BlocksMod = new HashMap<>();
    private final Map<Item, ItemMod> ItemsMod = new HashMap<>();
    
    public void registerBlock(Block block, BlockMod blockMod) {
        BlocksMod.put(block, blockMod);
    }
    
    public void registerTool(Item item, ItemMod itemMod) {
        ItemsMod.put(item, itemMod);
    }
    
    public BlockMod getBlock(Block block) {
        return BlocksMod.getOrDefault(block, BlockMod.getOfDefault()); 
    }
    
    public ItemMod getTool(Item item) {
        return ItemsMod.getOrDefault(item, ItemMod.getOfDefault());
    }

    public int getBlockRank(Block block) {
        return BlocksMod.getOrDefault(block, BlockMod.getOfDefault()).getHardnessRank(); 
    }
    
    public int getToolRank(Item item) {
        return ItemsMod.getOrDefault(item, ItemMod.getOfDefault()).getHardnessRank();
    }
}