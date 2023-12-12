package com.example.msdgymapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddFoodActivity extends AppCompatActivity {

    EditText day, name, cals, protein, carbs, fats;
    Button addBtn;
    FoodDao foodDao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);

        day = findViewById(R.id.DayText);
        name = findViewById(R.id.FoodNameText);
        cals = findViewById(R.id.CaloriesText);
        protein = findViewById(R.id.ProteinText);
        carbs = findViewById(R.id.CarbsText);
        fats = findViewById(R.id.FatsText);
        addBtn = findViewById(R.id.AddFoodBtn);

        // Get the FoodDao instance from the database
        foodDao = FoodDatabase.getInstance(this).foodDao();

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addFoodToDatabase();
            }
        });
    }

    private void addFoodToDatabase() {
        // Get data from the EditText fields
        String dayValue = day.getText().toString();
        String nameValue = name.getText().toString();
        float calsValue = Float.parseFloat(cals.getText().toString());
        float proteinValue = Float.parseFloat(protein.getText().toString());
        float carbsValue = Float.parseFloat(carbs.getText().toString());
        float fatsValue = Float.parseFloat(fats.getText().toString());

        // Create a new Food object
        Food newFood = new Food(dayValue, nameValue, calsValue, proteinValue, carbsValue, fatsValue);

        // Insert the newFood object into the database
        foodDao.insertAll(newFood);

        // Display a success message or handle the result as needed
        Toast.makeText(AddFoodActivity.this, "Food added to database", Toast.LENGTH_SHORT).show();

        // Optionally, you can finish the activity or navigate to another screen
        finish();
    }
}
