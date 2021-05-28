package com.example.besties;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class PaymentMethod_13 extends AppCompatActivity {
    Button btnPaymentContinue;
    ImageButton btnClosePayment;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_method_13);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        btnPaymentContinue=findViewById(R.id.btnPaymentContinue);
        btnPaymentContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PaymentMethod_13.this, Confirmmation_15.class);
                startActivity(intent);
            }
        });

        btnClosePayment = findViewById(R.id.btnClosePayment);
        btnClosePayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaymentMethod_13.this, BookYourSeat_12.class );
                startActivity(intent);
            }
        });
    }
}