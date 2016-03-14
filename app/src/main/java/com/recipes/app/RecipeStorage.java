package com.recipes.app;

import android.content.Context;

import java.util.ArrayList;

public class RecipeStorage {
    public static ArrayList<Recipe> createRecipes(Context context) {
        ArrayList<Recipe> recipeList = new ArrayList<>();
        //1
        Recipe recipe1 = new Recipe();
        recipe1.setTitle("Puree");
        ArrayList<String> need1 = new ArrayList<>();
        need1.add(context.getResources().getString(R.string.str_potato));
        recipe1.setIngredients(need1);
        recipe1.setImage(R.drawable.puree);
        recipe1.setTutorial(context.getResources().getString(R.string.tutorialPuree));
        //2
        Recipe recipe2 = new Recipe();
        recipe2.setTitle("Baked Pecorino Chicken");
        ArrayList<String> need2 = new ArrayList<>();
        need2.add(context.getResources().getString(R.string.str_bread));
        need2.add(context.getResources().getString(R.string.str_butter));
        need2.add(context.getResources().getString(R.string.str_chickenBreasts));
        need2.add(context.getResources().getString(R.string.str_swissChard));
        recipe2.setIngredients(need2);
        recipe2.setImage(R.drawable.bakedpecorinochicken);
        recipe2.setTutorial(context.getResources().getString(R.string.tutorialBakedPecorinoChicken));
        //3
        Recipe recipe3 = new Recipe();
        recipe3.setTitle("Rocket beans");
        ArrayList<String> need3 = new ArrayList<>();
        need3.add(context.getResources().getString(R.string.str_bacon));
        need3.add(context.getResources().getString(R.string.str_butter));
        need3.add(context.getResources().getString(R.string.str_garlic));
        need3.add(context.getResources().getString(R.string.str_arugula));
        need3.add(context.getResources().getString(R.string.str_lemon));
        recipe3.setIngredients(need3);
        recipe3.setImage(R.drawable.bakedpecorinochicken);
        recipe3.setTutorial(context.getResources().getString(R.string.tutorialBakedPecorinoChicken));
        //4
        Recipe recipe4 = new Recipe();
        recipe4.setTitle("Bacon Feta Beans");
        ArrayList<String> need4 = new ArrayList<>();
        need4.add(context.getResources().getString(R.string.str_bacon));
        need4.add(context.getResources().getString(R.string.str_beans));
        need4.add(context.getResources().getString(R.string.str_garlic));
        need4.add(context.getResources().getString(R.string.str_fetaCheese));
        need4.add(context.getResources().getString(R.string.str_onion));
        recipe4.setIngredients(need4);
        recipe4.setImage(R.drawable.baconfetabeans);
        recipe4.setTutorial(context.getResources().getString(R.string.tutorialBaconFetaBeans));
        //5
        Recipe recipe5 = new Recipe();
        recipe5.setTitle("Potato Pancakes");
        ArrayList<String> need5 = new ArrayList<>();
        need5.add(context.getResources().getString(R.string.str_egg));
        need5.add(context.getResources().getString(R.string.str_potato));
        need5.add(context.getResources().getString(R.string.str_onion));
        need5.add(context.getResources().getString(R.string.str_butter));
        recipe5.setIngredients(need5);
        recipe5.setImage(R.drawable.potatopancakes);
        recipe5.setTutorial(context.getResources().getString(R.string.tutorialPotatoPancakes));
        //end
        recipeList.add(recipe1);
        recipeList.add(recipe2);
        recipeList.add(recipe3);
        recipeList.add(recipe4);
        recipeList.add(recipe5);

        return recipeList;
    }
}
