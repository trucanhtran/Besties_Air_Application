package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class BookYourSeat_12 extends AppCompatActivity {
Button btnContinue;
ImageButton btnClear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_your_seat_12);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnContinue=(Button) findViewById(R.id.btnContinue);
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BookYourSeat_12.this,PaymentMethod_13.class);
                startActivity(intent);
            }
        });
        btnClear = findViewById(R.id.btnClearBookSeat);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BookYourSeat_12.this, Addservice_11.class);
                startActivity(intent);
            }
        });

    }
}