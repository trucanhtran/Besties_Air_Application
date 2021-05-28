package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class CustomizeProduct_25 extends AppCompatActivity {
ImageButton btnback;
Button addtoCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customize_product_25);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnback = findViewById(R.id.back24);
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomizeProduct_25.this, ChooseStore_24.class );
                startActivity(intent);
            }
        });
        addtoCart = findViewById(R.id.addtocart);
        addtoCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomizeProduct_25.this, DetailPurchase_26.class );
                startActivity(intent);
            }
        });
    }

}