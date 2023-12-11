package com.example.msdgymapplication;

import android.app.Application;
import android.os.AsyncTask;


import androidx.lifecycle.LiveData;


import java.util.List;

public class foodRepository {
    private FoodDao foodDao;
    private LiveData<List<Food>> allFoods;

    public foodRepository(Application application){
        FoodDatabase database = FoodDatabase.getInstance(application);
        foodDao = database.FoodDao();
        allFoods = foodDao.getAllFoods();
    }

    public void insert(Food food){

        new InsertFoodAsyncTask(foodDao).execute(food);
    }
    public void update(Food food){

        new UpdateFoodAsyncTask(foodDao).execute(food);
    }
    public void delete(Food food){

        new DeleteFoodAsyncTask(foodDao).execute(food);
    }

    public void deleteAllFood(){

        new DeletAllFoodAsyncTask(foodDao).execute();
    }

    public LiveData<List<Food>> getAllFoods(){

        return allFoods;
    }

    private static class InsertFoodAsyncTask extends AsyncTask<Food, Void, Void> {
        private FoodDao foodDao;

        private InsertFoodAsyncTask(FoodDao foodDao){
            this.foodDao = foodDao;
        }
        @Override
        protected Void doInBackground(Food... foods) {
            foodDao.insertAll(foods[0]);
            return null;
        }
    }

    private static class UpdateFoodAsyncTask extends AsyncTask<Food, Void, Void> {
        private FoodDao foodDao;

        private UpdateFoodAsyncTask(FoodDao foodDao){
            this.foodDao = foodDao;
        }
        @Override
        protected Void doInBackground(Food... foods) {
            foodDao.update(foods[0]);
            return null;
        }
    }

    private static class DeleteFoodAsyncTask extends AsyncTask<Food, Void, Void> {
        private FoodDao foodDao;

        private DeleteFoodAsyncTask(FoodDao foodDao){
            this.foodDao = foodDao;
        }
        @Override
        protected Void doInBackground(Food... foods) {
            foodDao.delete(foods[0]);
            return null;
        }
    }

    private static class DeletAllFoodAsyncTask extends AsyncTask<Void, Void, Void> {
        private FoodDao foodDao;

        private DeletAllFoodAsyncTask(FoodDao foodDao){
            this.foodDao = foodDao;
        }
        @Override
        protected Void doInBackground(Void... Voids) {
            foodDao.deleteAllFood();
            return null;
        }
    }




}
