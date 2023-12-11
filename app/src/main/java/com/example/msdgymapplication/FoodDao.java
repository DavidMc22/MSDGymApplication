package com.example.msdgymapplication;


import androidx.lifecycle.LiveData;
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

    @Update
    void update(Food food);

    @Delete
    void delete(Food foods);

    @Query("Delete from food")
    void deleteAllFood();
    @Query("SELECT * From food")
    LiveData<List<Food>> getAllFoods();
}
