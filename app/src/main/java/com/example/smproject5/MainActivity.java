package com.example.smproject5;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private ImageButton donutButton;
    private ImageButton coffeeButton;
    private ImageButton cartButton;
    private ImageButton storeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        donutButton = findViewById(R.id.donut_button);
        donutButton.setOnClickListener(this);
        coffeeButton = findViewById(R.id.coffee_button);
        coffeeButton.setOnClickListener(this);
        cartButton = findViewById(R.id.cart_button);
        cartButton.setOnClickListener(this);
        storeButton = findViewById(R.id.store_button);
        storeButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.donut_button:

        }
    }
}