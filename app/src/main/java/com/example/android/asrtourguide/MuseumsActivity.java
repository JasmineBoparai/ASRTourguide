package com.example.android.asrtourguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by jasmbo on 10/3/17.
 */

public class MuseumsActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_list);

        final ArrayList<Attraction> attractions = new ArrayList<Attraction> ();

        attractions.add(new Attraction(getString(R.string.museum_MaharajaRanjitSinghMuseum_name),
                getString(R.string.museum_MaharajaRanjitSinghMuseum_address), R.drawable.maharaja_ranjitsingh));
        attractions.add(new Attraction(getString(R.string.museum_ThePartitionMuseum_name),
                getString(R.string.museum_ThePartitionMuseum_address), R.drawable.partition_museum));
        attractions.add(new Attraction(getString(R.string.museum_CompanyBagh_name),
                getString(R.string.museum_CompanyBagh_address), R.drawable.company_bagh));
        attractions.add(new Attraction(getString(R.string.museum_CentralSikhMuseum_name),
                getString(R.string.museum_CentralSikhMuseum_address), R.drawable.central_sikh_museum));

        AttractionAdapter adapter = new AttractionAdapter(this, attractions, R.color.category_museums);

        ListView listView = (ListView) findViewById(R.id.item_list);

        listView.setAdapter(adapter);


    }
}
