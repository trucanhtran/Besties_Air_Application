package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class PurchaseHistory_17 extends AppCompatActivity {
LinearLayout linear1;
ImageButton ibPurchase1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_purchase_history_17);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        LinearLayout linear1 = (LinearLayout )findViewById(R.id.linear1);
        linear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PurchaseHistory_17.this,DetailPurchase_18.class);
                startActivity(intent );
            }
        });


    }
}