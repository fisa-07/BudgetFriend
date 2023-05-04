package com.example.budgetfriend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        TextView logo = (TextView) findViewById(R.id.logo);

        Animation alpha = AnimationUtils.loadAnimation(this,R.anim.alpha);
        logo.setAnimation(alpha);

        Intent ihome = new Intent(SplashScreen.this,HomeActivity.class);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(ihome);
                finish();
            }
        },2000);
        getSupportActionBar().hide();

    }
}