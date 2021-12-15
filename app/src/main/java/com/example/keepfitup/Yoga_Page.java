package com.example.keepfitup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Yoga_Page extends AppCompatActivity {
    LinearLayout yoga1,yoga2,yoga3,yoga4,yoga5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yoga_page);

        yoga1= findViewById(R.id.yoga1);
        yoga2= findViewById(R.id.yoga2);
        yoga3= findViewById(R.id.yoga3);
        yoga4= findViewById(R.id.yoga4);
        yoga5= findViewById(R.id.yoga5);

        yoga1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Yoga_Page.this,Yogaex1.class));
            }
        });

        yoga2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Yoga_Page.this,Yogaex2.class));
            }
        });

        yoga3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Yoga_Page.this,Yogaex3.class));
            }
        });

        yoga4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Yoga_Page.this,Yogaex4.class));
            }
        });

        yoga5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Yoga_Page.this,Yogaex5.class));
            }
        });

    }
}