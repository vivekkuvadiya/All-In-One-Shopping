package com.annoyedpower.allinoneshopping.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.annoyedpower.allinoneshopping.R;
import com.annoyedpower.allinoneshopping.WebViewActivity;

public class Travel extends AppCompatActivity {

    CardView agoda, cleartrip, goibibo, makemytrip, ola, oyo, redbus, trivago, uber, zoomcar;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        agoda = findViewById(R.id.agoda);
        cleartrip = findViewById(R.id.cleartrip);
        goibibo = findViewById(R.id.goibibo);
        makemytrip = findViewById(R.id.makemytrip);
        ola = findViewById(R.id.ola);
        oyo = findViewById(R.id.oyo);
        redbus = findViewById(R.id.redbus);
        trivago = findViewById(R.id.trivago);
        uber = findViewById(R.id.uber);
        zoomcar = findViewById(R.id.zoomcar);


        agoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Travel.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.agoda.com/en-in/");
                startActivity(intent);
            }
        });
        cleartrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Travel.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.cleartrip.com/");
                startActivity(intent);
            }
        });
        goibibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Travel.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.goibibo.com/");
                startActivity(intent);
            }
        });
        makemytrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Travel.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.makemytrip.com/");
                startActivity(intent);
            }
        });
        ola.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Travel.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.olacabs.com/");
                startActivity(intent);
            }
        });
        oyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Travel.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.oyorooms.com/");
                startActivity(intent);
            }
        });
        redbus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Travel.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.redbus.in/");
                startActivity(intent);
            }
        });
        trivago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Travel.this, WebViewActivity.class);
                intent.putExtra("url", "");
                startActivity(intent);
            }
        });
        uber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Travel.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.uber.com/in/en/");
                startActivity(intent);
            }
        });
        zoomcar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Travel.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.zoomcar.com/");
                startActivity(intent);
            }
        });

    }

    public void back(View view) {
        finish();
    }
}
