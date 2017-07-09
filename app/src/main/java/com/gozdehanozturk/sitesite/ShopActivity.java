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

public class ShopActivity extends AppCompatActivity {

    Button ebay, amazon, aliex, hepsiburada, n11, gittigidiyor, hızlıal, morhipo, trendyol, markafoni, shop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("E-Alışveriş");

        ebay = (Button)findViewById(R.id.ebay);
        ebay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.ebay.com/"));
                startActivity(viewIntent);
            }
        });

        amazon = (Button)findViewById(R.id.amazon);
        amazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.amazon.com/"));
                startActivity(viewIntent);
            }
        });

        aliex = (Button)findViewById(R.id.aliex);
        aliex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://tr.aliexpress.com/"));
                startActivity(viewIntent);
            }
        });


        hepsiburada = (Button)findViewById(R.id.hepsib);
        hepsiburada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hepsiburada.com/"));
                startActivity(viewIntent);
            }
        });

        n11 = (Button)findViewById(R.id.n11);
        n11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.n11.com/"));
                startActivity(viewIntent);
            }
        });

        gittigidiyor = (Button)findViewById(R.id.gittigidiyor);
        gittigidiyor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.gittigidiyor.com/"));
                startActivity(viewIntent);
            }
        });

        hızlıal = (Button)findViewById(R.id.hizlial);
        hızlıal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hizlial.com/"));
                startActivity(viewIntent);
            }
        });

        morhipo = (Button)findViewById(R.id.morhipo);
        morhipo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.morhipo.com/"));
                startActivity(viewIntent);
            }
        });

        trendyol = (Button)findViewById(R.id.trendyol);
        trendyol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.trendyol.com/"));
                startActivity(viewIntent);
            }
        });


        markafoni = (Button)findViewById(R.id.markafoni);
        markafoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.markafoni.com/"));
                startActivity(viewIntent);
            }
        });

        shop = (Button)findViewById(R.id.shopnord);
        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://shop.nordstrom.com/"));
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
                Intent intent = new Intent(ShopActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
