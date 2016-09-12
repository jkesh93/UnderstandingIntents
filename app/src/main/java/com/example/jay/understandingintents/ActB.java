package com.example.jay.understandingintents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_b);
    }

    public void back(View view){
        Intent intent = new Intent(this, MainActivityOne.class);
        startActivity(intent);

    }
}
