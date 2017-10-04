package com.example.android.asrtourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by jasmbo on 10/3/17.
 */

public class SightsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction> ();

        attractions.add(new Attraction(getString(R.string.sight_HarmandirSahib_name),
                getString(R.string.sight_HarmandirSahib_address), R.drawable.harmandir_sahib));
        attractions.add(new Attraction(getString(R.string.sight_JallianwalaBagh_name),
                getString(R.string.sight_JallianwalaBagh_address), R.drawable.jallianwala_bagh));
        attractions.add(new Attraction(getString(R.string.sight_DurgianaTemple_name),
                getString(R.string.sight_DurgianaTemple_address), R.drawable.durgiana_mandir));
        attractions.add(new Attraction(getString(R.string.sight_GobindgarhFort_name),
                getString(R.string.sight_GobindgarhFort_address), R.drawable.gobindgarh_fort));
        attractions.add(new Attraction(getString(R.string.sight_KhalsaCollege_name),
                getString(R.string.sight_KhalsaCollege_address), R.drawable.khalsa_college));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.category_sights);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(adapter);

    }

}

