package com.example.foodwastemanagement;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class SellForm extends AppCompatActivity {

    EditText itemName, itemQuantity,itemPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_form);
        itemName = findViewById(R.id.itemNameEditText);
        itemQuantity = findViewById(R.id.itemQuantityEditText);
        itemPrice = findViewById(R.id.itemPriceEditText);
    }

    public void addItem(View view) {
        if(!itemName.getText().toString().isEmpty() || !itemQuantity.getText().toString().isEmpty() || !itemPrice.getText().toString().isEmpty())
        {
            Item item = new Item(itemName.getText().toString(), itemQuantity.getText().toString(),itemPrice.getText().toString());
            MainActivity.product.add(item);
            Log.d("item",""+MainActivity.product.toString());
            Log.d("item",""+itemName.getText().toString());
            Log.d("item",""+itemQuantity.getText().toString());
            Log.d("item",""+itemPrice.getText().toString());
            itemName.setText("");
            itemQuantity.setText("");
            itemPrice.setText("");
        }
        else
        {
            Toast.makeText(this,"Please Enter an Item Name and Item Quantity",Toast.LENGTH_SHORT).show();
        }
    }
}
