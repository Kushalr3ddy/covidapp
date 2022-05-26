package com.example.covidapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Button self_asses = (Button)findViewById(R.id.button1);
        Button vaccinate = (Button)findViewById(R.id.button2);
        TextView terms = (TextView)findViewById(R.id.terms);

        self_asses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent next = new Intent(activity2.this, com.example.first_app.self_assessment.class);
                startActivity(next);
            }
        });
        vaccinate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://selfregistration.cowin.gov.in/"));
                startActivity(browserIntent);
            }
        });

        terms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent show_terms = new Intent(activity2.this, com.example.first_app.terms_page.class);
                startActivity(show_terms);

            }
        });
    }




}