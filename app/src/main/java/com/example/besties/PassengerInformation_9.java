package com.example.besties;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class PassengerInformation_9 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ImageButton btn_date,btnClosePassengerInformation;
    Calendar calendar;
    Button btnPassengerContinue11;

    int year, month, day;
    EditText in_date;

    private Spinner spn1;
    private Spinner spn2;
    private Spinner spn3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passenger_information_9);
        btnClosePassengerInformation=findViewById(R.id.btnClosePassengerInformation);
        btnClosePassengerInformation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(PassengerInformation_9.this, BookFlight_6.class);
                startActivity(intent);
            }
        });


        in_date=findViewById(R.id.in_date);
        btn_date=findViewById(R.id.btn_date);
        spn1=(Spinner) findViewById(R.id.spinner1);
        spn2=(Spinner) findViewById(R.id.spinner2);
        spn3=(Spinner) findViewById(R.id.spinner3);
        calendar = Calendar.getInstance();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
        showDate(year, month +1 , day);
        btn_date.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("WrongConstant")
            @Override
            public void onClick(View v) {
                showDialog(1);
                Toast.makeText(getApplicationContext(), "Bạn hãy chọn 1 ngày!", 30000).show();
            }
        });

        btnPassengerContinue11=findViewById(R.id.btnPassengerContinue11);
        btnPassengerContinue11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PassengerInformation_9.this,Addservice_11.class);
                startActivity(intent);
            }
        });


        addSpinner1();

        addSpinner2();
        addSpinner3();

        ActionBar actionBar = getSupportActionBar();

        actionBar.hide();

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
        in_date.setText(new StringBuilder().append(day>9? day: "0"+ day).append("/").append(month > 9 ? month : "0" + month).append("/").append(year));
    }

    private void addSpinner3() {
        List<String> list = new ArrayList<>();
        list.add("+ 84");
        list.add("+ xx");
        list.add("+ ab");

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spn3.setAdapter(adapter);
    }

    private void addSpinner2() {
        List<String> list = new ArrayList<>();
        list.add("Male");
        list.add("Female");
        list.add("Others");

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spn2.setAdapter(adapter);
    }



    private void addSpinner1() {
        List<String> list = new ArrayList<>();
        list.add("Mr");
        list.add("Ms");
        list.add("Mrs");

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, list);
        adapter.setDropDownViewResource(android.R.layout.simple_list_item_single_choice);
        spn1.setAdapter(adapter);
    }




    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String item = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}

