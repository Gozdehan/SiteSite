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

public class NewsActivity extends AppCompatActivity {

    Button onedio, aa, cnnTürk, dha, ensonhaber, gazeteoku, gercekgündem, haber7, habertürk,
    ntv, trt, bbc, fox, cnn, cnbc, independent, huffpost, newyorktimes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Haberler");

        onedio = (Button)findViewById(R.id.onedio);
        onedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://onedio.com/"));
                startActivity(viewIntent);
            }
        });

        aa = (Button)findViewById(R.id.aa);
        aa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://aa.com.tr/tr"));
                startActivity(viewIntent);
            }
        });

        cnnTürk = (Button)findViewById(R.id.cnn);
        cnnTürk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.cnnturk.com/"));
                startActivity(viewIntent);
            }
        });

        dha = (Button)findViewById(R.id.dha);
        dha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dha.com.tr/"));
                startActivity(viewIntent);
            }
        });

        ensonhaber = (Button)findViewById(R.id.ensonhbr);
        ensonhaber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.ensonhaber.com/"));
                startActivity(viewIntent);
            }
        });

        gazeteoku = (Button)findViewById(R.id.gazete);
        gazeteoku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.gazeteoku.com/"));
                startActivity(viewIntent);
            }
        });

        gercekgündem = (Button)findViewById(R.id.gundem);
        gercekgündem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.gercekgundem.com/"));
                startActivity(viewIntent);
            }
        });

        haber7 = (Button)findViewById(R.id.haber7);
        haber7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.haber7.com/"));
                startActivity(viewIntent);
            }
        });

        habertürk = (Button)findViewById(R.id.haberturk);
        habertürk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.haberturk.com/"));
                startActivity(viewIntent);
            }
        });

        ntv = (Button)findViewById(R.id.ntv);
        ntv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.ntv.com.tr/"));
                startActivity(viewIntent);
            }
        });

        trt = (Button)findViewById(R.id.trt);
        trt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.trthaber.com/"));
                startActivity(viewIntent);
            }
        });

        bbc = (Button)findViewById(R.id.bbc);
        bbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.bbc.com/news"));
                startActivity(viewIntent);
            }
        });

        fox = (Button)findViewById(R.id.fox);
        fox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.foxnews.com/"));
                startActivity(viewIntent);
            }
        });

        cnn = (Button)findViewById(R.id.cnnYabanci);
        cnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://edition.cnn.com/"));
                startActivity(viewIntent);
            }
        });

        cnbc = (Button)findViewById(R.id.cnbc);
        cnbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.cnbc.com/world/?region=world"));
                startActivity(viewIntent);
            }
        });

        independent = (Button)findViewById(R.id.independent);
        independent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.independent.co.uk/"));
                startActivity(viewIntent);
            }
        });

        huffpost = (Button)findViewById(R.id.huffpost);
        huffpost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.huffingtonpost.com/"));
                startActivity(viewIntent);
            }
        });

        newyorktimes = (Button)findViewById(R.id.newyorktimes);
        newyorktimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.nytimes.com/"));
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
                Intent intent = new Intent(NewsActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
