package com.recipes.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class DetailsActivity extends Activity {
    private TextView title;
    private ImageView image;
    private TextView tutorial;
    private TextView ingredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.details_activity);

        title = (TextView) findViewById(R.id.recipe_title);
        tutorial = (TextView) findViewById(R.id.recipe_tutorial);
        ingredients = (TextView) findViewById(R.id.recipe_ingredients);
        image = (ImageView) findViewById(R.id.recipe_image);


        Recipe recipe = (Recipe) getIntent().getParcelableExtra(RecipeListActivity.KEY_RECIPE);  //приймаєм


        title.setText(recipe.getTitle());
        image.setImageResource(recipe.getImage());
        tutorial.setText(recipe.getTutorial());
        ArrayList ingredientsList = recipe.getIngredients();
        String s = "";
        for (int i = 0; i < ingredientsList.size(); i++) {
            s +=  ingredientsList.get(i) + "\n" ;
          }

        ingredients.setText(s);
        }
    }
