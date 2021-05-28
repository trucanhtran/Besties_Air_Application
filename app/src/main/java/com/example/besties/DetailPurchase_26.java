package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DetailPurchase_26 extends AppCompatActivity {
Button btnFoodPayment;
ImageButton btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_purchase_26);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnFoodPayment=findViewById(R.id.btnFoodPayment);
        btnFoodPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DetailPurchase_26.this, PaymentMethod_27.class);
                startActivity(intent);
            }
        });
        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(DetailPurchase_26.this, ChooseStore_24.class);
                startActivity(intent);
            }
        });
    }
}