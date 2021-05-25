package com.example.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonM1;
    Button buttonM2;
    Button buttonM3;
    Button buttonM4;
    Button buttonM5;
    Button buttonM6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonM1 = findViewById(R.id.buttonM1);
        buttonM2 = findViewById(R.id.buttonM2);
        buttonM3 = findViewById(R.id.buttonM3);
        buttonM4 = findViewById(R.id.buttonM4);
        buttonM5 = findViewById(R.id.buttonM5);
        buttonM6 = findViewById(R.id.buttonM6);

        buttonM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,moduleInformation.class);
                intent.putExtra("Module","C099");
                startActivity(intent);
            }
        });

        buttonM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,moduleInformation.class);
                intent.putExtra("Module","C100");
                startActivity(intent);
            }
        });

        buttonM3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,moduleInformation.class);
                intent.putExtra("Module","C101");
                startActivity(intent);
            }
        });

        buttonM4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,moduleInformation.class);
                intent.putExtra("Module","C102");
                startActivity(intent);
            }
        });

        buttonM5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,moduleInformation.class);
                intent.putExtra("Module","C103");
                startActivity(intent);
            }
        });

        buttonM6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,moduleInformation.class);
                intent.putExtra("Module","C104");
                startActivity(intent);
            }
        });
    }
}