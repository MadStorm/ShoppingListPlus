package com.lukelunix.shoppinglistplus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageButton;

import com.lukelunix.shoppinglistplus.ShoppingListActivity.ShoppingListActivity;

import java.lang.reflect.Field;



public class MainMenu extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main_menu);
        startActivity(new Intent(getApplicationContext(), ShoppingListActivity.class));
    }
}