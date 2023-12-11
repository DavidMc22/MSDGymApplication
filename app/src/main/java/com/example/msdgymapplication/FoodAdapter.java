package com.example.msdgymapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodHolder> {
    private List<Food> foods = new ArrayList<>();

    @NonNull
    @Override
    public FoodHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fooditems,parent,false);
        return new FoodHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodHolder holder, int position) {
        Food currentFood = foods.get(position);
        holder.textViewDay.setText(currentFood.getDay());
        holder.textViewFName.setText(currentFood.getFoodName());
        holder.textViewCals.setText(String.valueOf(currentFood.getCalories()));
        holder.textViewProtein.setText(String.valueOf(currentFood.getProtein()));
        holder.textViewCarbs.setText(String.valueOf(currentFood.getCarbs()));
        holder.textViewFats.setText(String.valueOf(currentFood.getFats()));

    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    public void setFoods(List<Food> foods){
        this.foods =foods ;
        notifyDataSetChanged();
    }

    class FoodHolder extends RecyclerView.ViewHolder{
        private TextView textViewDay;
        private TextView textViewFName;
        private TextView textViewCals;
        private TextView textViewProtein;
        private TextView textViewCarbs;
        private TextView textViewFats;

        public FoodHolder(@NonNull View itemView) {
            super(itemView);
            textViewDay = itemView.findViewById(R.id.DayText);
            textViewFName = itemView.findViewById(R.id.FoodNameText);
            textViewCals = itemView.findViewById(R.id.CaloriesText);
            textViewProtein = itemView.findViewById(R.id.ProteinText);
            textViewCarbs = itemView.findViewById(R.id.CarbsText);
            textViewFats = itemView.findViewById(R.id.FatsText);
        }
    }

}

