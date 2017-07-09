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

public class FoodActivity extends AppCompatActivity {

    Button yemekSepeti, sofra,yemekTarifleri,nefisYemekTarifleri,yemek,lezzet,fitchef,yemekMotoru,adreseYemek,neYesem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Yemek");

        yemekSepeti = (Button)findViewById(R.id.yemeksepet);
        yemekSepeti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.yemeksepeti.com/"));
                startActivity(viewIntent);
            }
        });

        sofra = (Button)findViewById(R.id.sofra);
        sofra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.sofra.com/"));
                startActivity(viewIntent);
            }
        });

        yemekTarifleri = (Button)findViewById(R.id.ytarif);
        yemekTarifleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.yemektarifleri.com/"));
                startActivity(viewIntent);
            }
        });

        nefisYemekTarifleri = (Button)findViewById(R.id.nytarif);
        nefisYemekTarifleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.nefisyemektarifleri.com/"));
                startActivity(viewIntent);
            }
        });

        yemek = (Button)findViewById(R.id.yemek);
        yemek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://yemek.com/"));
                startActivity(viewIntent);
            }
        });

        lezzet = (Button)findViewById(R.id.lezzet);
        lezzet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.lezzet.com.tr/"));
                startActivity(viewIntent);
            }
        });

        fitchef = (Button)findViewById(R.id.fitchef);
        fitchef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://fitchef.com.tr/"));
                startActivity(viewIntent);
            }
        });

        yemekMotoru = (Button)findViewById(R.id.yemekmotoru);
        yemekMotoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.yemekmotoru.com/"));
                startActivity(viewIntent);
            }
        });

        adreseYemek = (Button)findViewById(R.id.adreseyemek);
        adreseYemek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.adreseyemek.com/"));
                startActivity(viewIntent);
            }
        });

        neYesem = (Button)findViewById(R.id.neyesem);
        neYesem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.neyemekyesem.com/"));
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
                Intent intent = new Intent(FoodActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
