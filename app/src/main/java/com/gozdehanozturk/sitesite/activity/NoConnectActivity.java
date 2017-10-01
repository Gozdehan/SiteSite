package com.gozdehanozturk.sitesite.activity;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.gozdehanozturk.sitesite.R;

public class NoConnectActivity extends AppCompatActivity {
    Button mConnect;

    private boolean isNetworkConnected(){
        ConnectivityManager cm = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        return cm.getActiveNetworkInfo() != null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_connect);

        mConnect = (Button)findViewById(R.id.connectBtn);
        mConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isNetworkConnected()){
                    Intent i = new Intent(NoConnectActivity.this,MainActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}
