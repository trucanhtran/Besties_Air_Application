package com.example.besties;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MapPage_22 extends AppCompatActivity {
    ImageButton ibMapDirection;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_page_22a);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        ibMapDirection=findViewById(R.id.ibMapDirection);
        ibMapDirection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MapPage_22.this,MapPage_29.class);
                startActivity(intent);
            }
        });

    }
}