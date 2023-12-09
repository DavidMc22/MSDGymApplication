package com.example.msdgymapplication;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "food")
public class Food {
    @PrimaryKey(autoGenerate = true)
    int ID =0;
    @ColumnInfo(name = "Day")
    public String day;

    @ColumnInfo(name = "FoodName")
    public String foodName;

    @ColumnInfo(name = "Calories")
    public float calories;
    @ColumnInfo(name = "Protein")
    public float protein;

    @ColumnInfo(name = "Carbs")
    public float carbs;

    @ColumnInfo(name = "Fats")
    public float fats;

    public Food(String day, String foodName, float calories, float protein, float carbs, float fats){
        this.day = day;
        this.foodName = foodName;
        this.calories = calories;
        this.protein = protein;
        this.carbs = carbs;
        this.fats = fats;
    }



    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public float getCalories() {
        return calories;
    }

    public void setCalories(float calories) {
        this.calories = calories;
    }

    public float getProtein() {
        return protein;
    }

    public void setProtein(float protein) {
        this.protein = protein;
    }

    public float getCarbs() {
        return carbs;
    }

    public void setCarbs(float carbs) {
        this.carbs = carbs;
    }

    public float getFats() {
        return fats;
    }

    public void setFats(float fats) {
        this.fats = fats;
    }
}
