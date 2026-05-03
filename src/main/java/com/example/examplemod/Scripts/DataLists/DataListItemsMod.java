package com.example.examplemod.Scripts.DataLists;

import com.example.examplemod.Blocks.BlockMod;
import com.example.examplemod.Items.ItemMod;
import com.example.examplemod.Scripts.ModSystems.HolderObjectsMod;

import net.minecraft.world.item.Items;

public class DataListItemsMod {
    private final HolderObjectsMod holder;

    public DataListItemsMod(HolderObjectsMod holder) {
        this.holder = holder;
    }

    public void register() {
        holder.registerTool(Items.WOODEN_PICKAXE, new ItemMod(3));

        // Инструменты
        holder.registerTool(Items.WOODEN_PICKAXE, new ItemMod(3));
        holder.registerTool(Items.WOODEN_AXE, new ItemMod(3));
        holder.registerTool(Items.WOODEN_SHOVEL, new ItemMod(3));
        holder.registerTool(Items.STONE_PICKAXE, new ItemMod(4));
        holder.registerTool(Items.IRON_PICKAXE, new ItemMod(5));
        holder.registerTool(Items.DIAMOND_PICKAXE, new ItemMod(6));
    }
}
