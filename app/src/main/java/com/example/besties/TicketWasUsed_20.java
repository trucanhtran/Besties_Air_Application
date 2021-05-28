package com.example.besties;

import android.os.Bundle;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class TicketWasUsed_20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_was_used_20);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }
}