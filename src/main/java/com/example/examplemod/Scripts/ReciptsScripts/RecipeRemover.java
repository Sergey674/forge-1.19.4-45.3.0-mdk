package com.example.examplemod.Scripts.ReciptsScripts;


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

import com.example.examplemod.Scripts.ReciptsScripts.ResourceScripts.HolderResource;

@Mod.EventBusSubscriber(modid = "examplemod")
public class RecipeRemover {

    //private List<Recipe<?>> preparedRecipes = null;
    private List<ResourceLocation> removeResources;


    public RecipeRemover(HolderResource holderResource){
        removeResources = holderResource.getResource();
    }

     //Слушатель события для модификации рецептов при запуске сервера
    @SubscribeEvent
    public void onServerStarted(ServerStartingEvent event) {
        RecipeManager recipeManager = event.getServer().getRecipeManager();
        List<Recipe<?>> preparedRecipes = new ArrayList<>(recipeManager.getRecipes());
        
        // Удаление рецептов
        removesRecipes(preparedRecipes);

        //Обновление рецептов
        updateRecipe(recipeManager, preparedRecipes);
        printListRecipes(recipeManager);
    }

    private void removesRecipes(List<Recipe<?>> preparedRecipes) {
        for (ResourceLocation recipeId : removeResources) {
            preparedRecipes.removeIf(recipe -> recipe.getId().equals(recipeId) );
        }
        
    }

    private void updateRecipe(RecipeManager recipeManager, List<Recipe<?>> preparedRecipes)
    {
        if (preparedRecipes != null)
            recipeManager.replaceRecipes(preparedRecipes);
    }

    private void printRecipeInfo(Recipe<?> recipe) {
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

    private void printListRecipes(RecipeManager recipeManager)
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