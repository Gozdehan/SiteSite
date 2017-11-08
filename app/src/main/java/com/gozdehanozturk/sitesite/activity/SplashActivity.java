package com.gozdehanozturk.sitesite.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.gozdehanozturk.sitesite.R;


public class SplashActivity extends AppCompatActivity implements Animation.AnimationListener {
    public Animation animation;
    ImageView splashIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        splashIcon = (ImageView)findViewById(R.id.splash_icon);
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animscreen);
        splashIcon.startAnimation(animation);
        animation.setAnimationListener(this);
    }


    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {
        startActivity(new Intent(SplashActivity.this,MainActivity.class));
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
