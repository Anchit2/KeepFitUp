package com.example.keepfitup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomePage extends AppCompatActivity {
    LinearLayout fitnesshomelayout,workouthomelayout,meditationhomelayout,yogalayout,bmilayout,nutritionlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        fitnesshomelayout=findViewById(R.id.fitnesshomelayout);
        workouthomelayout=findViewById(R.id.workouthomelayout);
        meditationhomelayout=findViewById(R.id.meditationhomelayout);
        yogalayout= findViewById(R.id.yogalayout);
        bmilayout= findViewById(R.id.bmilayout);
        nutritionlayout=findViewById(R.id.nutritionlayout);

        fitnesshomelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this,FitnessPage.class));
            }
        });

        workouthomelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this,Workoutpage.class));
            }
        });

        meditationhomelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this,Meditation_Page.class));
            }
        });

        yogalayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this,Yoga_Page.class));
            }
        });

        bmilayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this,BMIpage.class));
            }
        });

        nutritionlayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomePage.this,NutrionPage.class));
            }
        });
    }
}