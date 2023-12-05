package com.example.msdgymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FullBody extends AppCompatActivity {

    ListView listView;
    ListView lv2;
    ListView lv3;
    ListView lv4;

    //Data to be used to display in list
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
            "Hack squat\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10",
            "Hamstring Curls\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_body);

        listView= findViewById(R.id.listview7);
        lv2= findViewById(R.id.listView8);
        lv3= findViewById(R.id.listview9);
        lv4= findViewById(R.id.listview10);

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
}