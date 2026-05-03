package com.example.examplemod.Scripts.Registrs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.example.examplemod.Items.ItemsTest;
import com.example.examplemod.Scripts.ModCreativeTabs;
import com.example.examplemod.Scripts.Services.ISourceFactory;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsModiferDeferred extends ObjectsModifier<Item> {
    private Map<ResourceLocation, RegistryObject<Item>> ItemsModifier = new HashMap<>();

    public ItemsModiferDeferred(IEventBus eventBus) {
        super(eventBus);
    }

    static public RegistryObject<Item> registryItem;

    @Override
    public void register(ISourceFactory<Item> source, String mod_id) {
        DeferredRegister<Item> blockRegister = DeferredRegister.create(ForgeRegistries.ITEMS, mod_id);
        Map<ResourceLocation, Supplier<Item>> mapProperies = source.getResource();
        //ResourceLocation resource = new ResourceLocation("minecraft", "stone_bricks");
        //Block original = ForgeRegistries.BLOCKS.getValue(resource);
        
        for (ResourceLocation resource : mapProperies.keySet()) {
            String name = resource.getPath();
            registryItem = blockRegister.register(name, mapProperies.get(resource));
            ItemsModifier.put(resource, registryItem);
        }

        blockRegister.register(eventBus);
        //eventBus.addListener(this::addCreative);
    }

    
    public void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == ModCreativeTabs.test_tab)
            for (RegistryObject registryObject : ItemsModifier.values()) {
                event.accept(registryObject);
            }
    }

    public Map<ResourceLocation, RegistryObject<Item>> getResource() {
        return ItemsModifier;
    }
}
