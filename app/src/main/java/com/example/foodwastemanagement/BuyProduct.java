package com.example.foodwastemanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class BuyProduct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_product);

        ListView list = findViewById(R.id.listView);
        list.setAdapter(new ListAdapter(this, MainActivity.product));
    }
}
