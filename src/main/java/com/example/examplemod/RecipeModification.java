package com.example.examplemod;


import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.item.crafting.*;
import net.minecraftforge.event.OnDatapackSyncEvent;
import net.minecraftforge.event.server.ServerStartedEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.lang.reflect.Field;
import java.util.*;

@Mod.EventBusSubscriber(modid = "examplemod")
public class RecipeModification {

    private static List<Recipe<?>> preparedRecipes = null;

     //Слушатель события для модификации рецептов при запуске сервера
    @SubscribeEvent
    public static void onServerStarted(ServerStartingEvent event) {
        RecipeManager recipeManager = event.getServer().getRecipeManager();
        preparedRecipes = new ArrayList<>(recipeManager.getRecipes());

        // Указываем идентификатор рецепта, который хотим удалить
        ResourceLocation raw_iron1ToRemove = new ResourceLocation("minecraft", "iron_ingot_from_smelting_raw_iron"); // Пример: палки
        ResourceLocation raw_iron2ToRemove = new ResourceLocation("minecraft", "iron_ingot_from_blasting_raw_iron");
        ResourceLocation stone_pickaxeToRemove = new ResourceLocation("minecraft", "stone_pickaxe");

        // Удаление рецептов
        removeRecipe(raw_iron1ToRemove);
        removeRecipe(raw_iron2ToRemove);
        removeRecipe(stone_pickaxeToRemove);

        //Обновление рецептов stone_pickaxe
        updateRecipe(recipeManager);

        printListRecipes(recipeManager);
    }

    private static void removeRecipe(ResourceLocation recipeId) {
        // Удаляем только рецепт переплавки для предмета "stick"
        preparedRecipes.removeIf(recipe -> recipe.getId().equals(recipeId) );
    }

    private static void updateRecipe(RecipeManager recipeManager)
    {
        if (preparedRecipes != null)
            recipeManager.replaceRecipes(preparedRecipes);
    }

    private static void printRecipeInfo(Recipe<?> recipe) {
        ResourceLocation recipeId = recipe.getId();
        String recipeType = recipe.getType().toString(); // Получаем тип рецепта

        // Проверяем, является ли рецепт ShapedRecipe
        if (recipe instanceof ShapedRecipe shapedRecipe) {
            System.out.println("Form: " + shapedRecipe.getWidth() + "x" + shapedRecipe.getHeight());
            System.out.println("Ingredient:");

            // Получаем ингредиенты
            for (Ingredient ingredient : shapedRecipe.getIngredients()) {
                System.out.println("" + ingredient.toJson());

            }
        }
        System.out.println();

    }

    private static  void printListRecipes(RecipeManager recipeManager)
    {
        ResourceLocation recipeToPrint = new ResourceLocation("minecraft", "stone_pickaxe");
        Recipe<?> recipeTMP = null;

        System.out.println();
        System.out.println("recipes list: ");
        // Проходим по всем рецептам
        for (Recipe<?> recipe : recipeManager.getRecipes()) {
            ResourceLocation recipeId = recipe.getId();

            System.out.println();
            System.out.println("ID: " + recipeId);
            //System.out.println("Тип рецепта: " + recipeType);

            if(recipeId.equals(recipeToPrint))
                recipeTMP = recipe;
        }

        if(recipeTMP != null)
            printRecipeInfo(recipeTMP);
    }
}
