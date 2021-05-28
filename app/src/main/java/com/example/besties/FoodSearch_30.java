package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class FoodSearch_30 extends AppCompatActivity {
    LinearLayout linearfoodsearch;
    ImageButton btnBooking,btnHome, btnMaps, btnMyAccount, btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_search_30);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        LinearLayout linearfoodsearch = (LinearLayout )findViewById(R.id.linearfoodsearch);
        linearfoodsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodSearch_30.this,ChooseStore_24.class);
                startActivity(intent );
            }
        });
        btnHome=(ImageButton) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoodSearch_30.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnBooking=(ImageButton) findViewById(R.id.btnBooking);
        btnBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoodSearch_30.this, BookFlight_6.class);
                startActivity(intent);
            }
        });

        btnMaps=(ImageButton) findViewById(R.id.btnMaps);
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoodSearch_30.this, MapPage_29.class);
                startActivity(intent);
            }
        });

        btnMyAccount=(ImageButton) findViewById(R.id.btnMyAccount);
        btnMyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoodSearch_30.this, MyAccount_5.class);
                startActivity(intent);
            }
        });

        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoodSearch_30.this, FoodHome_21.class);
                startActivity(intent);
            }
        });
    }
}