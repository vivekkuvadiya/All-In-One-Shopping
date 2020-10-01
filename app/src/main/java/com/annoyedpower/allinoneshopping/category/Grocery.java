package com.annoyedpower.allinoneshopping.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.annoyedpower.allinoneshopping.R;
import com.annoyedpower.allinoneshopping.WebViewActivity;

public class Grocery extends AppCompatActivity {

    CardView bigbasket, bigbazaar, grofers, naturebasket, patanjali, spencers;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);

        bigbasket = findViewById(R.id.bigbasket);
        bigbazaar = findViewById(R.id.bigbazaar);
        grofers = findViewById(R.id.grofers);
        naturebasket = findViewById(R.id.naturebasket);
        patanjali = findViewById(R.id.patanjali);
        spencers = findViewById(R.id.spencers);


        bigbasket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Grocery.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.bigbasket.com/");
                startActivity(intent);
            }
        });
        bigbazaar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Grocery.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.bigbazaar.com/");
                startActivity(intent);
            }
        });
        grofers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Grocery.this, WebViewActivity.class);
                intent.putExtra("url", "https://grofers.com/");
                startActivity(intent);
            }
        });
        naturebasket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Grocery.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.naturesbasket.co.in/");
                startActivity(intent);
            }
        });
        patanjali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Grocery.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.patanjaliayurved.net/");
                startActivity(intent);
            }
        });
        spencers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Grocery.this, WebViewActivity.class);
                intent.putExtra("url", "http://www.spencersretail.com/");
                startActivity(intent);
            }
        });

    }

    public void back(View view) {
        finish();
    }
}
