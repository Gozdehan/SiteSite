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

public class TechActivity extends AppCompatActivity {

    Button webrazzi, shiftdelete, chiponline, donanimhaber, teknoSeyir, teknolojihaber, veteknoloji, teknokulis, teknotoday,
    teknosa, mediamarkt, bimeks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Teknoloji");

        webrazzi = (Button)findViewById(R.id.webrazzi);
        webrazzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://webrazzi.com/"));
                startActivity(viewIntent);
            }
        });

        shiftdelete = (Button)findViewById(R.id.shift);
        shiftdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://shiftdelete.net/"));
                startActivity(viewIntent);
            }
        });

        donanimhaber = (Button)findViewById(R.id.donanım);
        donanimhaber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.donanimhaber.com/"));
                startActivity(viewIntent);
            }
        });

        teknoSeyir = (Button)findViewById(R.id.teknoSeyir);
        teknoSeyir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://teknoseyir.com/"));
                startActivity(viewIntent);
            }
        });

        teknolojihaber = (Button)findViewById(R.id.techhaber);
        teknolojihaber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.teknolojihaber.org/"));
                startActivity(viewIntent);
            }
        });

        veteknoloji = (Button)findViewById(R.id.vetech);
        veteknoloji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.veteknoloji.net/"));
                startActivity(viewIntent);
            }
        });

        teknokulis = (Button)findViewById(R.id.kulis);
        teknokulis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.teknokulis.com/"));
                startActivity(viewIntent);
            }
        });

        teknotoday = (Button)findViewById(R.id.today);
        teknotoday.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://technotoday.com.tr/"));
                startActivity(viewIntent);
            }
        });

        teknosa = (Button)findViewById(R.id.teknosa);
        teknosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.teknosa.com/"));
                startActivity(viewIntent);
            }
        });

        mediamarkt = (Button)findViewById(R.id.media);
        mediamarkt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.mediamarkt.com.tr/"));
                startActivity(viewIntent);
            }
        });

        bimeks = (Button)findViewById(R.id.bimeks);
        bimeks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.bimeks.com.tr/"));
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
                Intent intent = new Intent(TechActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
