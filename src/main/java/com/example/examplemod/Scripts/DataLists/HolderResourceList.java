package com.example.examplemod.Scripts.DataLists;

import java.util.List;

import com.example.examplemod.Scripts.Services.ISourceResources;

import net.minecraft.resources.ResourceLocation;

public class HolderResourceList implements ISourceResources {
    public List<ResourceLocation> getResource() {
        List<ResourceLocation> resources = List.of(
            new ResourceLocation("minecraft", "iron_ingot_from_smelting_raw_iron"),
            new ResourceLocation("minecraft", "iron_ingot_from_blasting_raw_iron"),
            new ResourceLocation("minecraft", "stone_pickaxe")
        );

        return resources;
    }
}
