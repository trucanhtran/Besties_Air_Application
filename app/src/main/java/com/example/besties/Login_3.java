package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Login_3 extends AppCompatActivity {
    Button btnLogin, btnJoinNow, btnJoinAsGuest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_3);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnJoinNow = (Button) findViewById(R.id.btnJoinNow);
        btnJoinNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_3.this, Register_1.class);
                startActivity(intent);
            }
        });

        btnJoinAsGuest = (Button) findViewById(R.id.btnJoinAsGuest);
        btnJoinAsGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_3.this, MainActivity.class);
                startActivity(intent);
            }
        });



        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Login_3.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}