package com.example.ihubandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class Information extends AppCompatActivity {

    TextView tvUsername, tvEmail, tvPassword, tvPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        tvUsername = (TextView) findViewById(R.id.tvUsername);
        tvEmail = (TextView) findViewById(R.id.tvEmail);
        tvPassword = (TextView) findViewById(R.id.tvPassword);
        tvPhone = (TextView) findViewById(R.id.tvPhone);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String email = intent.getStringExtra("email");
        String password = intent.getStringExtra("password");
        String phone = intent.getStringExtra("phone");

        tvUsername.setText("Username: " + username);
        tvEmail.setText("Email: " + email);
        tvPassword.setText("Password: " + password);
        tvPhone.setText("Phone: " + phone);

    }
}
