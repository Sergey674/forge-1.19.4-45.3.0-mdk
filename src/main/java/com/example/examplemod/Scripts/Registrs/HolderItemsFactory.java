package com.example.examplemod.Scripts.Registrs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Supplier;
import com.example.examplemod.Scripts.Services.ISourceFactory;
import com.example.examplemod.Scripts.Services.ISourceRegistryObject;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class HolderItemsFactory implements ISourceFactory<Item> {
    private Map<ResourceLocation, Supplier<Item>> holderItem = new HashMap<>();

    private ISourceRegistryObject<Block> source;

    public HolderItemsFactory(ISourceRegistryObject<Block> source){
        this.source = source;
    }

    public Map<ResourceLocation, Supplier<Item>> getResource() {
        Map<ResourceLocation, RegistryObject<Block>> mapBlock = source.getResource();
        
        for (ResourceLocation resource : mapBlock.keySet()) {
            RegistryObject<Block> registryObject = mapBlock.get(resource); 
            addItem(resource, () -> new BlockItem(registryObject.get(), 
                new Item.Properties()
            ));
        }

        return holderItem;
    }


    public void addItem(ResourceLocation resource, Supplier<Item> getItem) {
        holderItem.put(resource, getItem); 
    }

    public void addItemBlock(ResourceLocation resource, RegistryObject registryBlock, Function<Properties, Item> getItem, Properties properties) {
        // Item original = ForgeRegistries.ITEMS.getValue(resource);
        // final Properties props = getProp.apply(Properties.copy(original));

        // addItem(resource, () -> getItem.apply(properties), props); 
    }

    public void removeItem(ResourceLocation key){
        if(holderItem.containsKey(key))
            holderItem.remove(key);
    }
}
