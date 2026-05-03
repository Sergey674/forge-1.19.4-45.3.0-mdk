package com.example.examplemod.Scripts.Registrs;

import java.util.function.Function;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class HolderBlockVanilla extends HolderBlocksFactory {

    //     public void addBlock(ResourceLocation resource, Function<Properties, Block> getBlock, Function<Properties, Properties> getProp) {
    //     Block original = ForgeRegistries.BLOCKS.getValue(resource);
    //     final Properties props = getProp.apply(Properties.copy(original));

    //     super.addBlock(resource, (properties) -> getBlock.apply(properties), props); 
    // }
}
