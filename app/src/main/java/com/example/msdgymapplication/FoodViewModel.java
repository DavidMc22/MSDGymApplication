package com.example.msdgymapplication;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

public class FoodViewModel extends AndroidViewModel {
    private foodRepository repository;
    private LiveData<List<Food>> allFoods;
    public FoodViewModel(@NonNull Application application) {
        super(application);
        repository = new foodRepository(application);
        allFoods = repository.getAllFoods();

    }

    public void insert(Food food){

        repository.insert(food);
    }
    public void update(Food food){

        repository.update(food);
    }
    public void delete(Food food){
        repository.delete(food);
    }

    public void deleteAllFood(){
        repository.deleteAllFood();
    }

    public LiveData<List<Food>> getAllFoods() {
        return allFoods;
    }
}
