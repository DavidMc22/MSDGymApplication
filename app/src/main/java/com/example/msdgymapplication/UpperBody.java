package com.example.msdgymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class UpperBody extends AppCompatActivity {



    ListView lv5;
    ListView lv6;
    ListView lv7;
    ListView lv8;

    //Data to be used to display in list using Arrays
    String[] UpperChest = {
            "Bench Press\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10",
            "Incline DB press\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10"

    };
    String[] UpperArms = {
            "Bicep Curls\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10",
            "Hammer curls\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10"
    };

    String[] UpperBack = {
            "Lat pull down\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10",
            "Bent-over row\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10"
    };

    String[] UpperShoulders = {
            "Shoulder Press\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10",
            "Dumbbell lateral raise\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upper_body);

        lv5= findViewById(R.id.listview11);
        lv6= findViewById(R.id.listView12);
        lv7= findViewById(R.id.listview13);
        lv8= findViewById(R.id.listview14);

        ArrayAdapter Adapter5 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                UpperChest
        );

        lv5.setAdapter(Adapter5);

        ArrayAdapter Adapter6 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                UpperArms
        );

        lv6.setAdapter(Adapter6);

        ArrayAdapter Adapter7 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                UpperBack
        );

        lv7.setAdapter(Adapter7);

        ArrayAdapter Adapter8 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                UpperShoulders
        );

        lv8.setAdapter(Adapter8);

    }
}