package com.example.examplemod.Scripts.ReciptsScripts.ResourceScripts;

import java.util.List;
import net.minecraft.resources.ResourceLocation;

public class HolderResource {
    protected List<ResourceLocation> resources;

    public HolderResource(List<ResourceLocation> resources) {
        this.resources = resources;
    }

    public HolderResource() { }
    
    public List<ResourceLocation> getResource() {
        return resources;
    }
}
