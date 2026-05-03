package com.example.examplemod.Scripts.Services;

import java.util.Map;
import java.util.function.Supplier;

import net.minecraft.resources.ResourceLocation;

public interface ISourceFactory<T> {
    public Map<ResourceLocation, Supplier<T>> getResource();
}
