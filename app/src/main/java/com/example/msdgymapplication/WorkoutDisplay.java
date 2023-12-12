package com.example.msdgymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class WorkoutDisplay extends AppCompatActivity {
    ImageButton backButton2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_display);

        backButton2 = (ImageButton) findViewById(R.id.back4);

        backButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                openTracker();
            }
        });

        //Using Intents to retrieve data added from Workout tracker activity
        Intent intent = getIntent();
        String name = intent.getStringExtra("Workout Name:");
        String set = intent.getStringExtra("Sets:");
        String weights = intent.getStringExtra("Weights:");
        String ratings = intent.getStringExtra("WorkoutRating");
        String ratings1 = intent.getStringExtra("FeelRating");



        //
        TextView result = findViewById(R.id.result);

        result.setText("Workout name:"+name+"\n\nSets:"+set+"\n\nWeight:"+weights+"\n\nWorkoutRating:"+ratings+"\n\nFeelRating:"+ratings1);

    }

    //Intent used to open tacker page
    public void openTracker(){
        Intent intent2 = new Intent(this, WorkoutTracker.class);
        startActivity(intent2);
    }
}