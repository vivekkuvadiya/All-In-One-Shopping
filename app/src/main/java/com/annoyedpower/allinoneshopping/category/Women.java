package com.annoyedpower.allinoneshopping.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.annoyedpower.allinoneshopping.R;
import com.annoyedpower.allinoneshopping.WebViewActivity;

public class Women extends AppCompatActivity{

    CardView nykaa, voonik, purplle, craftvilla, bluestone, zivame, faballey;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_women);

        nykaa = findViewById(R.id.nykaa);
        voonik = findViewById(R.id.voonik);
        purplle = findViewById(R.id.purplle);
        craftvilla = findViewById(R.id.craftvilla);
        bluestone = findViewById(R.id.bluestone);
        zivame = findViewById(R.id.zivame);
        faballey = findViewById(R.id.faballey);

        nykaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Women.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.nykaa.com/");
                startActivity(intent);
            }
        });

        voonik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Women.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.voonik.com/");
                startActivity(intent);
            }
        });

        purplle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Women.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.purplle.com/");
                startActivity(intent);
            }
        });

        craftvilla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Women.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.craftsvilla.com/");
                startActivity(intent);
            }
        });

        bluestone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Women.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.bluestone.com/");
                startActivity(intent);
            }
        });

        zivame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Women.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.zivame.com/");
                startActivity(intent);
            }
        });

        faballey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Women.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.faballey.com/");
                startActivity(intent);
            }
        });
    }

    public void back(View view) {
        finish();
    }
}
