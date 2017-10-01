package com.gozdehanozturk.sitesite.activity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gozdehanozturk.sitesite.R;

public class MainActivity extends AppCompatActivity {

    private boolean isNetworkConnected(){
        ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(isNetworkConnected()){

            Intent intent = new Intent(MainActivity.this,CategoriesActivity.class);
            startActivity(intent);
            finish();
        }
        else{
            Intent intent = new Intent(MainActivity.this,NoConnectActivity.class);
            startActivity(intent);
            finish();
        }

    }
}
