package com.example.besties;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Calendar;

public class BookFlight_6 extends AppCompatActivity {
    Button btnSearchFlight;
    int year, month, day;
    EditText in_datebook1;
    ImageButton btn_datebook;
    Calendar calendar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_flight_6);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        in_datebook1 = findViewById(R.id.in_datebook1);
        btn_datebook = findViewById(R.id.btn_datebook);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        showDate(year, month + 1, day);
        btn_datebook.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                showDialog(1);
                Toast.makeText(getApplicationContext(), "Bạn hãy chọn 1 ngày!", 30000).show();
            }
        });

        btnSearchFlight=findViewById(R.id.btnSearchFlight);
        btnSearchFlight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BookFlight_6.this, AddFlight_8.class);
                startActivity(intent);
            }
        });
    }
    protected Dialog onCreateDialog(int id) {
        if (id == 1) {
            return new DatePickerDialog(this, dateSetListener, year, month, day);
        }
        return null;
    }

    DatePickerDialog.OnDateSetListener dateSetListener=new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
            showDate(year, month+1 , dayOfMonth);
        }
    };





    private void showDate(int year, int i, int day) {
        in_datebook1.setText(new StringBuilder().append(day>9? day: "0"+ day).append("/").append(month > 9 ? month : "0" + month).append("/").append(year));
    }
}