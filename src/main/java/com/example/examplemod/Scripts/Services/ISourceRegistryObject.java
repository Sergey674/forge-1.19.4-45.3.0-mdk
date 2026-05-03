package com.example.examplemod.Scripts.Services;

import java.util.Map;

import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.registries.RegistryObject;

public interface ISourceRegistryObject<T> {
    public Map<ResourceLocation, RegistryObject<T>> getResource();
}
