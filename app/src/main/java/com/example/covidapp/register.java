package com.example.covidapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class register<fauth> extends AppCompatActivity {
    FirebaseAuth fauth;
    EditText Phoneno,codeenter;
    Button Nextbtn;
    ProgressBar progressBar;
    fauth = FirebaseAuth.getInstance();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        //Button login
    }
}