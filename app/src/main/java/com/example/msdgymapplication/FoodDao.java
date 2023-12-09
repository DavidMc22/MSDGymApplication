package com.example.msdgymapplication;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface FoodDao {

    @Insert
    void insertAll(Food foods);

    @Delete
    void deleteAll(Food foods);

    @Query("UPDATE food SET Day =:Day, FoodName =:FoodName, Protein =:Protein, Carbs =:Carbs, Fats =:Fats WHERE ID =:id")
    void update(int id, String Day, float FoodName, float Protein, float Carbs, float Fats);
    @Query("SELECT * From Food")
    List<Food> getAllFoods();
}
