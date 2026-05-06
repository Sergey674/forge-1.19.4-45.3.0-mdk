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
        // Инструменты
        holder.registerTool(Items.WOODEN_PICKAXE, new ItemMod(3));
        holder.registerTool(Items.WOODEN_AXE, new ItemMod(3));
        holder.registerTool(Items.WOODEN_SHOVEL, new ItemMod(3));
        holder.registerTool(Items.WOODEN_SWORD, new ItemMod(3));
        holder.registerTool(Items.WOODEN_HOE, new ItemMod(3));

        holder.registerTool(Items.STONE_PICKAXE, new ItemMod(4));
        holder.registerTool(Items.STONE_AXE, new ItemMod(4));
        holder.registerTool(Items.STONE_SHOVEL, new ItemMod(4));
        holder.registerTool(Items.STONE_SWORD, new ItemMod(4));
        holder.registerTool(Items.STONE_HOE, new ItemMod(4));

        holder.registerTool(Items.IRON_PICKAXE, new ItemMod(5));
        holder.registerTool(Items.IRON_AXE, new ItemMod(5));
        holder.registerTool(Items.IRON_SHOVEL, new ItemMod(5));
        holder.registerTool(Items.IRON_SWORD, new ItemMod(5));
        holder.registerTool(Items.IRON_HOE, new ItemMod(5));

        holder.registerTool(Items.DIAMOND_PICKAXE, new ItemMod(6));
        holder.registerTool(Items.DIAMOND_AXE, new ItemMod(6));
        holder.registerTool(Items.DIAMOND_SHOVEL, new ItemMod(6));
        holder.registerTool(Items.DIAMOND_SWORD, new ItemMod(6));
        holder.registerTool(Items.DIAMOND_HOE, new ItemMod(6));

        holder.registerTool(Items.NETHERITE_PICKAXE, new ItemMod(7));
        holder.registerTool(Items.NETHERITE_AXE, new ItemMod(7));
        holder.registerTool(Items.NETHERITE_SHOVEL, new ItemMod(7));
        holder.registerTool(Items.NETHERITE_SWORD, new ItemMod(7));
        holder.registerTool(Items.NETHERITE_HOE, new ItemMod(7));
    }
}
