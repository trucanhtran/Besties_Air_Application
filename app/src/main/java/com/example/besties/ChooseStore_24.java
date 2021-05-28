package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class ChooseStore_24 extends AppCompatActivity {
Button btnSP,btnViewCart;
ImageButton btnBackToSearchFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_strore_24);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        btnSP = (Button)findViewById(R.id.btnSP1);
        btnSP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChooseStore_24.this,CustomizeProduct_25.class);
                startActivity(intent);
            }
        });

        btnViewCart=findViewById(R.id.btnViewCart);
        btnViewCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChooseStore_24.this,DetailPurchase_26.class);
                startActivity(intent);
            }
        });

        btnBackToSearchFood = findViewById(R.id.btnBackToSearchFood);
        btnBackToSearchFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ChooseStore_24.this, FoodSearch_30.class);
                startActivity(intent);
            }
        });

    }




}