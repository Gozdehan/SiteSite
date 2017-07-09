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

public class TravelActivity extends AppCompatActivity {

    Button tatilSepeti, tatilSitesi,tatilBudur, grupanya, etstur, jollytur, anitur, trivago, uzakRota, yoldaOlmak, gezgininPusulasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Seyahat & Tatil");

        tatilSepeti = (Button)findViewById(R.id.tatilsepet);
        tatilSepeti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.tatilsepeti.com/"));
                startActivity(viewIntent);
            }
        });

        tatilSitesi = (Button)findViewById(R.id.tatilsitesi);
        tatilSitesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.tatilsitesi.com/"));
                startActivity(viewIntent);
            }
        });

        tatilBudur = (Button)findViewById(R.id.tbudur);
        tatilBudur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.tatilbudur.com/"));
                startActivity(viewIntent);
            }
        });

        grupanya = (Button)findViewById(R.id.grupanya);
        grupanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.grupanya.com/"));
                startActivity(viewIntent);
            }
        });


        etstur = (Button)findViewById(R.id.ets);
        etstur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.etstur.com/"));
                startActivity(viewIntent);
            }
        });

        jollytur = (Button)findViewById(R.id.jolly);
        jollytur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.jollytur.com/"));
                startActivity(viewIntent);
            }
        });

        anitur = (Button)findViewById(R.id.ani);
        anitur.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.anitur.com.tr/"));
                startActivity(viewIntent);
            }
        });

        trivago = (Button)findViewById(R.id.trivago);
        trivago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.trivago.com.tr/"));
                startActivity(viewIntent);
            }
        });

        uzakRota = (Button)findViewById(R.id.rota);
        uzakRota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.uzakrota.com/"));
                startActivity(viewIntent);
            }
        });

        yoldaOlmak = (Button)findViewById(R.id.yolda);
        yoldaOlmak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://yoldaolmak.com/"));
                startActivity(viewIntent);
            }
        });


        gezgininPusulasi = (Button)findViewById(R.id.pusula);
        gezgininPusulasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://gezgininpusulasi.com/"));
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
                Intent intent = new Intent(TravelActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
