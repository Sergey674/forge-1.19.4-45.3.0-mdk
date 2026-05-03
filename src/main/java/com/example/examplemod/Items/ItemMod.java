package com.example.examplemod.Items;

import com.example.examplemod.Blocks.BlockMod;

public class ItemMod {
    protected String typeItem = "Item";

    protected int hardnessRank = 2;
    
    public ItemMod(int hardnessRank) {
        this.hardnessRank = hardnessRank;
    }

    public int getHardnessRank() {
        return hardnessRank;
    }

    public String getTypeItem() {
        return typeItem;
    }

    public static ItemMod getOfDefault() {
        return new ItemMod(2);
    }
}
