package com.example.msdgymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class FullBody extends AppCompatActivity {

    //Variables
    ListView listView;
    ListView lv2;
    ListView lv3;
    ListView lv4;

    ImageButton backButton2;

    //Data to be used to display in list using arrays
    String[] FullBodyWorkout = {
            "Bench Press\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10",
            "Incline DB press\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10"

    };
    String[] FBArms = {
            "Bicep Curls\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10",
            "Hammer curls\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10",
            "Tricep extension\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10"
    };

    String[] FBBackShoulder = {
            "Lat pull down\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10",
            "Shoulder Press\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10"
    };

    String[] FBLegs = {
            "Hack squat\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10",
            "Hamstring Curls\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t\t8-10"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_body);

        //Setting variable = to specific Ids
        listView= findViewById(R.id.listview11);
        lv2= findViewById(R.id.listView12);
        lv3= findViewById(R.id.listview13);
        lv4= findViewById(R.id.listview14);
        backButton2 = (ImageButton) findViewById(R.id.back5);

        backButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWorkoutPlan();
            }
        });



        //Using adapter to list out each workout
        ArrayAdapter Adapter = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                FullBodyWorkout
        );

        listView.setAdapter(Adapter);

        ArrayAdapter Adapter2 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                FBArms
        );

        lv2.setAdapter(Adapter2);

        ArrayAdapter Adapter3 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                FBBackShoulder
        );

        lv3.setAdapter(Adapter3);

        ArrayAdapter Adapter4 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                FBLegs
        );

        lv4.setAdapter(Adapter4);

    }

    private void openWorkoutPlan() {
        Intent intent1 = new Intent(this, WorkoutPlan.class);
        startActivity(intent1);
    }

}