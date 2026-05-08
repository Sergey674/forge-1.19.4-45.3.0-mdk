package com.example.examplemod;

import com.example.examplemod.Scripts.ModCreativeTabs;
import com.example.examplemod.Scripts.DataLists.DataBlockListVanilla;
import com.example.examplemod.Scripts.DataLists.DataBlocksList;
import com.example.examplemod.Scripts.DataLists.DataListBlocksMod;
import com.example.examplemod.Scripts.DataLists.DataListItemsMod;
import com.example.examplemod.Scripts.DataLists.DataListRankTegs;
import com.example.examplemod.Scripts.DataLists.HolderResourceList;
import com.example.examplemod.Scripts.ModSystems.HolderObjectsMod;
import com.example.examplemod.Scripts.ModSystems.HardnessScripts.HardnessConfig;
import com.example.examplemod.Scripts.ModSystems.HardnessScripts.StrengthHandler;
import com.example.examplemod.Scripts.ReciptsScripts.RecipeRemover;
import com.example.examplemod.Scripts.Registrs.ObjectsModifier;
import com.example.examplemod.Scripts.Registrs.BlocksModifierDeferred;
import com.example.examplemod.Scripts.Registrs.HolderBlocksFactory;
import com.example.examplemod.Scripts.Registrs.HolderItemsFactory;
import com.example.examplemod.Scripts.Registrs.ItemsModiferDeferred;
import com.example.examplemod.Scripts.Services.ISourceFactory;
import com.example.examplemod.Scripts.Services.ISourceResources;
import com.mojang.logging.LogUtils;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.Tags;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.entity.player.EntityItemPickupEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.util.ObfuscationReflectionHelper;
import net.minecraftforge.registries.ForgeRegistries;

import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ExampleMod.MODID)
public class ExampleMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "examplemod";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    private ObjectsModifier blocksModifierVanila;
    private ISourceFactory<Block> holderBlocksVanilla;
    private ObjectsModifier blocksModifier;
    private ISourceFactory<Block> holderBlocks;
    private HolderItemsFactory holderItemsFactory;
    public ItemsModiferDeferred itemsModiferDeferred;

    DataListBlocksMod dataBlocks;
    DataListItemsMod dataItems;
    DataListRankTegs dataListRankTegs;

    public ExampleMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        //ItemsTest.ITEMS.register(modEventBus);
        //BlocksTest.BLOCKS.register(modEventBus);

        //ItemsVanilla.ITEMS.register(modEventBus);
        //BlocksVanilla.BLOCKS.register(modEventBus);

        //DataBlocksList dataBlocksList = new DataBlocksList();
        DataBlockListVanilla dataBlocksListVanilla = new DataBlockListVanilla();

        //blocksModifier = new BlocksModifierDeferred(modEventBus);
        blocksModifierVanila = new BlocksModifierDeferred(modEventBus);
        itemsModiferDeferred = new ItemsModiferDeferred(modEventBus);

        //holderBlocks = dataBlocksList.getHolderBlocks();
        holderBlocksVanilla = dataBlocksListVanilla.getHolderBlocks();
        holderItemsFactory = new HolderItemsFactory(blocksModifierVanila);

        registeredBlocks();
        
//      // Register the Deferred Register to the mod event bus so blocks get registered
 //     BLOCKS.register(modEventBus);
//      // Register the Deferred Register to the mod event bus so items get registered
//      ITEMS.register(modEventBus);

        RecipeRemover recipeRemover = new RecipeRemover(new HolderResourceList());
      
        MinecraftForge.EVENT_BUS.register(this);
        MinecraftForge.EVENT_BUS.register(recipeRemover);

        // В конструкторе мода:
        HolderObjectsMod holderObjectsMod = new HolderObjectsMod();
        HardnessConfig config = new HardnessConfig();

        StrengthHandler strengthHandler = new StrengthHandler(holderObjectsMod, config);
        MinecraftForge.EVENT_BUS.register(strengthHandler);

        dataListRankTegs = new DataListRankTegs(holderObjectsMod);
        dataBlocks = new DataListBlocksMod(holderObjectsMod);
        dataItems = new DataListItemsMod(holderObjectsMod);

        // modEventBus.addListener((FMLCommonSetupEvent event) -> {

        // });

        // Register the item to a creative tab
        modEventBus.addListener(itemsModiferDeferred::addCreative);
    }

    private void registeredBlocks(){
        String id_mincraft = "minecraft";
        String id_mod = ExampleMod.MODID;

        //blocksModifier.register(holderBlocks, id_mod);
        blocksModifierVanila.register(holderBlocksVanilla, id_mincraft);
        itemsModiferDeferred.register(holderItemsFactory, id_mod);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        // event.enqueueWork(() -> {
        //     // Получаем новый объект кирпича из реестра
        //     Block newBricks = ForgeRegistries.BLOCKS.getValue(
        //         new ResourceLocation("minecraft", "bricks"));
            
        //     // Заменяем иконку
        //     CreativeModeTabs.BUILDING_BLOCKS.iconItemStack = 
        //         new ItemStack(newBricks);
        // });
    }


    private void addCreative(CreativeModeTabEvent.BuildContents event)
    {
        if (event.getTab() == ModCreativeTabs.test_tab) {
            //event.accept(ItemsTest.ITEM1);
            //event.accept(ItemsModiferDeferred.registryItem);
            //event.accept(ItemsTest.ITEM2_BLOCK1);
        }

//        if(event.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
//
//        }
    }

    public void pickupItem(EntityItemPickupEvent event) {
        System.out.println("Item picked up!");
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        ServerLevel level = event.getServer().overworld();

        dataListRankTegs.register(level);

        dataBlocks.register();
        dataItems.register();

            Block block = ForgeRegistries.BLOCKS.getValue(
        new ResourceLocation("minecraft", "bricks"));
    
        if (block != null) {
            // Безопасная рефлексия через Forge
            ObfuscationReflectionHelper.setPrivateValue(
                BlockBehaviour.class,
                block,
                6.0F,
                "explosionResistance"  // имя поля в Mojang mappings
            );
            
            for (BlockState state : block.getStateDefinition().getPossibleStates()) {
                ObfuscationReflectionHelper.setPrivateValue(
                    BlockBehaviour.BlockStateBase.class,
                    state,
                    50.0F,
                    "destroySpeed"
                );
            }
        }
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            // Some client setup code
//            LOGGER.info("HELLO FROM CLIENT SETUP");
//            LOGGER.info("MINECRAFT NAME >> {}", Minecraft.getInstance().getUser().getName());
        }
    }
}
