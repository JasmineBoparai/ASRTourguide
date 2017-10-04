package com.example.android.asrtourguide;

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

        // Find the View that shows the transport category
        TextView transport = (TextView) findViewById(R.id.transport);

        // Set a click listener on that View
        transport.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link TransportActivity}
                Intent transportIntent = new Intent(MainActivity.this, TransportActivity.class);

                // Start the new activity
                startActivity(transportIntent);
            }
        });

        // Find the View that shows the sights category
        TextView sights = (TextView) findViewById(R.id.sights);

        // Set a click listener on that View
        sights.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link SightsActivity}
                Intent sightsIntent = new Intent(MainActivity.this, SightsActivity.class);

                // Start the new activity
                startActivity(sightsIntent);
            }
        });

        // Find the View that shows the museums category
        TextView museums = (TextView) findViewById(R.id.museums);

        // Set a click listener on that View
        museums.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MuseumsActivity}
                Intent museumsIntent = new Intent(MainActivity.this, MuseumsActivity.class);

                // Start the new activity
                startActivity(museumsIntent);
            }
        });

        // Find the View that shows the tours category
        TextView tours = (TextView) findViewById(R.id.tours);

        // Set a click listener on that View
        tours.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ToursActivity}
                Intent toursIntent = new Intent(MainActivity.this, ToursActivity.class);

                // Start the new activity
                startActivity(toursIntent);
            }
        });
    }
}
