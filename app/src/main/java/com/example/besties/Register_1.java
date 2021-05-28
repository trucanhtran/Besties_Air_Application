package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Register_1 extends AppCompatActivity {
    Button btnSignUp, btnregisterLogIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_1);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnSignUp=(Button) findViewById(R.id.btnSignUp);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Register_1.this, OTP_2.class);
                startActivity(intent);
            }
        });

        btnregisterLogIn=(Button)findViewById(R.id.btnregisterLogIn);
        btnregisterLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Register_1.this, Login_3.class);
                startActivity(intent);
            }
        });

    }
}