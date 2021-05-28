package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MapPage_29 extends AppCompatActivity {
Button btnsearchRestaurants;
ImageButton btnBackToHomePage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_page_1_29);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnsearchRestaurants=findViewById(R.id.btnsearchRestaurants);
        btnsearchRestaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MapPage_29.this,MapPage_22.class);
                startActivity(intent);
            }
        });
        btnBackToHomePage = findViewById(R.id.btnBackToHomePage);
        btnBackToHomePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MapPage_29.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}