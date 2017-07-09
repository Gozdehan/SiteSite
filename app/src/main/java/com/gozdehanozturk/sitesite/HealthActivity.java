package com.gozdehanozturk.sitesite;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class HealthActivity extends AppCompatActivity {

    Button mhrs, nabiz, bebek, tıprehberi, hastarehberi, hepsaglik, saglikveyasamsitesi, ailem, istEczaneleri, bilgiDoktoru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Sağlık");

        mhrs = (Button)findViewById(R.id.mhrs);
        mhrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.mhrs.gov.tr/Vatandas/"));
                startActivity(viewIntent);
            }
        });

        nabiz = (Button)findViewById(R.id.nabız);
        nabiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://enabiz.gov.tr/Giris.aspx"));
                startActivity(viewIntent);
            }
        });

        bebek = (Button)findViewById(R.id.bebek);
        bebek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.e-bebek.com/"));
                startActivity(viewIntent);
            }
        });

        tıprehberi = (Button)findViewById(R.id.tıp);
        tıprehberi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.tiprehberi.com/"));
                startActivity(viewIntent);
            }
        });


        hastarehberi = (Button)findViewById(R.id.hastarehber);
        hastarehberi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hastarehberi.com/"));
                startActivity(viewIntent);
            }
        });

        hepsaglik = (Button)findViewById(R.id.hepsaglik);
        hepsaglik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hepsaglik.net/"));
                startActivity(viewIntent);
            }
        });

        saglikveyasamsitesi = (Button)findViewById(R.id.saglikveyasam);
        saglikveyasamsitesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.saglikveyasam.com/"));
                startActivity(viewIntent);
            }
        });

        ailem = (Button)findViewById(R.id.aılem);
        ailem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.ailem.com/"));
                startActivity(viewIntent);
            }
        });

        istEczaneleri = (Button)findViewById(R.id.eczane);
        istEczaneleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.uzakrota.com/"));
                startActivity(viewIntent);
            }
        });

        bilgiDoktoru = (Button)findViewById(R.id.bilgiDoktoru);
        bilgiDoktoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW",Uri.parse("http://www.bilgidoktoru.com/"));
                startActivity(viewIntent);
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.menuId:
                Intent intent = new Intent(HealthActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
