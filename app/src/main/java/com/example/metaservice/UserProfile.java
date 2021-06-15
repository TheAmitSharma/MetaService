package com.example.metaservice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.firebase.ui.auth.data.model.User;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class UserProfile extends AppCompatActivity {

    TextView name_user, email_user;
    Button logout_button_up, home_button_up, services_button_up,about_us_button_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);

        logout_button_up = findViewById(R.id.logout_button);
        home_button_up = findViewById(R.id.home_button_up);
        services_button_up = findViewById(R.id.service_button_up);
        about_us_button_up = findViewById(R.id.about_us_button_up);


        home_button_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfile.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        services_button_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfile.this,Services.class);
                startActivity(intent);
                finish();
            }
        });

        about_us_button_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfile.this,AboutUs.class);
                startActivity(intent);
                finish();
            }
        });

        logout_button_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UserProfile.this,Login.class);
                startActivity(intent);
                finish();
            }
        });




//        name_user = findViewById(R.id.name_user);
//        email_user = findViewById(R.id.email_user);
//
//        GoogleSignInAccount signInAccount = GoogleSignIn.getLastSignedInAccount(this);
//        if (signInAccount != null){
//            name_user.setText(signInAccount.getDisplayName());
//            email_user.setText(signInAccount.getEmail());
//        }
//
//        logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                FirebaseAuth.getInstance().signOut();
//                Intent intent = new Intent(getApplicationContext(),Login.class);
//                startActivity(intent);
//            }
//        });
    }
}