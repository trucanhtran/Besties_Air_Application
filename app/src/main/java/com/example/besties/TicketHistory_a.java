package com.example.besties;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class TicketHistory_a extends AppCompatActivity {
    Button btnTicket,btnPurchase;
    ImageButton btnBooking,btnFood,btnHome, btnMaps, btnMyAccount, btnbackhome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket_history_a);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        linkViews();
        addEvents();


        btnTicket=(Button) findViewById(R.id.btnTicket);
        btnTicket.setPaintFlags(btnTicket.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);
        btnPurchase=(Button) findViewById(R.id.btnPurchase);
        btnPurchase.setPaintFlags(btnTicket.getPaintFlags()| Paint.UNDERLINE_TEXT_FLAG);


        btnFood=(ImageButton) findViewById(R.id.btnFood);
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TicketHistory_a.this, FoodHome_21.class);
                startActivity(intent);
            }
        });

        btnHome=(ImageButton) findViewById(R.id.btnHome);
        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TicketHistory_a.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnBooking=(ImageButton) findViewById(R.id.btnBooking);
        btnBooking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TicketHistory_a.this, BookFlight_6.class);
                startActivity(intent);
            }
        });

        btnMaps=(ImageButton) findViewById(R.id.btnMaps);
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TicketHistory_a.this, MapPage_29.class);
                startActivity(intent);
            }
        });

        btnMyAccount=(ImageButton) findViewById(R.id.btnMyAccount);
        btnMyAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(TicketHistory_a.this, MyAccount_5.class);
                startActivity(intent);
            }
        });
        btnbackhome = findViewById(R.id.btnBackHome);
        btnbackhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TicketHistory_a.this, MainActivity.class );
                startActivity(intent);
            }
        });
    }
    private void addEvents() {
        btnTicket.setOnClickListener(myClick);
        btnPurchase.setOnClickListener(myClick);
    }
    View.OnClickListener myClick=new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
            Fragment fragment = null;
            switch (view.getId()) {
                case R.id.btnTicket:
                    fragment = new TicketHistory_b();
                    btnTicket.setTextColor(Color.WHITE);
                    btnPurchase.setTextColor(Color.BLACK);
                    break;

                case R.id.btnPurchase:
                    fragment = new PurchaseHistory_b();

                    btnTicket.setTextColor(Color.BLACK);
                    btnPurchase.setTextColor(Color.WHITE);
                    break;
            }
            if (fragment != null) {
                fragmentTransaction.replace(R.id.layoutContainer, fragment);
                fragmentTransaction.commit();
            }
        }
    };

    private void linkViews() {
        btnTicket=findViewById(R.id.btnTicket);
        btnPurchase=findViewById(R.id.btnPurchase);
    }

}