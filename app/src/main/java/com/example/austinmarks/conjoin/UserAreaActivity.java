package com.example.austinmarks.conjoin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class UserAreaActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    Spinner InterestSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        InterestSpinner = (Spinner) findViewById(R.id.spinInterest);

        ArrayAdapter adapter = ArrayAdapter.createFromResource(this,R.array.Interest,android.R.layout.simple_spinner_dropdown_item);
        InterestSpinner.setAdapter(adapter);
        InterestSpinner.setOnItemSelectedListener(this);

        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etAge = (EditText) findViewById(R.id.etAge);
        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);
        final Button bAttractions = (Button) findViewById(R.id.bAttractions);

        bAttractions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent attractionsIntent = new Intent(UserAreaActivity.this, SearchScreen.class);
                UserAreaActivity.this.startActivity(attractionsIntent);

            }
        });

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        String email = intent.getStringExtra("email");
        int age = intent.getIntExtra("age", -1);

        String message = name + " Welcome to your user area";
        welcomeMessage.setText(message);
        etUsername.setText(username);
        etAge.setText(age + "");

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView myText = (TextView) view;
        Toast.makeText(this, "You Selected"+ myText.getText(), Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}
