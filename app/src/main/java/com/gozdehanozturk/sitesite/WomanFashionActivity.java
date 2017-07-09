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

public class WomanFashionActivity extends AppCompatActivity {

    Button adilısık, batik, faiksonmez, forevernew, ipekyol, oleg, oxxo, pologarage, roman, twist, yargici, veromoda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_woman_fashion);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Kadın Giyim");

        adilısık = (Button)findViewById(R.id.adil);
        adilısık.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.adl.com.tr/tr/"));
                startActivity(viewIntent);
            }
        });

        batik = (Button)findViewById(R.id.batik);
        batik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.batik.com.tr/"));
                startActivity(viewIntent);
            }
        });

        faiksonmez = (Button)findViewById(R.id.faik);
        faiksonmez.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.faiksonmez.com/"));
                startActivity(viewIntent);
            }
        });

        forevernew = (Button)findViewById(R.id.forevernew);
        forevernew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.forevernew.com.tr/"));
                startActivity(viewIntent);
            }
        });

        ipekyol = (Button)findViewById(R.id.ipekyol);
        ipekyol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ipekyol.com.tr/"));
                startActivity(viewIntent);
            }
        });

        oleg = (Button)findViewById(R.id.oleg);
        oleg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.olegcassini.com.tr/"));
                startActivity(viewIntent);
            }
        });

        oxxo = (Button)findViewById(R.id.oxxo);
        oxxo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.oxxo.com.tr/"));
                startActivity(viewIntent);
            }
        });

        pologarage = (Button)findViewById(R.id.pologarage);
        pologarage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.pologarage.com/"));
                startActivity(viewIntent);
            }
        });

        roman = (Button)findViewById(R.id.roman);
        roman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.roman.com.tr/"));
                startActivity(viewIntent);
            }
        });

        yargici = (Button)findViewById(R.id.yargici);
        yargici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.yargici.com.tr/"));
                startActivity(viewIntent);
            }
        });

        veromoda = (Button)findViewById(R.id.veromoda);
        veromoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.veromoda.com/on/demandware.store/Sites-vm-root-Site/default/Country-Show"));
                startActivity(viewIntent);
            }
        });

        twist = (Button)findViewById(R.id.twist);
        twist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.twist.com.tr/"));
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
                Intent intent = new Intent(WomanFashionActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
