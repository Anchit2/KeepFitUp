package com.example.keepfitup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Workoutpage extends AppCompatActivity {
    LinearLayout wout1,wout2,wout3,wout4,wout5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_workoutpage);

        wout1=findViewById(R.id.woutone);
        wout2=findViewById(R.id.wouttwo);
        wout3=findViewById(R.id.woutthree);
        wout4=findViewById(R.id.woutfour);
        wout5=findViewById(R.id.woutfive);

        wout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Workoutpage.this,Workex1.class));
            }
        });

        wout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Workoutpage.this,Workex2.class));
            }
        });

        wout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Workoutpage.this,Workex3.class));
            }
        });

        wout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Workoutpage.this,Workex4.class));
            }
        });

        wout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Workoutpage.this,Workex5.class));
            }
        });



    }
}