package com.lukelunix.shoppinglistplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import com.lukelunix.shoppinglistplus.ShoppingListActivity.ShoppingListActivity;




public class MainMenu extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(getApplicationContext(), ShoppingListActivity.class));
    }
}