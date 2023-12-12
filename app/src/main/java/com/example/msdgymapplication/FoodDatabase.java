package com.example.msdgymapplication;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

//Initializing Database
@Database(entities = {Food.class}, version = 2)
public abstract class FoodDatabase extends RoomDatabase {

    //Creating variables
    private static FoodDatabase instance;

    public abstract FoodDao foodDao();

    //Creating an Instance using Synchronized
    public static synchronized FoodDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                            FoodDatabase.class, "food_database")
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return instance;
    }
}
