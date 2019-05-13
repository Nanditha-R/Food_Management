package com.example.foodwastemanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SellProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_product);
    }

    public void openSellForm(View view) {
        Intent intent = new Intent(this, SellForm.class);
        startActivity(intent);
    }
}
