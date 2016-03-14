package com.recipes.app;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class RecipeListActivity extends Activity {

    public static final String KEY_RECIPE = "KEY_RECIPE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);
        ListView lvMain = (ListView) findViewById(R.id.lvMain);

        ArrayList<String> selectedIngredients = getIntent().getStringArrayListExtra(MainActivity.KEY_INGREDIENTS);
        final ArrayList<Recipe> chosenRecipes = filter(selectedIngredients);

        if (chosenRecipes.isEmpty()) {
            Toast.makeText(this, "There is no recipe with chosen ingredients",
                    Toast.LENGTH_LONG).show();
        }

        ArrayAdapter<Recipe> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, chosenRecipes);

        lvMain.setAdapter(adapter);
        lvMain.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Recipe recipe = chosenRecipes.get(position);

                Intent intent = new Intent(RecipeListActivity.this, DetailsActivity.class);
                intent.putExtra(KEY_RECIPE, recipe);
                startActivity(intent);
            }
        });
    }

    private ArrayList<Recipe> filter(ArrayList<String> selectedIngredients) {
        ArrayList<Recipe> allRecipeList = RecipeStorage.createRecipes(this);
        ArrayList<Recipe> availableRecipe = new ArrayList<>();
        for (Recipe recipe : allRecipeList) {
            ArrayList<String> recipeIngredients = recipe.getIngredients();
            if (selectedIngredients.size() >= recipeIngredients.size()) {
                boolean in = true;
                for (String curIngredient : recipeIngredients) {
                    if (!selectedIngredients.contains(curIngredient)) {
                        in = false;
                        break;
                    }
                }
                if (in) {
                    availableRecipe.add(recipe);
                }
            }

        }
        return availableRecipe;
    }
}
