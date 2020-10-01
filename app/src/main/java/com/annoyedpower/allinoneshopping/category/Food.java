package com.annoyedpower.allinoneshopping.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.annoyedpower.allinoneshopping.R;
import com.annoyedpower.allinoneshopping.WebViewActivity;

import java.util.zip.Inflater;

public class Food extends AppCompatActivity {

    CardView dominospizza, faasos, freshmenu, swiggy, zomato, ubereats, justeat, kfc, mcdonalds, pizzahut;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        dominospizza = findViewById(R.id.dominospizza);
        faasos = findViewById(R.id.faasos);
        freshmenu = findViewById(R.id.freshmenu);
        swiggy = findViewById(R.id.swiggy);
        zomato = findViewById(R.id.zomato);
        ubereats = findViewById(R.id.ubereats);
        justeat = findViewById(R.id.justeat);
        kfc = findViewById(R.id.kfc);
        mcdonalds = findViewById(R.id.mcdonalds);
        pizzahut = findViewById(R.id.pizzahut);


        dominospizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Food.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.dominos.co.in/");
                startActivity(intent);
            }
        });
        faasos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Food.this, WebViewActivity.class);
                intent.putExtra("url", "https://order.faasos.io/");
                startActivity(intent);
            }
        });
        freshmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Food.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.freshmenu.com/");
                startActivity(intent);
            }
        });
        swiggy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Food.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.swiggy.com/");
                startActivity(intent);
            }
        });
        zomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Food.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.zomato.com/");
                startActivity(intent);
            }
        });
        ubereats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Food.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.ubereats.com/en-IN/");
                startActivity(intent);
            }
        });
        justeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Food.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.justeatplc.com/");
                startActivity(intent);
            }
        });
        kfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Food.this, WebViewActivity.class);
                intent.putExtra("url", "https://online.kfc.co.in/");
                startActivity(intent);
            }
        });
        mcdonalds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Food.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.mcdelivery.co.in/");
                startActivity(intent);
            }
        });
        pizzahut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Food.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.pizzahut.co.in/");
                startActivity(intent);
            }
        });

    }

    public void back(View view) {
        finish();
    }
}
