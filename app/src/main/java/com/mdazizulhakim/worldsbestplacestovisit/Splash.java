package com.mdazizulhakim.worldsbestplacestovisit;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash extends AppCompatActivity {

    private static  int timeout = 4000;
    ImageView imgSplash;
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imgSplash = (ImageView) findViewById(R.id.imgSplash);

        actionBar = getSupportActionBar();
        actionBar.hide();


        Animation rotate = AnimationUtils.loadAnimation(Splash.this,R.anim.rotate);
        imgSplash.startAnimation(rotate);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this,MainActivity.class);
                startActivity(intent);

                finish();
            }
        },timeout);
    }
}
