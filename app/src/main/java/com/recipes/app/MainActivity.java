package com.recipes.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

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
            ingredientsList.add(getResources().getString(R.string.str_potato));
        }

        if (checkBox2.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_tomatoes));
        }

        if (checkBox3.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_carrot));
        }

        if (checkBox4.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_cheese));
        }

        if (checkBox5.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_salad));
        }

        if (checkBox6.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_onion));
        }
        if (checkBox7.isChecked()) {
            ingredientsList.add(getResources().getString(R.string.str_milk));
        }

        Intent intent = new Intent(MainActivity.this, RecipeListActivity.class);
        intent.putStringArrayListExtra(KEY_INGREDIENTS, ingredientsList);
        startActivity(intent);
    }

}
