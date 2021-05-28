package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class PaymentMethod_27 extends AppCompatActivity {
Button btnPaymentFoodContinue;
ImageButton btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method_27);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnPaymentFoodContinue=(Button) findViewById(R.id.btnPaymentFoodContinue);
        btnPaymentFoodContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaymentMethod_27.this,ConfirmOrder_28.class);
                startActivity(intent);
            }
        });
        btnBack = findViewById(R.id.back26);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaymentMethod_27.this, DetailPurchase_26.class);
                startActivity(intent);
            }
        });

    }
}