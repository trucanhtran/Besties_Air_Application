package com.example.besties;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class TapOn_22 extends AppCompatActivity {
TextView txtTraSua;
ImageButton btnBackToFoodHome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tap_on_22b);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        txtTraSua=(TextView) findViewById(R.id.txtTraSua);
        txtTraSua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TapOn_22.this,FoodTapon_23.class);
                startActivity(intent);
            }
        });
        btnBackToFoodHome = findViewById(R.id.btnBackToFoodHome);
        btnBackToFoodHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TapOn_22.this, FoodHome_21.class);
                startActivity(intent);
            }
        });


    }
}