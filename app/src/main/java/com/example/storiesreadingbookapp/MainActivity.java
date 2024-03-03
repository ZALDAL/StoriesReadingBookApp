package com.example.storiesreadingbookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView btnSt1=findViewById(R.id.btnStory1);
        btnSt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, ReadActivity.class);
                myIntent.putExtra("key", ""); //Optional parameters
                MainActivity.this.startActivity(myIntent);
            }
        });
    }
}