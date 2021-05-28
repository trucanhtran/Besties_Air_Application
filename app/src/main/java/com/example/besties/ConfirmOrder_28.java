package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ConfirmOrder_28 extends AppCompatActivity {
ImageButton btnCloseConfirmOrder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm_order_28);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        btnCloseConfirmOrder = findViewById(R.id.btnCloseConfirmOrder);
        btnCloseConfirmOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ConfirmOrder_28.this,FoodHome_21.class);
                startActivity(intent);
            }
        });
    }
}