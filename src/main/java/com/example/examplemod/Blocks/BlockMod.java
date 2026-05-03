package com.example.examplemod.Blocks;

public class BlockMod {
    protected String typeBlock = "Block";

    protected int hardnessRank = 2;
    
    public BlockMod(int hardnessRank) {
        this.hardnessRank = hardnessRank;
    }

    public int setHardnessRank() {
        return hardnessRank;
    }

    public int getHardnessRank() {
        return hardnessRank;
    }

    public String getTypeBlock() {
        return typeBlock;
    }

    public static BlockMod getOfDefault() {
        return new BlockMod(0);
    }
}
