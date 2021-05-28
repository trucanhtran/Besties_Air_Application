package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Confirmmation_15 extends AppCompatActivity {
    Button btnDowloadTicket;
    ImageButton btnCloseConfirmTicket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation_15);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        btnDowloadTicket=findViewById(R.id.btnDowloadTicket);
        btnDowloadTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Confirmmation_15.this, FlightDetail_14.class);
                startActivity(intent);
            }
        });
        btnCloseConfirmTicket=findViewById(R.id.btnCloseConfirmTicket);
        btnCloseConfirmTicket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Confirmmation_15.this,BookFlight_6.class);
                startActivity(intent);
            }
        });

    }
}