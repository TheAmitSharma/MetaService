package com.example.metaservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AboutUs extends AppCompatActivity {

    Button home_button_ap, services_button_ap, profile_button_ap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        home_button_ap = findViewById(R.id.home_button_ap);
        services_button_ap = findViewById(R.id.service_button_ap);
        profile_button_ap = findViewById(R.id.profile_button_ap);

        home_button_ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutUs.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        services_button_ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutUs.this,Services.class);
                startActivity(intent);
                finish();
            }
        });
        profile_button_ap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AboutUs.this,UserProfile.class);
                startActivity(intent);
                finish();
            }
        });
    }
}