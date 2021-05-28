package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Login_passenger extends AppCompatActivity {
    Button btnLogin2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_passenger);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnLogin2 = (Button) findViewById(R.id.btnLogin2);
        btnLogin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_passenger.this, Addservice_11.class);
                startActivity(intent);
            }
        });
    }
}