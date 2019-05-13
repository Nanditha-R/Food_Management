package com.example.foodwastemanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void goToConsumer(View view) {
        Intent intent = new Intent(this,Consumer.class);
        startActivity(intent);
    }

    public void goToRetailer(View view) {
        Intent intent = new Intent(this,Retailer.class);
        startActivity(intent);
    }

    public void goToSellProduct(View view) {
        Intent intent = new Intent(this,SellProduct.class);
        startActivity(intent);
    }
}
