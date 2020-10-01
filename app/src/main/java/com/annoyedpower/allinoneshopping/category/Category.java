package com.annoyedpower.allinoneshopping.category;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.annoyedpower.allinoneshopping.R;

public class Category extends AppCompatActivity {

    CardView shopping, women, food, grocery, travel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        shopping = findViewById(R.id.shopping);
        women = findViewById(R.id.women);
        food = findViewById(R.id.food);
        grocery = findViewById(R.id.grocery);
        travel = findViewById(R.id.travel);

        shopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Category.this, Shopping.class);
                startActivity(intent);
            }
        });
        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Category.this, Women.class);
                startActivity(intent);
            }
        });
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Category.this, Food.class);
                startActivity(intent);
            }
        });
        grocery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Category.this, Grocery.class);
                startActivity(intent);
            }
        });
        travel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Category.this, Travel.class);
                startActivity(intent);
            }
        });


    }

    public void back(View view) {
        finish();
    }
}