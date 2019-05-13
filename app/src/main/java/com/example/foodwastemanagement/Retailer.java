package com.example.foodwastemanagement;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Retailer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retailer);
    }

    public void donate(View view) {
        Uri uri = Uri.parse("https://www.foodbanknyc.org/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }
    public void compost(View view) {
        Uri uri = Uri.parse("https://compostnow.org/"); // missing 'http://' will cause crashed
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
        startActivity(intent);
    }

    public void openSellForm(View view) {
        Intent intent = new Intent(this, SellForm.class);
        startActivity(intent);
    }
}
