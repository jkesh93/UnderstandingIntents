package com.example.jay.understandingintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_one);
    }

    public void goToActA(View view){
        Intent intent = new Intent(this, ActA.class);
        startActivity(intent);

    }

    public void goToActB(View view){
        Intent intent = new Intent(this, ActB.class);
        startActivity(intent);

    }
}
