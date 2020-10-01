package com.annoyedpower.allinoneshopping.Shard;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.annoyedpower.allinoneshopping.R;

public class Register extends AppCompatActivity {

    EditText username, password, confpassword;
    Button register;

    String mUsername, mPassword, mConfpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        username = findViewById(R.id.edt_username);
        password = findViewById(R.id.edt_password);
        confpassword = findViewById(R.id.edt_conf_password);
        register = findViewById(R.id.btn_register);


        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                mUsername = username.getText().toString();
                mPassword = password.getText().toString();
                mConfpassword = confpassword.getText().toString();


                if (username.getText().toString().trim().equalsIgnoreCase("")) {
                    username.setError("Enter Username");
                }
                if (password.getText().toString().trim().equalsIgnoreCase("")) {
                    password.setError("Enter Password");
                }
                if (!confpassword.getText().toString().trim().equals(password.getText().toString())) {
                    confpassword.setError("Doesn't Match Password");
                } else {

                    SharedPreferences preferences = getSharedPreferences("DATA", MODE_PRIVATE);
                    SharedPreferences.Editor editor = preferences.edit();
                    editor.putString("USER", mUsername);
                    editor.putString("PASS", mConfpassword);
                    editor.putBoolean("YES", true);
                    editor.commit();

                    startActivity(new Intent(Register.this, Login.class));
                    finish();
                }

            finish();
            }
        });

    }
}
