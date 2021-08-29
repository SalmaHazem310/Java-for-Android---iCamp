package com.example.ihubandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener{

    Button bLogin, bForgot;
    EditText etUsername, etPassword, etEmail, etPhone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etUsername = (EditText) findViewById(R.id.etUsername);
        etPassword = (EditText) findViewById(R.id.etPassword);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPhone = (EditText) findViewById(R.id.etPhone);

        bLogin = (Button) findViewById(R.id.bLogin);
        bForgot = (Button) findViewById(R.id.bForgot);
        bLogin.setOnClickListener(this);
        bForgot.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bLogin:
                String username = etUsername.getText().toString();
                String email = etEmail.getText().toString();
                String password = etPassword.getText().toString();
                String phone = etPhone.getText().toString();
                Intent intent = new Intent(this, Information.class);
                intent.putExtra("username", username);
                intent.putExtra("email", email);
                intent.putExtra("password", password);
                intent.putExtra("phone", phone);
                startActivity(intent);
                break;
            case R.id.bForgot:
                Log.d("Forgot", "Forgot is clicked");
                break;

        }
    }
}
