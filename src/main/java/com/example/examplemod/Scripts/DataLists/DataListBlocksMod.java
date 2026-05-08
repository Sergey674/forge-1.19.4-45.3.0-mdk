package com.example.examplemod.Scripts.DataLists;

import com.example.examplemod.Blocks.BlockMod;
import com.example.examplemod.Scripts.ModSystems.HolderObjectsMod;

import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Blocks;

public class DataListBlocksMod {
    private final HolderObjectsMod holder;

    public DataListBlocksMod(HolderObjectsMod holder) {
        this.holder = holder;
    }

    public void register() {
        // holder.registerBlock(Blocks.GRASS_BLOCK, new BlockMod(2));
        //holder.registerBlock(Blocks.DIRT, new BlockMod(5));
        // holder.registerBlock(Blocks.OAK_LOG, new BlockMod(2));
        // holder.registerBlock(Blocks.STONE, new BlockMod(4));
        holder.registerBlock(Blocks.SUGAR_CANE, new BlockMod(2));
        holder.registerBlock(Blocks.BAMBOO, new BlockMod(2));
        holder.registerBlock(Blocks.KELP, new BlockMod(1));

        holder.registerBlock(Blocks.DARK_OAK_PLANKS, new BlockMod(4));

        holder.registerBlock(Blocks.DARK_OAK_STAIRS, new BlockMod(4));
        holder.registerBlock(Blocks.DARK_OAK_SLAB, new BlockMod(4));

        holder.registerBlock(Blocks.DARK_OAK_FENCE, new BlockMod(4));
        holder.registerBlock(Blocks.DARK_OAK_FENCE_GATE, new BlockMod(4));

        holder.registerBlock(Blocks.DARK_OAK_DOOR, new BlockMod(4));
        holder.registerBlock(Blocks.DARK_OAK_TRAPDOOR, new BlockMod(4));

        holder.registerBlock(Blocks.DARK_OAK_PRESSURE_PLATE, new BlockMod(3));
        holder.registerBlock(Blocks.DARK_OAK_BUTTON, new BlockMod(3));

        holder.registerBlock(Blocks.DARK_OAK_SIGN, new BlockMod(4));
        holder.registerBlock(Blocks.DARK_OAK_WALL_SIGN, new BlockMod(4));

        holder.registerBlock(Blocks.DARK_OAK_HANGING_SIGN, new BlockMod(3));
        holder.registerBlock(Blocks.DARK_OAK_WALL_HANGING_SIGN, new BlockMod(3));

        //holder.registerBlock(Blocks.Dark_OAK_B, new BlockMod(4)); // если поддерживается твоей системой

        holder.registerBlock(Blocks.DARK_OAK_LOG, new BlockMod(4));
        holder.registerBlock(Blocks.DARK_OAK_WOOD, new BlockMod(4));

        // Багровые доски и производные
        holder.registerBlock(Blocks.CRIMSON_PLANKS, new BlockMod(4));

        holder.registerBlock(Blocks.CRIMSON_STAIRS, new BlockMod(4));
        holder.registerBlock(Blocks.CRIMSON_SLAB, new BlockMod(4));

        holder.registerBlock(Blocks.CRIMSON_FENCE, new BlockMod(4));
        holder.registerBlock(Blocks.CRIMSON_FENCE_GATE, new BlockMod(4));

        holder.registerBlock(Blocks.CRIMSON_DOOR, new BlockMod(4));
        holder.registerBlock(Blocks.CRIMSON_TRAPDOOR, new BlockMod(4));

        holder.registerBlock(Blocks.CRIMSON_PRESSURE_PLATE, new BlockMod(3));
        holder.registerBlock(Blocks.CRIMSON_BUTTON, new BlockMod(3));

        holder.registerBlock(Blocks.CRIMSON_SIGN, new BlockMod(4));
        holder.registerBlock(Blocks.CRIMSON_WALL_SIGN, new BlockMod(4));

        holder.registerBlock(Blocks.CRIMSON_HANGING_SIGN, new BlockMod(3));
        holder.registerBlock(Blocks.CRIMSON_WALL_HANGING_SIGN, new BlockMod(4));

        // Стебли
        holder.registerBlock(Blocks.CRIMSON_STEM, new BlockMod(4));
        holder.registerBlock(Blocks.CRIMSON_HYPHAE, new BlockMod(4));

        holder.registerBlock(Blocks.STRIPPED_CRIMSON_STEM, new BlockMod(4));
        holder.registerBlock(Blocks.STRIPPED_CRIMSON_HYPHAE, new BlockMod(4));

        // Искажённые доски и производные
        holder.registerBlock(Blocks.WARPED_PLANKS, new BlockMod(4));

        holder.registerBlock(Blocks.WARPED_STAIRS, new BlockMod(4));
        holder.registerBlock(Blocks.WARPED_SLAB, new BlockMod(4));

        holder.registerBlock(Blocks.WARPED_FENCE, new BlockMod(4));
        holder.registerBlock(Blocks.WARPED_FENCE_GATE, new BlockMod(4));

        holder.registerBlock(Blocks.WARPED_DOOR, new BlockMod(4));
        holder.registerBlock(Blocks.WARPED_TRAPDOOR, new BlockMod(4));

        holder.registerBlock(Blocks.WARPED_PRESSURE_PLATE, new BlockMod(4));
        holder.registerBlock(Blocks.WARPED_BUTTON, new BlockMod(4));

        holder.registerBlock(Blocks.WARPED_SIGN, new BlockMod(4));
        holder.registerBlock(Blocks.WARPED_WALL_SIGN, new BlockMod(4));

        holder.registerBlock(Blocks.WARPED_HANGING_SIGN, new BlockMod(4));
        holder.registerBlock(Blocks.WARPED_WALL_HANGING_SIGN, new BlockMod(4));

        // Стебли
        holder.registerBlock(Blocks.WARPED_STEM, new BlockMod(4));
        holder.registerBlock(Blocks.WARPED_HYPHAE, new BlockMod(4));

        holder.registerBlock(Blocks.STRIPPED_WARPED_STEM, new BlockMod(4));
        holder.registerBlock(Blocks.STRIPPED_WARPED_HYPHAE, new BlockMod(4));

        holder.registerBlock(Blocks.STRIPPED_DARK_OAK_LOG, new BlockMod(4));
        holder.registerBlock(Blocks.STRIPPED_DARK_OAK_WOOD, new BlockMod(4));

        holder.registerBlock(Blocks.CHORUS_FLOWER, new BlockMod(4));
        holder.registerBlock(Blocks.CHORUS_PLANT, new BlockMod(5));

        holder.registerBlock(Blocks.STONE_PRESSURE_PLATE, new BlockMod(3));

        //Земля
        holder.registerBlock(Blocks.GRAVEL, new BlockMod(3));
        holder.registerBlock(Blocks.SOUL_SAND, new BlockMod(4));
        holder.registerBlock(Blocks.SOUL_SOIL, new BlockMod(4));

        // Сланец
        holder.registerBlock(Blocks.DEEPSLATE, new BlockMod(5));
        holder.registerBlock(Blocks.COBBLED_DEEPSLATE, new BlockMod(5));
        holder.registerBlock(Blocks.COBBLED_DEEPSLATE_SLAB, new BlockMod(5));
        holder.registerBlock(Blocks.COBBLED_DEEPSLATE_STAIRS, new BlockMod(5));
        holder.registerBlock(Blocks.COBBLED_DEEPSLATE_WALL, new BlockMod(5));

        holder.registerBlock(Blocks.POLISHED_DEEPSLATE, new BlockMod(5));
        holder.registerBlock(Blocks.POLISHED_DEEPSLATE_SLAB, new BlockMod(5));
        holder.registerBlock(Blocks.POLISHED_DEEPSLATE_STAIRS, new BlockMod(5));
        holder.registerBlock(Blocks.POLISHED_DEEPSLATE_WALL, new BlockMod(5));

        holder.registerBlock(Blocks.DEEPSLATE_BRICKS, new BlockMod(5));
        holder.registerBlock(Blocks.DEEPSLATE_BRICK_SLAB, new BlockMod(5));
        holder.registerBlock(Blocks.DEEPSLATE_BRICK_STAIRS, new BlockMod(5));
        holder.registerBlock(Blocks.DEEPSLATE_BRICK_WALL, new BlockMod(5));

        holder.registerBlock(Blocks.CRACKED_DEEPSLATE_BRICKS, new BlockMod(5));

        holder.registerBlock(Blocks.DEEPSLATE_TILES, new BlockMod(5));
        holder.registerBlock(Blocks.DEEPSLATE_TILE_SLAB, new BlockMod(5));
        holder.registerBlock(Blocks.DEEPSLATE_TILE_STAIRS, new BlockMod(5));
        holder.registerBlock(Blocks.DEEPSLATE_TILE_WALL, new BlockMod(5));

        holder.registerBlock(Blocks.CRACKED_DEEPSLATE_TILES, new BlockMod(5));
        holder.registerBlock(Blocks.CHISELED_DEEPSLATE, new BlockMod(5));
        holder.registerBlock(Blocks.REINFORCED_DEEPSLATE, new BlockMod(5));

        holder.registerBlock(Blocks.DEEPSLATE_IRON_ORE, new BlockMod(6));
        holder.registerBlock(Blocks.DEEPSLATE_GOLD_ORE, new BlockMod(6)); 
        holder.registerBlock(Blocks.DEEPSLATE_EMERALD_ORE, new BlockMod(6));
        holder.registerBlock(Blocks.DEEPSLATE_COAL_ORE, new BlockMod(5)); 
        holder.registerBlock(Blocks.DEEPSLATE_COPPER_ORE, new BlockMod(5));
        holder.registerBlock(Blocks.DEEPSLATE_LAPIS_ORE, new BlockMod(5));
        holder.registerBlock(Blocks.DEEPSLATE_REDSTONE_ORE, new BlockMod(5));

        holder.registerBlock(Blocks.BLACKSTONE, new BlockMod(5));
        holder.registerBlock(Blocks.BLACKSTONE_SLAB, new BlockMod(5));
        holder.registerBlock(Blocks.BLACKSTONE_STAIRS, new BlockMod(5));
        holder.registerBlock(Blocks.BLACKSTONE_WALL, new BlockMod(5));

        holder.registerBlock(Blocks.POLISHED_BLACKSTONE, new BlockMod(5));
        holder.registerBlock(Blocks.POLISHED_BLACKSTONE_BRICKS, new BlockMod(5));
        holder.registerBlock(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB, new BlockMod(5));
        holder.registerBlock(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS, new BlockMod(5));
        holder.registerBlock(Blocks.POLISHED_BLACKSTONE_BRICK_WALL, new BlockMod(5));

        holder.registerBlock(Blocks.DEEPSLATE_GOLD_ORE, new BlockMod(4));
        
        holder.registerBlock(Blocks.GOLD_ORE, new BlockMod(4));
    }
}
