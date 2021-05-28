package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class AddFlight_8 extends AppCompatActivity {
LinearLayout linearAddFlight;
ImageButton btnbacktoBookflight;
ImageButton btnFood,btnHome, btnMaps, btnMyAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_flight_8);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        LinearLayout linearAddFlight= (LinearLayout )findViewById(R.id.linearAddFlight);
        linearAddFlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AddFlight_8.this,ManHinhDau_0.class);
                startActivity(intent);
            }
        });
        btnbacktoBookflight = findViewById(R.id.btnBackToBookFlight);
        btnbacktoBookflight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AddFlight_8.this, BookFlight_6.class);
                startActivity(intent);
            }
        });
        btnFood=(ImageButton) findViewById(R.id.btnFood);
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AddFlight_8.this, FoodHome_21.class);
                startActivity(intent);
            }
        });

        btnHome=(ImageButton) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AddFlight_8.this, MainActivity.class);
                startActivity(intent);
            }
        });


        btnMaps=(ImageButton) findViewById(R.id.btnMaps);
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AddFlight_8.this, MapPage_29.class);
                startActivity(intent);
            }
        });

        btnMyAccount=(ImageButton) findViewById(R.id.btnMyAccount);
        btnMyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(AddFlight_8.this, MyAccount_5.class);
                startActivity(intent);
            }
        });
    }
}