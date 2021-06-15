package com.example.metaservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.sip.SipErrorCode;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Services extends AppCompatActivity {

    Button home_button_sp, profile_button_sp, about_us_sp;
    Button home_services;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services);

        home_button_sp = findViewById(R.id.home_button_sp);
        profile_button_sp = findViewById(R.id.profile_button_sp);
        about_us_sp = findViewById(R.id.about_us_button_sp);


        home_services = findViewById(R.id.home_services);
        home_services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Services.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        home_button_sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Services.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        profile_button_sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Services.this,UserProfile.class);
                startActivity(intent);
                finish();
            }
        });
        about_us_sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Services.this,AboutUs.class);
                startActivity(intent);
                finish();
            }
        });
    }
}