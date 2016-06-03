package com.example.austinmarks.conjoin;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;


import java.util.ArrayList;
import java.util.List;

public class SearchScreen extends Activity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_search);

        //List for the drop down menu for selecting what you want to do
        final List<String> spinnerArray = new ArrayList<String>();
        spinnerArray.add("Art Galleries");
        spinnerArray.add("Tours");
        spinnerArray.add("Out Door Movies");
        spinnerArray.add("Hiking");
        spinnerArray.add("Restaurants");
        spinnerArray.add("Shopping");
        spinnerArray.add("Kids Activities");
        spinnerArray.add("Beach");
        spinnerArray.add("Museums");
        spinnerArray.add("Night Life");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, spinnerArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = (Spinner) findViewById(R.id.SSpinner);
        sItems.setAdapter(adapter);

        sItems.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                final Intent intent = new Intent(SearchScreen.this, ApplyMapView.class);
                intent.putExtra("type", spinnerArray.get(position));
                startActivity(intent);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
















