package com.example.sylhetdivision;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    ScrollView sv;
    Button d1,d2,d3,d4,d5,d6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sv = findViewById(R.id.scrl);
        sv.setVisibility(View.VISIBLE);
        d1 =(Button) findViewById(R.id.Sylt1);
        d2=(Button) findViewById(R.id.Sylt2);
        d3=(Button) findViewById(R.id.Sylt3);
        d4=(Button) findViewById(R.id.Sylt4);
        d5=(Button) findViewById(R.id.Sylt5);
        d6=(Button) findViewById(R.id.Sylt6);
        d1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), FindHospital.class));
            }
        });
        d2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FindHospital.class));
            }
        });
        d3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FindHospital.class));
            }
        });
        d4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FindHospital.class));
            }
        });
        d5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FindHospital.class));
            }
        });
        d6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),FindHospital.class));
            }
        });


    }
}