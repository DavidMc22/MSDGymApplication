package com.example.msdgymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class LowerBody extends AppCompatActivity {



    ListView lv9;
    ListView lv10;
    ListView lv11;
    ListView lv12;

    //Data to be used to display in list
    String[] LowerQuads = {
            "Hack squat\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10",
            "Leg Extensions\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10"

    };
    String[] LowerCalves = {
            "Calf raises\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10",
            "Calf press\t\t\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10"
    };

    String[] LowerHamStrings = {
            "Lying hamstring curls\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10",
            "Romanian deadlift\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t8-10"
    };

    String[] LowerGlutes = {
            "Split squats\t\t\t\t\t\t\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t\t8-10",
            "Barbell hip thrust\t\t\t\t\t|\t\t\t\t\t\t\t3\t\t\t\t\t\t|\t\t\t\t\t8-10"

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lower_body);

        lv9= findViewById(R.id.listview11);
        lv10= findViewById(R.id.listView12);
        lv11= findViewById(R.id.listview13);
        lv12= findViewById(R.id.listview14);

        ArrayAdapter Adapter5 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                LowerQuads
        );

        lv9.setAdapter(Adapter5);

        ArrayAdapter Adapter6 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                LowerCalves
        );

        lv10.setAdapter(Adapter6);

        ArrayAdapter Adapter7 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                LowerHamStrings
        );

        lv11.setAdapter(Adapter7);

        ArrayAdapter Adapter8 = new ArrayAdapter<String>(
                this,
                android.R.layout.simple_list_item_1,
                LowerGlutes
        );

        lv12.setAdapter(Adapter8);

    }
}