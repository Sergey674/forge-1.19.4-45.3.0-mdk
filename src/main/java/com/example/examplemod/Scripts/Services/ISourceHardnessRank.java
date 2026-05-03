package com.example.examplemod.Scripts.Services;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public interface ISourceHardnessRank {
    public int getBlockRank(Block block);
    
    public int getToolRank(Item item);
}
