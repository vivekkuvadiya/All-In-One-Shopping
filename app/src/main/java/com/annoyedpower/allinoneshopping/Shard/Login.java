package com.annoyedpower.allinoneshopping.Shard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.annoyedpower.allinoneshopping.MainActivity;
import com.annoyedpower.allinoneshopping.R;

public class Login extends AppCompatActivity {

    EditText username,password;
    Button login;
    TextView tvError;
    String mUsername,mPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        username = findViewById(R.id.edt_lg_username);
        password = findViewById(R.id.edt_lg_password);
        login = findViewById(R.id.btn_login);
        tvError = findViewById(R.id.tv_error);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                mUsername = username.getText().toString();
                mPassword = password.getText().toString();

                SharedPreferences preferences = getSharedPreferences("DATA",MODE_PRIVATE);
                String pPassword = preferences.getString("PASS",null);
                String pUsername = preferences.getString("USER",null);

                if (mUsername.equals(pUsername) && mPassword.equals(pPassword)){
                    startActivity(new Intent(Login.this, MainActivity.class));
                    finish();
                }
                else {
                    if (username.getText().toString().trim().equalsIgnoreCase("")){
                        username.setError("Enter Username");
                    }
                    if(password.getText().toString().trim().equalsIgnoreCase("")){
                        password.setError("Enter Password");
                    }
                    else {
                        tvError.setText("Enter Valid Username And Password");
                        tvError.setVisibility(View.VISIBLE);
                    }
                }

            }
        });


    }
}
