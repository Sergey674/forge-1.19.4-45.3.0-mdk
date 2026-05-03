package com.example.examplemod.Scripts.Registrs;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.example.examplemod.Scripts.Services.ISourceFactory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlocksModifierDeferred extends ObjectsModifier<Block> {
    private Map<ResourceLocation, RegistryObject<Block>> blocksModifier = new HashMap<>();

    public BlocksModifierDeferred(IEventBus eventBus) {
        super(eventBus);
    }

    @Override
    public void register(ISourceFactory<Block> source, String mod_id) {
        DeferredRegister<Block> blockRegister = DeferredRegister.create(ForgeRegistries.BLOCKS, mod_id);
        Map<ResourceLocation, Supplier<Block>> mapProperies = source.getResource();
        //ResourceLocation resource = new ResourceLocation("minecraft", "stone_bricks");
        //Block original = ForgeRegistries.BLOCKS.getValue(resource);
        
        for (ResourceLocation resource : mapProperies.keySet()) {
            String name = resource.getPath();
            blocksModifier.put(resource, blockRegister.register(name, mapProperies.get(resource)));
        }

        blockRegister.register(eventBus);
    }

    public Map<ResourceLocation, RegistryObject<Block>> getResource() {
        return blocksModifier;
    }
}
