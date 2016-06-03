package com.example.austinmarks.conjoin;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import com.android.volley.Response;
import com.yelp.clientlib.connection.YelpAPI;
import com.yelp.clientlib.connection.YelpAPIFactory;
import com.yelp.clientlib.entities.Coordinate;
import com.yelp.clientlib.entities.Location;
import com.yelp.clientlib.entities.SearchResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ApplyMapView extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_map_apply);

        // YelpAPIFactory apiFactory = new YelpAPIFactory(wJLwfEo_cv9gnZLzl6mSKQ, QxDo_z31VvI_nQYgoCZ17iF7uws, snPQj-V9vZd19Y7t3nBh93fW9eiZ4AXY, gXrNUK9vm1J5xVuGLf0C90S-REU);
        //YelpAPI yelpAPI = apiFactory.createAPI();

        Map<String, String> params = new HashMap<>();
        params.put("term", "Art Galleries");
        params.put("term", "Tours");
        params.put("term", "Out Door Movies");
        params.put("term", "Hiking");
        params.put("term", "Restaurants");
        params.put("term", "Shopping");
        params.put("term", "Kids Activities");
        params.put("term", "Beach");
        params.put("term", "Museums");
        params.put("term", "Night Life");

        //Call<SearchResponse> call = yelpAPI.search("Los Angeles", params);
        //Response<SearchResponse> response = call.execute();

        String sPosition = getIntent().getStringExtra("type");

        Location location = new Location() {
            @Override
            public ArrayList<String> address() {
                return null;
            }

            @Override
            public String city() {
                return null;
            }

            @Override
            public Coordinate coordinate() {
                return null;
            }

            @Override
            public String countryCode() {
                return null;
            }

            @Override
            public String crossStreets() {
                return null;
            }

            @Override
            public ArrayList<String> displayAddress() {
                return null;
            }

            @Override
            public Double geoAccuracy() {
                return null;
            }

            @Override
            public ArrayList<String> neighborhoods() {
                return null;
            }

            @Override
            public String postalCode() {
                return null;
            }

            @Override
            public String stateCode() {
                return null;

            }
        };

        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                sPosition = null;

            } else {
                sPosition = extras.getString("type");

                if(extras.getSerializable("type") == "Art Galleries"){

                }
                else if(extras.getSerializable("type") == "Tours"){

                }
                else if(extras.getSerializable("type") == "Out Door Movies"){

                }
                else if(extras.getSerializable("type") == "Hiking"){

                }
                else if(extras.getSerializable("type") == "Restaurants"){

                }
                else if(extras.getSerializable("type") == "Shopping"){

                }
                else if(extras.getSerializable("type") == "Kids Activities"){

                }
                else if(extras.getSerializable("type") == "Beach"){

                }
                else if(extras.getSerializable("type") == "Museums"){

                }
                else if(extras.getSerializable("type") == "Night Life"){

                }
            }
        } else {
            sPosition = (String) savedInstanceState.getSerializable("type");
        }

    }


}
