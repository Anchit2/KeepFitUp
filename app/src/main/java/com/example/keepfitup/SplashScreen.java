package com.example.keepfitup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import static androidx.core.content.ContextCompat.startActivity;

public class SplashScreen extends AppCompatActivity {
    TextView splashtext,text3;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

//        getSupportActionBar().hide();
        splashtext= findViewById(R.id.splashtext);
        text3=findViewById(R.id.text3);
        animation= AnimationUtils.loadAnimation(this,R.anim.animation);

        text3.setAnimation(animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this,RegistrationPage.class));
                finish();
            }
        },3000);

    }
}