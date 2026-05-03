package com.example.examplemod.Scripts.Registrs;

import com.example.examplemod.Scripts.Services.ISourceFactory;
import com.example.examplemod.Scripts.Services.ISourceRegistryObject;
import net.minecraftforge.eventbus.api.IEventBus;

public abstract class ObjectsModifier<T> implements ISourceRegistryObject<T>{
    protected final IEventBus eventBus;

    public ObjectsModifier(IEventBus eventBus) {
        this.eventBus = eventBus;
    }

    // Стратегия сама подписывается на нужное событие
    public abstract void register(ISourceFactory<T> source, String mod_id);
}
