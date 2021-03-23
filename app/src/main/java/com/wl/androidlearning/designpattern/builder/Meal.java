package com.wl.androidlearning.designpattern.builder;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float costs = 0.0f;
        for(int i=0;i<items.size();i++){
            costs = costs+items.get(i).price();
        }

        Log.d("mealItem","cost:"+costs);
        return costs;
    }

    public void showItems(){
        for(int i=0;i<items.size();i++){
            Log.d("mealItem","name:"+items.get(i).name()+"price:"+items.get(i).price()+"packing:"+items.get(i).packing());
        }


    }

}
