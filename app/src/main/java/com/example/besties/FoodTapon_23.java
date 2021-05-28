package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class FoodTapon_23 extends AppCompatActivity {
LinearLayout linearfoodtapon;
    ImageButton btnBooking,btnFood,btnHome, btnMaps, btnMyAccount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_tapon_23);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        LinearLayout linearfoodtapon = (LinearLayout )findViewById(R.id.linearfoodtapon);
        linearfoodtapon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodTapon_23.this,ChooseStore_24.class);
                startActivity(intent );
            }
        });

        btnFood=(ImageButton) findViewById(R.id.btnFood);
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoodTapon_23.this, FoodHome_21.class);
                startActivity(intent);
            }
        });

        btnHome=(ImageButton) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoodTapon_23.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnBooking=(ImageButton) findViewById(R.id.btnBooking);
        btnBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoodTapon_23.this, BookFlight_6.class);
                startActivity(intent);
            }
        });

        btnMaps=(ImageButton) findViewById(R.id.btnMaps);
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoodTapon_23.this, MapPage_29.class);
                startActivity(intent);
            }
        });

        btnMyAccount=(ImageButton) findViewById(R.id.btnMyAccount);
        btnMyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoodTapon_23.this, MyAccount_5.class);
                startActivity(intent);
            }
        });

    }
}