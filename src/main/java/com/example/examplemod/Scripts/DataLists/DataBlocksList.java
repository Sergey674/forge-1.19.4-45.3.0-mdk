package com.example.examplemod.Scripts.DataLists;

import com.example.examplemod.Scripts.Registrs.HolderBlockVanilla;
import com.example.examplemod.Scripts.Registrs.HolderBlocksFactory;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class DataBlocksList {
    private HolderBlocksFactory holderBlocks;
    
    public HolderBlocksFactory getHolderBlocks() {
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "block1"),
                properties -> new Block(properties),
                BlockBehaviour.Properties.of(Material.STONE)
                    .strength(8, 1200)
        );
        
        return holderBlocks;
    }

    public DataBlocksList() {
        holderBlocks = new HolderBlockVanilla();
    }
    
    public DataBlocksList(HolderBlockVanilla holder){
        holderBlocks = holder;
    }
}
