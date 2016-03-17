package com.recipes.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {
    public static final String KEY_INGREDIENTS = "Ingredients";
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;
    private CheckBox checkBox6;
    private CheckBox checkBox7;
    private CheckBox checkBox8;
    private CheckBox checkBox9;
    private CheckBox checkBox10;
    private CheckBox checkBox11;
    private CheckBox checkBox12;
    private CheckBox checkBox13;
    private CheckBox checkBox14;
    private CheckBox checkBox15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);
        checkBox4 = (CheckBox) findViewById(R.id.checkBox4);
        checkBox5 = (CheckBox) findViewById(R.id.checkBox5);
        checkBox6 = (CheckBox) findViewById(R.id.checkBox6);
        checkBox7 = (CheckBox) findViewById(R.id.checkBox7);
        checkBox8 = (CheckBox) findViewById(R.id.checkBox8);
        checkBox9 = (CheckBox) findViewById(R.id.checkBox9);
        checkBox10 = (CheckBox) findViewById(R.id.checkBox10);
        checkBox11 = (CheckBox) findViewById(R.id.checkBox11);
        checkBox12 = (CheckBox) findViewById(R.id.checkBox12);
        checkBox13 = (CheckBox) findViewById(R.id.checkBox13);
        checkBox14 = (CheckBox) findViewById(R.id.checkBox14);
        checkBox15 = (CheckBox) findViewById(R.id.checkBox15);

        Button buttonSearch = (Button) findViewById(R.id.button_search);
        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onSearchButtonClick();
            }
        });
    }

    private void onSearchButtonClick() {
        ArrayList<String> ingredientsList = new ArrayList<>();

        if (checkBox1.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_arugula));
        }

        if (checkBox2.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_bacon));
        }

        if (checkBox3.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_beans));
        }

        if (checkBox4.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_bread));
        }

        if (checkBox5.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_butter));
        }

        if (checkBox6.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_chickenBreasts));
        }

        if (checkBox7.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_egg));
        }

        if (checkBox8.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_fetaCheese));
        }

        if (checkBox9.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_garlic));
        }

        if (checkBox10.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_lemon));
        }

        if (checkBox11.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_onion));
        }

        if (checkBox12.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_potato));
        }

        if (checkBox13.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_swissChard));
        }

        if (checkBox14.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_apple));
        }

        if (checkBox15.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_cinnamon));
        }

        if (!ingredientsList.isEmpty()) {
            Intent intent = new Intent(MainActivity.this, RecipeListActivity.class);
            intent.putStringArrayListExtra(KEY_INGREDIENTS, ingredientsList);
            startActivity(intent);
        }
        else {
            Toast.makeText(this, "Please select at least one ingredient",
                    Toast.LENGTH_LONG).show();
        }

    }

}
