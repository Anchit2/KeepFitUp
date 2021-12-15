package com.example.keepfitup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Meditation_Page extends AppCompatActivity {
    LinearLayout medi1,medi2,medi3,medi4,medi5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation_page);

        medi1= findViewById(R.id.medi1);
        medi2= findViewById(R.id.medi2);
        medi3= findViewById(R.id.medi3);
        medi4= findViewById(R.id.medi4);
        medi5= findViewById(R.id.medi5);

        medi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Meditation_Page.this,Medex1.class));
            }
        });

        medi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Meditation_Page.this,Medex2.class));
            }
        });

        medi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Meditation_Page.this,Medex3.class));
            }
        });

        medi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Meditation_Page.this,Medex4.class));
            }
        });

        medi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Meditation_Page.this,Medex5.class));
            }
        });

    }
}