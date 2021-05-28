package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Addservice_11 extends AppCompatActivity {
LinearLayout linearBookSeat;
Button btnAddServiceContinue;
ImageButton btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_service_11);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        LinearLayout linearBookSeat = (LinearLayout )findViewById(R.id.linearBookSeat);
        linearBookSeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Addservice_11.this,BookYourSeat_12.class);
                startActivity(intent );
            }
        });

        btnAddServiceContinue=(Button)findViewById(R.id.btnAddServiceContinue);
        btnAddServiceContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Addservice_11.this,PaymentMethod_13.class);
                startActivity(intent );
            }
        });
        btnClear = findViewById(R.id.btnBackToPassenger);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Addservice_11.this, PassengerInformation_9.class );
                startActivity(intent);
            }
        });


    }
}