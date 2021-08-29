package com.example.android.tourguide;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView shoppingTextView = findViewById(R.id.shopping_text_view);
        shoppingTextView.setOnClickListener( v ->{
            Intent i = new Intent(MainActivity.this,ShoppingActivity.class);
            startActivity(i);
        });

        TextView restaurantTextView = findViewById(R.id.restaurant_text_view);
        restaurantTextView.setOnClickListener( v ->{
            Intent i = new Intent(MainActivity.this,RestaurantActivity.class);
            startActivity(i);
        });

        TextView pharmacyTextView = findViewById(R.id.pharmacy_text_view);
        pharmacyTextView.setOnClickListener( v ->{
            Intent i = new Intent(MainActivity.this,PharmacyActivity.class);
            startActivity(i);
        });

        TextView beachTextView = findViewById(R.id.beach_text_view);
        beachTextView.setOnClickListener( v ->{
            Intent i = new Intent(MainActivity.this,BeachActivity.class);
            startActivity(i);
        });

        TextView hospitalTextView = findViewById(R.id.hospital_text_view);
        hospitalTextView.setOnClickListener( v ->{
            Intent i = new Intent(MainActivity.this,HospitalActivity.class);
            startActivity(i);
        });

        TextView schoolTextView = findViewById(R.id.school_text_view);
        schoolTextView.setOnClickListener( v ->{
            Intent i = new Intent(MainActivity.this,SchoolActivity.class);
            startActivity(i);
        });

        TextView gasStationTextView = findViewById(R.id.gas_station_text_view);
        gasStationTextView.setOnClickListener( v ->{
            Intent i = new Intent(MainActivity.this,GasStatioin.class);
            startActivity(i);
        });



    }


}