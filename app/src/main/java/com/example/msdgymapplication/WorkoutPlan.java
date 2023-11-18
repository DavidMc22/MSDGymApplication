package com.example.msdgymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WorkoutPlan extends AppCompatActivity {
    ImageButton Imagebutton3;
    ImageButton Imagebutton4;
    ImageButton Imagebutton5;
    ImageButton backButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_plan);
        Imagebutton3 = (ImageButton) findViewById(R.id.full);
        Imagebutton4 = (ImageButton) findViewById(R.id.upper);
        Imagebutton5 = (ImageButton) findViewById(R.id.lower);
        backButton2 = (ImageButton) findViewById(R.id.back2);
        Imagebutton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                openFullBody();
            }
        });

        Imagebutton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                openUpperBody();
            }
        });

        Imagebutton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view4) {
                openLowerBody();
            }
        });

        backButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainMenu();
            }
        });

    }
    public void openFullBody(){
        Intent intent4 = new Intent(this, FullBody.class);
        startActivity(intent4);
    }

    public void openUpperBody(){
        Intent intent5 = new Intent(this, UpperBody.class);
        startActivity(intent5);
    }

    public void openLowerBody(){
        Intent intent6 = new Intent(this, LowerBody.class);
        startActivity(intent6);
    }

    public void openMainMenu(){
        Intent intent7 = new Intent(this, MainMenu.class);
        startActivity(intent7);
    }



}