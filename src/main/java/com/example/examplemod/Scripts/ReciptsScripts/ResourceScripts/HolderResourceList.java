package com.example.examplemod.Scripts.ReciptsScripts.ResourceScripts;

import java.util.List;
import net.minecraft.resources.ResourceLocation;

public class HolderResourceList extends HolderResource {
    public HolderResourceList() {
        super();

        List<ResourceLocation> resources = List.of(
            new ResourceLocation("minecraft", "iron_ingot_from_smelting_raw_iron"),
            new ResourceLocation("minecraft", "iron_ingot_from_blasting_raw_iron"),
            new ResourceLocation("minecraft", "stone_pickaxe")
        );

        super.resources = resources;
    }
    
}
