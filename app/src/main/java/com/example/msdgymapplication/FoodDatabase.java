package com.example.msdgymapplication;

import android.content.Context;
import android.os.AsyncTask;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Food.class},version = 1)
public abstract class FoodDatabase extends RoomDatabase {
    private static FoodDatabase INSTANCE;
    public abstract FoodDao FoodDao();


    public static synchronized FoodDatabase getInstance(Context context){
        if(INSTANCE==null){
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),FoodDatabase.class,"FoodDB")
                    .addCallback(roomCallback)
                    .fallbackToDestructiveMigration()
                    .build();
        }
        return INSTANCE;
    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new DatabaseAsyncTask(INSTANCE).execute();
        }
    };

    private static class DatabaseAsyncTask extends AsyncTask<Void, Void, Void> {

        private FoodDao foodDao;

        private DatabaseAsyncTask(FoodDatabase db){

            foodDao = db.FoodDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {

            return null;
        }
    }

}
