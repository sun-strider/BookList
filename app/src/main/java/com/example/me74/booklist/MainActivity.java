package com.example.me74.booklist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Start the other activity to show it works
        Intent earthquakeIntent = new Intent(MainActivity.this, EarthquakeActivity.class);
        startActivity(earthquakeIntent);
    }
}
