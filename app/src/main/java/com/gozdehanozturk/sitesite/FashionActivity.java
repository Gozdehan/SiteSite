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

public class FashionActivity extends AppCompatActivity {

    Button shoesBag, clothes, manFashion, womanFashion, underWear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Moda");

        shoesBag = (Button)findViewById(R.id.ayakkabicanta);
        shoesBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent(FashionActivity.this,ShoesBagActivity.class);
                startActivity(viewIntent);
            }
        });

        manFashion = (Button)findViewById(R.id.erkekgiyim);
        manFashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent(FashionActivity.this,ManFashionActivity.class);
                startActivity(viewIntent);
            }
        });

        clothes = (Button)findViewById(R.id.giyim);
        clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent(FashionActivity.this,ClothesActivity.class);
                startActivity(viewIntent);
            }
        });

        womanFashion = (Button)findViewById(R.id.kadingiyim);
        womanFashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent(FashionActivity.this,WomanFashionActivity.class);
                startActivity(viewIntent);
            }
        });

        underWear = (Button)findViewById(R.id.icgiyim);
        underWear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent(FashionActivity.this,UnderWearActivity.class);
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
                Intent intent = new Intent(FashionActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
