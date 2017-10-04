package com.example.android.asrtourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by jasmbo on 10/3/17.
 */

public class ToursActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction> ();

        attractions.add(new Attraction(getString(R.string.tour_AmritsarHeritageWalk_name),
                getString(R.string.tour_AmritsarHeritageWalk_address), R.drawable.heritage_walk));
        attractions.add(new Attraction(getString(R.string.tour_AmritsarWalkingTours_name),
                getString(R.string.tour_AmritsarWalkingTours_address), R.drawable.walking_tour));
        attractions.add(new Attraction(getString(R.string.tour_RainbowResorts_name),
                getString(R.string.tour_RainbowResorts_address), R.drawable.rainbow_resorts));
        attractions.add(new Attraction(getString(R.string.tour_PunjabDuckTours_name),
                getString(R.string.tour_PunjabDuckTours_address), R.drawable.duck_tours));
        attractions.add(new Attraction(getString(R.string.tour_AmritsarUrbanAdventures_name),
                getString(R.string.tour_AmritsarUrbanAdventures_address), R.drawable.urban_adventures));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.category_tours);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(adapter);


    }
}
