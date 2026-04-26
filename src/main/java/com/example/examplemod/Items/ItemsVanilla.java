package com.example.examplemod.Items;

import com.example.examplemod.Blocks.BlocksTest;
import com.example.examplemod.Blocks.BlocksVanilla;
import com.example.examplemod.ExampleMod;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemsVanilla {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MODID);

    public static final RegistryObject<Item> STONE_BRICKS = ITEMS.register("stone_bricks", () -> new BlockItem(BlocksVanilla.STONE_BRICKS.get(), new Item.Properties()));
}
