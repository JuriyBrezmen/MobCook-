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
        need1.add(context.getResources().getString(R.string.str_milk));
        recipe1.setIngredients(need1);
        recipe1.setImage(R.drawable.puree);
        recipe1.setTutorial(context.getResources().getString(R.string.tutorialPuree));
        //2
        Recipe recipe2 = new Recipe();
        recipe2.setTitle("Milk");
        ArrayList<String> need2 = new ArrayList<>();
        need2.add(context.getResources().getString(R.string.str_milk));
        recipe2.setIngredients(need2);
        recipe2.setImage(R.drawable.puree);
        recipe2.setTutorial(context.getResources().getString(R.string.tutorialPuree));
        //end
        recipeList.add(recipe1);
        recipeList.add(recipe2);

        return recipeList;
    }
}
