package com.example.metaservice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Initializing variables
    Spinner spinner, spinner2;
    TextView textView, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //Assigning Variables

        //Variable for Select Category
        spinner = findViewById(R.id.spinner);
        textView = findViewById(R.id.text_view);

        //Variable for Problem Description


        //Initializing ArrayList
        ArrayList<String> numberList = new ArrayList<>();

        //Adding Catgories in ArrayList
        numberList.add("Select Category");
        numberList.add("Computer");
        numberList.add("A/C");
        numberList.add("Cooler");
        numberList.add("Refregirator");
        numberList.add("Water Pump");
        numberList.add("Washing Machine");
        numberList.add("SmartPhone");
        numberList.add("Laptop");
        numberList.add("Table Fan");
        numberList.add("Celling Fan");
        numberList.add("Mouse");
        numberList.add("Keyboard");
        numberList.add("Electric Cooker");
        numberList.add("Room Heater");
        numberList.add("Hard Drive");
        numberList.add("Car");
        numberList.add("Bike");
        numberList.add("TeleVision");
        numberList.add("Coffee maker");
        numberList.add("Clothes Dryer");
        numberList.add("Speaker");
        numberList.add("Blender");
        numberList.add("Toaster");
        numberList.add("Mixer");
        numberList.add("Microwave");
        numberList.add("Pressure cooker");
        numberList.add("Lamp");
        numberList.add("Crock pot");
        numberList.add("Bachelor griller");
        numberList.add("Stove");
        numberList.add("Light bulb");
        numberList.add("Lantern");
        numberList.add("Torch");
        numberList.add("Clothes iron");
        numberList.add("Kettle");
        numberList.add("Electric drill");
        numberList.add("Water cooker");
        numberList.add("Electric kettle");
        numberList.add("Hot pot");
        numberList.add("Water purifier");
        numberList.add("Kitchen hood");
        numberList.add("Electric guitar");
        numberList.add("Dishwasher");
        numberList.add("Oven");
        numberList.add("Vacuum cleaner");
        numberList.add("Evaporative cooler");

        //Set adapter
        spinner.setAdapter(new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item,numberList));

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0){
                    //Display toast massage
                    Toast.makeText(getApplicationContext(), "Please Select Category",Toast.LENGTH_SHORT).show();
                    //Set Empty value on TextView
                    textView.setText("");
                }else {
                    //Get  selected value
                    String sNumber = parent.getItemAtPosition(position).toString();
                    //Set Selected value on TextView
                    textView.setText(sNumber);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}