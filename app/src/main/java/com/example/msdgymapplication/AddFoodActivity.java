package com.example.msdgymapplication;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class AddFoodActivity extends AppCompatActivity {

    private EditText Day_Text;
    private EditText FoodName_Text;
    private EditText Calories_Text;
    private EditText Protein_Text;
    private EditText Carbs_Text;
    private EditText Fats_Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);

        Day_Text = findViewById(R.id.DayText);
        FoodName_Text = findViewById(R.id.FoodNameText);
        Calories_Text = findViewById(R.id.CaloriesText);
        Protein_Text = findViewById(R.id.ProteinText);
        Carbs_Text = findViewById(R.id.CarbsText);
        Fats_Text = findViewById(R.id.FatsText);


        setTitle("Add Food");
    }

    private void saveFood() {
        // Retrieve values from EditText fields
        String day = Day_Text.getText().toString();
        String foodName = FoodName_Text.getText().toString();
        String calories = Calories_Text.getText().toString();
        String protein = Protein_Text.getText().toString();
        String carbs = Carbs_Text.getText().toString();
        String fats = Fats_Text.getText().toString();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        return true;
    }


    }

