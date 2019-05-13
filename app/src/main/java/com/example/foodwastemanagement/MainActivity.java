package com.example.foodwastemanagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Item> product;
    EditText username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        product = new ArrayList<Item>();
        username = findViewById(R.id.usernameEditText);
        password = findViewById(R.id.passwordEditText);
    }

    public void doToDashboard(View view) {

        if(!username.getText().toString().isEmpty() || !password.getText().toString().isEmpty())
        {
            Intent intent = new Intent(this, Dashboard.class);
            startActivity(intent);
        }
        else
        {
            Toast.makeText(this,"Enter valid Username and Password",Toast.LENGTH_SHORT).show();
        }
    }
}
