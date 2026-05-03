package com.example.examplemod.Scripts.Registrs;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;

import com.example.examplemod.Scripts.Services.ISourceFactory;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraftforge.registries.ForgeRegistries;

public class HolderBlocksFactory implements ISourceFactory {

    private Map<ResourceLocation, Supplier<Block>> holderBlock = new HashMap<>();

    //private Map<ResourceLocation, Function<Block, Block>> holderBlock2 = new HashMap<>();

    public Map<ResourceLocation, Supplier<Block>> getResource() {    
        return holderBlock;
    }

    public void addBlock(ResourceLocation resource, Function<Properties, Block> getBlock, Properties properties) {
        holderBlock.put(resource, () -> getBlock.apply(properties)); 
    }

    public void addBlock(ResourceLocation resource, Function<Properties, Block> getBlock, Function<Properties, Properties> getProp) {
        if(ForgeRegistries.BLOCKS.containsKey(resource) == false)
            return;
        
        Block original = ForgeRegistries.BLOCKS.getValue(resource);
        final Properties props = getProp.apply(Properties.copy(original));

        addBlock(resource, (properties) -> getBlock.apply(properties), props); 
    }

    public void removeBlock(ResourceLocation key){
        if(holderBlock.containsKey(key))
            holderBlock.remove(key);
    }
}
