package com.example.project01;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.project01.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstancesStates){
        super.onCreate(savedInstancesStates);
        setContentView(R.layout.activity_main);
    }
    public  void clickHandler(View source){
        TextView tv = findViewById(R.id.show);
        tv.setText("hello Android world  " + new java.util.Date());
    }

}