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
import android.widget.Toast;

public class ManFashionActivity extends AppCompatActivity {
    Button avva, damat, jack, kigılı, efor, süvari, fabrika, altinyildiz, ramsey, cacharel, hatemoglu, igs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_fashion);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Erkek Giyim");

        avva = (Button)findViewById(R.id.avva);
        avva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.avva.com.tr/"));
                startActivity(viewIntent);
            }
        });


        damat = (Button)findViewById(R.id.damat);
        damat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.damattween.com/"));
                startActivity(viewIntent);
            }
        });

        hatemoglu = (Button)findViewById(R.id.hatemoglu);
        hatemoglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hatemoglu.com/tr/"));
                startActivity(viewIntent);
            }
        });

        igs = (Button)findViewById(R.id.igs);
        igs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.igs.com.tr/"));
                startActivity(viewIntent);
            }
        });



        jack = (Button)findViewById(R.id.jack);
        jack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.jackjones.com/on/demandware.store/Sites-jj-root-Site/default/Country-Show"));
                startActivity(viewIntent);
            }
        });

        kigılı = (Button)findViewById(R.id.kigili);
        kigılı.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.kigili.com/"));
                startActivity(viewIntent);
            }
        });

        efor = (Button)findViewById(R.id.efor);
        efor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://efor.com.tr/"));
                startActivity(viewIntent);
            }
        });

        süvari = (Button)findViewById(R.id.süvari);
        süvari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.suvari.com.tr/tr/"));
                startActivity(viewIntent);
            }
        });

        ramsey = (Button)findViewById(R.id.ramsey);
        ramsey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ramsey.com.tr/"));
                startActivity(viewIntent);
            }
        });

        cacharel = (Button)findViewById(R.id.cacharel);
        cacharel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.cacharel.com.tr/"));
                startActivity(viewIntent);
            }
        });

        altinyildiz = (Button)findViewById(R.id.altinyildiz);
        altinyildiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.altinyildizclassics.com/"));
                startActivity(viewIntent);
            }
        });

        fabrika = (Button)findViewById(R.id.fabrika);
        fabrika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ManFashionActivity.this,"Boyner'in sitesinden Fabrika'nın ürünlerine ulaşabilirsiniz.",Toast.LENGTH_LONG).show();
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

        switch (item.getItemId()) {
            case R.id.menuId:
                Intent intent = new Intent(ManFashionActivity.this, CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
