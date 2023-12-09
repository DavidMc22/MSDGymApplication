package com.example.msdgymapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class AddFoodActivity extends AppCompatActivity {

    EditText day,name,cals,protein,carbs,fats;
    Button addBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);

        day=findViewById(R.id.DayText);
        name=findViewById(R.id.FoodNameText);
        cals=findViewById(R.id.CaloriesText);
        protein=findViewById(R.id.CaloriesText);
        carbs=findViewById(R.id.ProteinText);
        fats=findViewById(R.id.CarbsText);
        addBtn=findViewById(R.id.AddFoodBtn);
    }
}