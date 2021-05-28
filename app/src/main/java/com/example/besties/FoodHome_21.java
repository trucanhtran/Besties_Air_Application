package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class FoodHome_21 extends AppCompatActivity {
    ImageButton btnBooking,btnHome, btnMaps, btnMyAccount;
    Button btnBobapop;
    EditText edtSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_home_21);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();



        btnHome=(ImageButton) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoodHome_21.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnBooking=(ImageButton) findViewById(R.id.btnBooking);
        btnBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoodHome_21.this, BookFlight_6.class);
                startActivity(intent);
            }
        });

        btnMaps=(ImageButton) findViewById(R.id.btnMaps);
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoodHome_21.this, MapPage_29.class);
                startActivity(intent);
            }
        });

        btnMyAccount=(ImageButton) findViewById(R.id.btnMyAccount);
        btnMyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoodHome_21.this, MyAccount_5.class);
                startActivity(intent);
            }
        });

        edtSearch=(EditText)findViewById(R.id.edtSearch);
        edtSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(FoodHome_21.this, TapOn_22.class);
                startActivity(intent);
            }
        });
        btnBobapop = findViewById(R.id.bobapop);
        btnBobapop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FoodHome_21.this, ChooseStore_24.class );
                startActivity(intent);
            }
        });

    }
}