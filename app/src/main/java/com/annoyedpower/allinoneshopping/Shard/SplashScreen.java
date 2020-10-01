package com.annoyedpower.allinoneshopping.Shard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseLongArray;

import com.annoyedpower.allinoneshopping.MainActivity;
import com.annoyedpower.allinoneshopping.R;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(SplashScreen.this,Register.class));
                finish();

                SharedPreferences preferences = getSharedPreferences("DATA",MODE_PRIVATE);
                if (preferences.contains("YES")){
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                }
                else {
                    startActivity(new Intent(SplashScreen.this,Register.class));
                }

            }
        },1500);

    }
}
