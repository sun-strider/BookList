package com.example.me74.booklist;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the search TextView
        TextView search = (TextView) findViewById(R.id.search_view);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the other activity to show it works
                Intent earthquakeIntent = new Intent(MainActivity.this, EarthquakeActivity.class);
                startActivity(earthquakeIntent);
            }
        });

    }
}
