package com.example.msdgymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainMenu extends AppCompatActivity {
 ImageButton imageButton;
 ImageButton imageButton1;
 ImageButton imageButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        imageButton = (ImageButton) findViewById(R.id.workout);
        imageButton1 = (ImageButton) findViewById(R.id.nutrition);
        imageButton2 = (ImageButton) findViewById(R.id.tracker);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openWorkOut();
            }
        });
        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNutrition();
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTracker();
            }
        });
    }
    public void openWorkOut(){
        Intent intent1 = new Intent(this, WorkoutPlan.class);
        startActivity(intent1);
    }

    public void openNutrition(){
        Intent intent2 = new Intent(this, NutritionPlan.class);
        startActivity(intent2);
    }

    public void openTracker(){
        Intent intent3 = new Intent(this, WorkoutTracker.class);
        startActivity(intent3);
    }
}