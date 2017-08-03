package com.lukelunix.shoppinglistplus.View;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.lukelunix.shoppinglistplus.R;
import com.lukelunix.shoppinglistplus.ShoppingListActivity.Task;
import com.lukelunix.shoppinglistplus.ShoppingListActivity.TaskAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class AddItemFromListActivity extends AppCompatActivity implements View.OnClickListener{

    private ListView listview;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item_from_list);


        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
        listview = (ListView) findViewById(R.id.listViewItems);

        listview.setAdapter(itemsAdapter);

        itemsAdapter.add("Beverages – coffee/tea, juice, soda");
        itemsAdapter.add("Bread/Bakery – sandwich loaves, dinner rolls, tortillas, bagels");
        itemsAdapter.add("Canned/Jarred Goods – vegetables, spaghetti sauce, ketchup");
        itemsAdapter.add("Dairy – cheeses, eggs, milk, yogurt, butter");
        itemsAdapter.add("Dry/Baking Goods – cereals, flour, sugar, pasta, mixes");
        itemsAdapter.add("Frozen Foods – waffles, vegetables, individual meals, ice cream");
        itemsAdapter.add("Meat – lunch meat, poultry, beef, pork");
        itemsAdapter.add("Produce – fruits, vegetables");
        itemsAdapter.add("Cleaners – all- purpose, laundry detergent, dishwashing liquid/detergent");
        itemsAdapter.add("Paper Goods – paper towels, toilet paper, aluminum foil, sandwich bags");
        itemsAdapter.add("Personal Care – shampoo, soap, hand soap, shaving cream");
        itemsAdapter.add("Other – baby items, pet items, batteries, greeting cards");



       //addItems("Test");
//        listview.setOnClickListener(this);


    }

    public void addItems(String item){
        if (item.length() > 0) {
            item = item.replaceAll("\\r|\\n", " ");
            Task t = new Task();
            t.setTaskDescription(item);
            t.setDone(false);
            //arrayAdapter.insert(t, 0);
        }
    }



    @Override
    public void onClick(View v) {

    }
}
