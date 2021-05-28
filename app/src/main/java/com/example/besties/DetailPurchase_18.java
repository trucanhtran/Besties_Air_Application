package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class DetailPurchase_18 extends AppCompatActivity {
ImageButton btnBackToChooseStore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_purchase_18);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        btnBackToChooseStore = findViewById(R.id.btnBackToChooseStore);
        btnBackToChooseStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailPurchase_18.this, ChooseStore_24.class);
                startActivity(intent);
            }
        });
    }
}