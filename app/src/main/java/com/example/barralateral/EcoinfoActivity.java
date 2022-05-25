package com.example.barralateral;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EcoinfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecoinfo);
        getSupportActionBar().hide();
    }
}