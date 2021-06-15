package com.example.metaservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    Button back_button_mp2, next_button_mp2;
    Spinner spinner_location_type;
    TextView textView_location_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        spinner_location_type = findViewById(R.id.spinner_location);
        textView_location_type = findViewById(R.id.text_view_location_type);

        back_button_mp2 = findViewById(R.id.back_button_mp2);
        next_button_mp2 = findViewById(R.id.next_button_mp2);

        back_button_mp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        next_button_mp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(intent);
                finish();
            }
        });

        //Initilizing array
        ArrayList<String> locationList = new ArrayList<>();

        //Adding values to array
        locationList.add("Select Location");
        locationList.add("Home");
        locationList.add("Office");
        locationList.add("Shop");
        locationList.add("Other");

        //Set adapter
        spinner_location_type.setAdapter(new ArrayAdapter<>(MainActivity2.this, android.R.layout.simple_spinner_dropdown_item,locationList));

        spinner_location_type.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    //Display toast massage
                    Toast.makeText(getApplicationContext(), "Please Select Location",Toast.LENGTH_SHORT).show();
                    //Set Empty value on TextView
                    textView_location_type.setText("");
                }else {
                    //Get  selected value
                    String sNumber = parent.getItemAtPosition(position).toString();
                    //Set Selected value on TextView
                    textView_location_type.setText(sNumber);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}