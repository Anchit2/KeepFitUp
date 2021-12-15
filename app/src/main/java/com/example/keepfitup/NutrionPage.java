package com.example.keepfitup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class NutrionPage extends AppCompatActivity {
    LinearLayout nutri1,nutri2,nutri3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrion_page);

        nutri1=findViewById(R.id.nutri1);
        nutri2=findViewById(R.id.nutri2);
        nutri3=findViewById(R.id.nutri3);

        nutri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutrionPage.this,NutriMus.class));
            }
        });

        nutri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutrionPage.this,Nutrihellife.class));
            }
        });
        nutri3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(NutrionPage.this,HealthySkin.class));
            }
        });
    }
}