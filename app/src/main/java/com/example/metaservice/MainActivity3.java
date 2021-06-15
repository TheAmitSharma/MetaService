package com.example.metaservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Button back_button_mp3, submit_button_mp3, cancle_button_mp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        back_button_mp3 = findViewById(R.id.back_button_mp3);
        submit_button_mp3 = findViewById(R.id.submit_button_mp3);
        cancle_button_mp3 = findViewById(R.id.cancle_button_mp3);

        back_button_mp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity3.this,MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });
        cancle_button_mp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this,"Cancelled!!!",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        submit_button_mp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity3.this,"SUBMITTIED SUCESSFULLY",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity3.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}