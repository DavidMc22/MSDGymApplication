package com.example.msdgymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class WorkoutTracker extends AppCompatActivity {
    ImageButton backButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.workout_tracker);

        EditText workoutname = findViewById(R.id.workout_name);
        EditText sets = findViewById(R.id.sets);
        EditText weights = findViewById(R.id.weight);
        EditText rating1 = findViewById(R.id.rating);
        EditText rating2 =findViewById(R.id.rating2);
        backButton2 = (ImageButton) findViewById(R.id.back3);
        Button savebtn = findViewById(R.id.saveButton);

        backButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openMainMenu();
            }
        });
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = workoutname.getText().toString();
                String set = sets.getText().toString();
                String weights1 = weights.getText().toString();
                String ratings = rating1.getText().toString();
                String ratings1 = rating2.getText().toString();

                Intent intent2 = new Intent(WorkoutTracker.this, WorkoutDisplay.class);
                intent2.putExtra("Workout Name:",name);
                intent2.putExtra("Sets:",set);
                intent2.putExtra("Weights:",weights1);
                intent2.putExtra("WorkoutRating", ratings);
                intent2.putExtra("FeelRating", ratings1);
                startActivity(intent2);

            }
        });

    }

    //Intent used to open WorkoutPlan page
    public void openMainMenu(){
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }


}