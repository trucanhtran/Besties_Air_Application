package com.example.besties;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class OTP_2 extends AppCompatActivity {
    Button btnContinue;
    TextView txtResendOTP,txtChangePN;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_2);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btnContinue=findViewById(R.id.btnContinue);
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OTP_2.this, Login_3.class);
                startActivity(intent);
            }
        });

        txtChangePN=findViewById(R.id.txtChangePN);
        txtChangePN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(OTP_2.this, Register_1.class);
                startActivity(intent);
            }
        });

    }
}