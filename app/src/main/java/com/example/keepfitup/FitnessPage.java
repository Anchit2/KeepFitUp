package com.example.keepfitup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FitnessPage extends AppCompatActivity {
    int[] arrexe;
    TextView tryy;
    LinearLayout fit1,fit2,fit3,fit4,fit5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_page);

        arrexe= new int[]{R.id.medi1,R.id.medi2,R.id.medi3,R.id.medi4,R.id.medi6};

        fit1=findViewById(R.id.medi1);
        fit2=findViewById(R.id.medi2);
        fit3=findViewById(R.id.medi3);
        fit4=findViewById(R.id.medi4);
        fit5=findViewById(R.id.medi6);
//        tryy=findViewById(R.id.tryy);

        fit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                tryy.setText("This is a try");
                startActivity(new Intent(FitnessPage.this,Fitex1.class));
            }
        });

        fit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(FitnessPage.this,Fitex2.class));            }
        });

        fit3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FitnessPage.this,Fitex3.class));            }
        });

        fit4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FitnessPage.this,Fitex4.class));            }
        });

        fit5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FitnessPage.this,Fitex5.class));            }
        });


    }

    void btnclicked(View view){
        for (int i=0;i<arrexe.length;i++){

            if (view.getId() == arrexe[i]){
                int value=i+1;
                Log.i("First",String.valueOf(value));
                startActivity(new Intent(FitnessPage.this,Timer_Page.class));
            }

        }

    }

}