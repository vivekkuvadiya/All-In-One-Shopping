package com.annoyedpower.allinoneshopping.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.annoyedpower.allinoneshopping.R;
import com.annoyedpower.allinoneshopping.WebViewActivity;

public class Shopping extends AppCompatActivity implements View.OnClickListener {

    CardView flipkart, amazon, paytmmall, snapdeal, shopclus, limeroad, myntra, olx, jabong, aliexpress, clubfactory, ajio;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping);

        flipkart = findViewById(R.id.flipkart);
        amazon = findViewById(R.id.amazon);
        paytmmall = findViewById(R.id.paytmmall);
        snapdeal = findViewById(R.id.snapdeal);
        shopclus = findViewById(R.id.shopclus);
        limeroad = findViewById(R.id.limeroad);
        myntra = findViewById(R.id.myntra);
        olx = findViewById(R.id.olx);
        jabong = findViewById(R.id.jabong);
        aliexpress = findViewById(R.id.aliexpress);
        clubfactory = findViewById(R.id.clubfactory);
        ajio = findViewById(R.id.ajio);

        flipkart.setOnClickListener(this);
        amazon.setOnClickListener(this);
        paytmmall.setOnClickListener(this);
        snapdeal.setOnClickListener(this);
        shopclus.setOnClickListener(this);
        limeroad.setOnClickListener(this);
        myntra.setOnClickListener(this);
        olx.setOnClickListener(this);
        jabong.setOnClickListener(this);
        aliexpress.setOnClickListener(this);
        clubfactory.setOnClickListener(this);
        ajio.setOnClickListener(this);
    }

    public void back(View view) {
        finish();
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        switch (id) {
            case R.id.flipkart:
                intent = new Intent(Shopping.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.flipkart.com/");
                startActivity(intent);
                break;
            case R.id.amazon:
                intent = new Intent(Shopping.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.amazon.in/");
                startActivity(intent);
                break;
            case R.id.paytmmall:
                intent = new Intent(Shopping.this, WebViewActivity.class);
                intent.putExtra("url", "https://paytmmall.com/");
                startActivity(intent);
                break;
            case R.id.snapdeal:
                intent = new Intent(Shopping.this, WebViewActivity.class);
                intent.putExtra("url", "https://m.snapdeal.com/");
                startActivity(intent);
                break;
            case R.id.shopclus:
                intent = new Intent(Shopping.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.shopclues.com/");
                startActivity(intent);
                break;
            case R.id.limeroad:
                intent = new Intent(Shopping.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.limeroad.com/");
                startActivity(intent);
                break;
            case R.id.myntra:
                intent = new Intent(Shopping.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.myntra.com/");
                startActivity(intent);
                break;
            case R.id.olx:
                intent = new Intent(Shopping.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.olx.in/");
                startActivity(intent);
                break;
            case R.id.jabong:
                intent = new Intent(Shopping.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.jabong.com/");
                startActivity(intent);
                break;
            case R.id.aliexpress:
                intent = new Intent(Shopping.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.aliexpress.com/");
                startActivity(intent);
                break;
            case R.id.clubfactory:
                intent = new Intent(Shopping.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.clubfactory.com/amp/");
                startActivity(intent);
                break;
            case R.id.ajio:
                intent = new Intent(Shopping.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.ajio.com/shop/sale");
                startActivity(intent);
                break;
        }

    }
}