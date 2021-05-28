package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class ManHinhDau_0 extends AppCompatActivity {
    Button btnLogin1, btnSkip;
    ImageButton btnclear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_manhinhdautien_0);
        ActionBar actionBar = getSupportActionBar();

        actionBar.hide();
        btnLogin1=(Button) findViewById(R.id.btnLogin1) ;
        btnLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ManHinhDau_0.this, Login_passenger.class);
                startActivity(intent);
            }
        });

        btnSkip=(Button) findViewById(R.id.btnSkip);
        btnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ManHinhDau_0.this,PassengerInformation_9.class);
                startActivity(intent);
            }
        });
        btnclear = findViewById(R.id.btnClearPassenger);
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ManHinhDau_0.this, AddFlight_8.class);
                startActivity(intent);
            }
        });

    }

}