package com.example.examplemod.Scripts.DataLists;

import com.example.examplemod.Scripts.Registrs.HolderBlockVanilla;
import com.example.examplemod.Scripts.Registrs.HolderBlocksFactory;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
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
                    .speedFactor(1.5f)
        );

        // Каменный замшелый кирпич
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "mossy_stone_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(30.0F, 13.0F)
        );
        
        // Заражённые каменные кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "infested_stone_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(25.0F, 12.0F)
        );

        // Заражённые замшелые
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "infested_mossy_stone_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(25.0F, 12.0F)
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
                    .requiresCorrectToolForDrops().strength(25.0F, 12.0F)
        );

        // Потрескавшиеся каменные кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "cracked_stone_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(15.0F, 11.0F)
        );

        // Заражённые потрескавшиеся каменные кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "infested_cracked_stone_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(12.0F, 10.0F)
        );

        // Плита из каменного кирпича
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "stone_brick_slab"),
                properties -> new SlabBlock(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(15.0F, 10.0F)
                    .speedFactor(1.5f)
        );


        // Ступеньки из каменного кирпича
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "stone_brick_stairs"),
                properties -> new StairBlock(
                    Blocks.STONE_BRICKS::defaultBlockState,
                    properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(23F, 13.0F)
                    .speedFactor(1.5f)
        );

        // Ограда из каменного кирпича
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "stone_brick_wall"),
                properties -> new WallBlock(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(25.0F, 12.0F)
        );

        // Ограда из замшелого каменного кирпича
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "mossy_stone_brick_wall"),
                properties -> new WallBlock(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(25.0F, 12.0F)
        );

        // Глина
        // Кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(50.0F, 14.0F)
        );

        // Кирпичная ограда
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "brick_wall"),
                properties -> new WallBlock(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(40.0F, 12.0F)
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
                    .requiresCorrectToolForDrops().strength(25.0F, 11.0F)
        );

        // Ограда из глубинносланцевого кирпича
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "deepslate_brick_wall"),
                properties -> new WallBlock(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(40.0F, 12.0F)
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
                    .requiresCorrectToolForDrops().strength(50.0F, 15f)
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

        // Пурпур
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "purpur_block"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(30.0F, 14.0F)
        );

        // Прочные
        // Красные незерские кирпичи \ незеритовые кирпичи
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "red_nether_bricks"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(80.0F, 1200.0F)
        );

        // Блоки
        // Железный блок
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "iron_block"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(70.0F, 16.0F)
        );

        
        // Золотой блок
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "gold_block"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(60.0F, 15.0F)
        );
        
        // Алмазный блок
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "diamond_block"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(90.0F, 16.0F)
        );
        
        // Незеритовый блок
        holderBlocks.addBlock(
            new ResourceLocation("minecraft", "netherite_block"),
                properties -> new Block(properties),
                properties -> properties
                    .requiresCorrectToolForDrops().strength(1.0F, 1200.0F)
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