package com.example.msdgymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainMenu extends AppCompatActivity {

    //Variables
 ImageButton imageButton;
 ImageButton imageButton1;
 ImageButton imageButton2;
  ImageButton backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        //Setting variable = to specific Ids
        imageButton = (ImageButton) findViewById(R.id.workout);
        imageButton1 = (ImageButton) findViewById(R.id.nutrition);
        imageButton2 = (ImageButton) findViewById(R.id.tracker);
        backButton = (ImageButton) findViewById(R.id.back);

        //Using buttons with onClickListeners to open Pages
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

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }
    //Using intents to start page activity's
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

    public void openMainActivity(){
        Intent intent4 = new Intent(this, MainActivity.class);
        startActivity(intent4);
    }
}