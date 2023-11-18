package com.example.msdgymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class WorkoutTracker extends AppCompatActivity {
    ImageButton backButton4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workout_tracker);
        backButton4 = (ImageButton) findViewById(R.id.back4);

        backButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainMenu2();
            }
        });
    }

    public void openMainMenu2(){
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
    }

}