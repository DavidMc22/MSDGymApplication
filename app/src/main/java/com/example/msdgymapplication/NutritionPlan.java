package com.example.msdgymapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class NutritionPlan extends AppCompatActivity {
    ImageButton backButton3;
    Button foodButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_plan);
        foodButton = (Button) findViewById(R.id.foodbutton);


        foodButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutritionPlan.this, AddFoodActivity.class));
            }
        });
    }
}

