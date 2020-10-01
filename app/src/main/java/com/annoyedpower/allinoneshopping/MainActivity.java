package com.annoyedpower.allinoneshopping;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.annoyedpower.allinoneshopping.Shard.Register;
import com.annoyedpower.allinoneshopping.category.Category;
import com.annoyedpower.allinoneshopping.category.Food;
import com.annoyedpower.allinoneshopping.category.Grocery;
import com.annoyedpower.allinoneshopping.category.Shopping;
import com.annoyedpower.allinoneshopping.category.Travel;
import com.annoyedpower.allinoneshopping.category.Women;

public class MainActivity extends AppCompatActivity {

    CardView flipcart, amazon, snapdeal, shopclus, clubfactory, shopping, women, food, grocery, travel, zomato, nykaa, oyo, bigbasket, patanjali, uber, limeroad, makemytrip, kfc;
    TextView logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logout = findViewById(R.id.log_out);

        shopping();
        catogary();
        topApp();
        top2App();

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences preferences = getSharedPreferences("DATA",MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.clear();
                editor.commit();

                startActivity(new Intent(MainActivity.this, Register.class));
                finish();

            }
        });


    }

    public void shopping() {

        flipcart = findViewById(R.id.flipkart);
        amazon = findViewById(R.id.amazon);
        snapdeal = findViewById(R.id.snapdeal);
        shopclus = findViewById(R.id.shopclus);
        clubfactory = findViewById(R.id.clubfactory);


        flipcart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.flipkart.com/");
                startActivity(intent);
            }
        });
        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.amazon.in/");
                startActivity(intent);
            }
        });
        snapdeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.snapdeal.com/");
                startActivity(intent);
            }
        });
        shopclus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.shopclues.com/");
                startActivity(intent);
            }
        });
        clubfactory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.clubfactory.com/");
                startActivity(intent);
            }
        });

    }

    public void catogary() {

        shopping = findViewById(R.id.shopping);
        women = findViewById(R.id.women);
        food = findViewById(R.id.food);
        grocery = findViewById(R.id.grocery);
        travel = findViewById(R.id.travel);

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Shopping.class);
                startActivity(intent);
            }
        });
        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Women.class);
                startActivity(intent);
            }
        });
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Food.class);
                startActivity(intent);
            }
        });
        grocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Grocery.class);
                startActivity(intent);
            }
        });
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Travel.class);
                startActivity(intent);
            }
        });

    }

    public void topApp() {

        amazon = findViewById(R.id.amazon2);
        zomato = findViewById(R.id.zomato);
        nykaa = findViewById(R.id.nykaa);
        oyo = findViewById(R.id.oyo);
        bigbasket = findViewById(R.id.bigbasket);

        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.amazon.in/");
                startActivity(intent);
            }
        });
        zomato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.zomato.com/");
                startActivity(intent);
            }
        });
        nykaa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.nykaa.com/");
                startActivity(intent);
            }
        });
        oyo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.oyorooms.com/");
                startActivity(intent);
            }
        });
        bigbasket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.bigbasket.com/");
                startActivity(intent);
            }
        });

    }

    public void top2App() {
        patanjali = findViewById(R.id.patanjali);
        uber = findViewById(R.id.uber);
        limeroad = findViewById(R.id.limeroad);
        makemytrip = findViewById(R.id.makemytrip);
        kfc = findViewById(R.id.kfc);

        patanjali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.patanjaliayurved.net/");
                startActivity(intent);
            }
        });
        uber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.uber.com/in/en/");
                startActivity(intent);
            }
        });
        limeroad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.limeroad.com/");
                startActivity(intent);
            }
        });
        makemytrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://www.makemytrip.com/");
                startActivity(intent);
            }
        });
        kfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
                intent.putExtra("url", "https://online.kfc.co.in/");
                startActivity(intent);
            }
        });

    }

    public void shoppingAllApp(View view) {

        Intent intent = new Intent(MainActivity.this, Shopping.class);
        startActivity(intent);
    }

    public void allCategory(View view) {

        Intent intent = new Intent(MainActivity.this, Category.class);
        startActivity(intent);
    }

    @Override
    public void onBackPressed() {

        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("Are You Sure For Exit..?");
        dialog.setMessage("Message");

        dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        }).setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });
        dialog.show();
    }
}
