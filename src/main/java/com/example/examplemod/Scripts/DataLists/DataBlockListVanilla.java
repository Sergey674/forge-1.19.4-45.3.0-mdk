package com.example.examplemod.Scripts.DataLists;

import com.example.examplemod.Scripts.Registrs.HolderBlockVanilla;
import com.example.examplemod.Scripts.Registrs.HolderBlocksFactory;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;


public class DataBlockListVanilla {
    private HolderBlocksFactory holderBlocks;
    
    public HolderBlocksFactory getHolderBlocks() {
        
        // Камень
        // Каменный кирпич
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "stone_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(30.0F, 14.0F)
        );

        // Каменный замшелый кирпич
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "mossy_stone_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(30.0F, 14.0F)
        );
        
        // Заражённые каменные кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "infested_stone_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(25.0F, 14.0F)
        );

        // Заражённые замшелые
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "infested_mossy_stone_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(25.0F, 14.0F)
        );


        // Резные каменные кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "chiseled_stone_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(30.0F, 14.0F)
        );

        // Заражённые резные каменные кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "infested_chiseled_stone_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(25.0F, 14.0F)
        );

        // Потрескавшиеся каменные кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "cracked_stone_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(15.0F, 14.0F)
        );

        // Заражённые потрескавшиеся каменные кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "infested_cracked_stone_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(12.0F, 14.0F)
        );

        // Плита из каменного кирпича
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "stone_brick_slab"),
                properties -> new SlabBlock(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(15.0F, 14.0F)
                    .speedFactor(1.5f)
        );

        // Плита из замшелого каменного кирпича
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "mossy_stone_brick_slab"),
                properties -> new SlabBlock(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(15.0F, 14.0F)
                    .speedFactor(1.5f)
        );


        // Ступеньки из каменного кирпича
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "stone_brick_stairs"),
                properties -> new StairBlock(
                    Blocks.STONE_BRICKS::defaultBlockState,
                    properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(22.5F, 14.0F)
                    .speedFactor(1.5f)
        );

        // Ограда из каменного кирпича
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "stone_brick_wall"),
                properties -> new WallBlock(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(25.0F, 14.0F)
        );

        // Ограда из замшелого каменного кирпича
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "mossy_stone_brick_wall"),
                properties -> new WallBlock(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(25.0F, 14.0F)
        );

        // Глина
        // Кирпичи
        // holderBlocks.addBlock(
        //     new ResourceLocation("minecraft", "bricks"),
        //         properties -> new Block(properties),
        //         properties -> properties
        //             .requiresCorrectToolForDrops().strength(50.0F, 14.0F)
        // );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "brick_slab"),
            properties -> new SlabBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(25.0F, 14.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "brick_stairs"),
            properties -> new StairBlock(() -> Blocks.BRICKS.defaultBlockState(), properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(37.5F, 14.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "brick_wall"),
            properties -> new WallBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(40.0F, 14.0F)
        );

        // Сланец
        // Глубинносланцевые кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "deepslate_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(50.0F, 14.0F)
        );

        // Потрескавшиеся глубинносланцевые кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "cracked_deepslate_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(25.0F, 14.0F)
        );

        // Ограда из глубинносланцевого кирпича
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "deepslate_brick_wall"),
                properties -> new WallBlock(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(40.0F, 14.0F)
        );


        // Призмариновые кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "prismarine_bricks"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(50.0F, 14.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "prismarine_brick_slab"),
            properties -> new SlabBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(25.0F, 14.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "prismarine_brick_stairs"),
            properties -> new StairBlock(() -> Blocks.PRISMARINE_BRICKS.defaultBlockState(), properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(37.5F, 14.0F)
        );

        // Тёмный призмарин
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "dark_prismarine"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(50.0F, 14.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "dark_prismarine_slab"),
            properties -> new SlabBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(25.0F, 14.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "dark_prismarine_stairs"),
            properties -> new StairBlock(() -> Blocks.DARK_PRISMARINE.defaultBlockState(), properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(37.5F, 14.0F)
        );


        // Незерак
        // Незерские кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "nether_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(30.0F, 15.0F)
        );

        // Резные незерские кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "chiseled_nether_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(30.0F, 15f)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "cracked_nether_bricks"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(15.0F, 15f)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "nether_brick_slab"),
            properties -> new SlabBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(15.0F, 15.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "nether_brick_stairs"),
            properties -> new StairBlock(() -> Blocks.NETHER_BRICKS.defaultBlockState(), properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(22.5F, 15.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "nether_brick_wall"),
            properties -> new WallBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(24.0F, 15.0F)
        );

        // Чернит
        // Полированно-чернитные кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "polished_blackstone_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(50.0F, 16.0F)
        );

        // Энд
        // Эндерняковые кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "end_stone_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(30.0F, 14.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "end_stone_brick_slab"),
            properties -> new SlabBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(15.0F, 14.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "end_stone_brick_stairs"),
            properties -> new StairBlock(() -> Blocks.END_STONE_BRICKS.defaultBlockState(), properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(22.5F, 14.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "end_stone_brick_wall"),
            properties -> new WallBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(24.0F, 14.0F)
        );

        // Пурпур
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "purpur_block"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(30.0F, 14.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "purpur_stairs"),
                properties -> new StairBlock(
                    Blocks.PURPUR_STAIRS::defaultBlockState,
                    properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(22.5F, 14.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "purpur_slab"),
                properties -> new SlabBlock(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(15.0F, 14.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "purpur_pillar"),
                properties -> new RotatedPillarBlock(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(30.0F, 14.0F)
        );


        // Прочные
        // Красные незерские кирпичи \ незеритовые кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "red_nether_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(90.0F, 1200.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "cracked_red_nether_bricks"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(45.0F, 1200.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "red_nether_brick_slab"),
            properties -> new SlabBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(45.0F, 1200.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "red_nether_brick_stairs"),
            properties -> new StairBlock(() -> Blocks.RED_NETHER_BRICKS.defaultBlockState(), properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(67.5F, 1200.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "red_nether_brick_wall"),
            properties -> new WallBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(72.0F, 1200.0F)
        );

        // Блоки
        // Железный блок
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "iron_block"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(70.0F, 17.0F)
        );

        // Медные блоки
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "copper_block"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "cut_copper"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "cut_copper_slab"),
            properties -> new SlabBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(15.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "cut_copper_stairs"),
            properties -> new StairBlock(() -> Blocks.CUT_COPPER.defaultBlockState(), properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(22.5F, 16.0F)
        );

        // Открытая медь
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "exposed_copper"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "exposed_cut_copper"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "exposed_cut_copper_slab"),
            properties -> new SlabBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(15.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "exposed_cut_copper_stairs"),
            properties -> new StairBlock(() -> Blocks.EXPOSED_CUT_COPPER.defaultBlockState(), properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(22.5F, 16.0F)
        );

        // Потемневшая медь
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "weathered_copper"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "weathered_cut_copper"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "weathered_cut_copper_slab"),
            properties -> new SlabBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(15.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "weathered_cut_copper_stairs"),
            properties -> new StairBlock(() -> Blocks.WEATHERED_CUT_COPPER.defaultBlockState(), properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(22.5F, 16.0F)
        );

        // Окисленная медь
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "oxidized_copper"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "oxidized_cut_copper"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "oxidized_cut_copper_slab"),
            properties -> new SlabBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(15.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "oxidized_cut_copper_stairs"),
            properties -> new StairBlock(() -> Blocks.OXIDIZED_CUT_COPPER.defaultBlockState(), properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(22.5F, 16.0F)
        );

        // Вощёная медь
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_copper_block"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_cut_copper"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_cut_copper_slab"),
            properties -> new SlabBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(15.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_cut_copper_stairs"),
            properties -> new StairBlock(() -> Blocks.WAXED_CUT_COPPER.defaultBlockState(), properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(22.5F, 16.0F)
        );

        // Вощёная открытая медь
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_exposed_copper"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_exposed_cut_copper"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_exposed_cut_copper_slab"),
            properties -> new SlabBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(15.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_exposed_cut_copper_stairs"),
            properties -> new StairBlock(() -> Blocks.WAXED_EXPOSED_CUT_COPPER.defaultBlockState(), properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(22.5F, 16.0F)
        );

        // Вощёная потемневшая медь
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_weathered_copper"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_weathered_cut_copper"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_weathered_cut_copper_slab"),
            properties -> new SlabBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(15.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_weathered_cut_copper_stairs"),
            properties -> new StairBlock(() -> Blocks.WAXED_WEATHERED_CUT_COPPER.defaultBlockState(), properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(22.5F, 16.0F)
        );

        // Вощёная окисленная медь
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_oxidized_copper"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_oxidized_cut_copper"),
            properties -> new Block(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(30.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_oxidized_cut_copper_slab"),
            properties -> new SlabBlock(properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(15.0F, 16.0F)
        );

        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "waxed_oxidized_cut_copper_stairs"),
            properties -> new StairBlock(() -> Blocks.WAXED_OXIDIZED_CUT_COPPER.defaultBlockState(), properties),
            properties -> properties
                .requiresCorrectToolForDrops().strength(22.5F, 16.0F)
        );

        
        // Золотой блок
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "gold_block"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(60.0F, 17.0F)
        );
        
        // Алмазный блок
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "diamond_block"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(90.0F, 17.0F)
        );
        
        // Незеритовый блок
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "netherite_block"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(120.0F, 1200.0F)
        );
        
        
        return holderBlocks;
    }

    public DataBlockListVanilla() {
        holderBlocks = new HolderBlockVanilla();
    }
    
    public DataBlockListVanilla(HolderBlockVanilla holder){
        holderBlocks = holder;
    }
}