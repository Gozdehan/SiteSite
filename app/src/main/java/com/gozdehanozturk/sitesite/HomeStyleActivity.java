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

public class HomeStyleActivity extends AppCompatActivity {

    Button chakra, bernardo, coco, homesweet, evmanya, yatas, bellona, istikbal, bauhaus, korkmaz, jumbo,englishhome,enplus,fakir,enza,
            mudo, karaca, linens, özdilek, zarahome, pasabahce, schafer, tefal, tac, ikea, koctas, evidea, dekorazon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_style);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Ev Tekstili");

        enza = (Button)findViewById(R.id.enza);
        enza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.enzahome.com.tr/"));
                startActivity(viewIntent);
            }
        });

        enplus = (Button)findViewById(R.id.enplus);
        enplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.enplus.com.tr/"));
                startActivity(viewIntent);
            }
        });

        fakir = (Button)findViewById(R.id.fakir);
        fakir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://fakir.com.tr/"));
                startActivity(viewIntent);
            }
        });


        jumbo = (Button)findViewById(R.id.jumbo);
        jumbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.jumbo.com.tr/"));
                startActivity(viewIntent);
            }
        });

        englishhome = (Button)findViewById(R.id.englishhome);
        englishhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.englishhome.com.tr/"));
                startActivity(viewIntent);
            }
        });


        chakra = (Button)findViewById(R.id.chakra);
        chakra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.chakra.com.tr/"));
                startActivity(viewIntent);
            }
        });

        bernardo = (Button)findViewById(R.id.bernardo);
        bernardo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.bernardo.com.tr/"));
                startActivity(viewIntent);
            }
        });

        coco = (Button)findViewById(R.id.coco);
        coco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.madamecoco.com/"));
                startActivity(viewIntent);
            }
        });

        homesweet = (Button)findViewById(R.id.homesweet);
        homesweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.homesweethome.com.tr/"));
                startActivity(viewIntent);
            }
        });

        evmanya = (Button)findViewById(R.id.evmanya);
        evmanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.evmanya.com/"));
                startActivity(viewIntent);
            }
        });

        yatas = (Button)findViewById(R.id.yatas);
        yatas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.yatasbedding.com.tr/"));
                startActivity(viewIntent);
            }
        });

        bellona = (Button)findViewById(R.id.bellona);
        bellona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.bellona.com.tr/"));
                startActivity(viewIntent);
            }
        });

        istikbal = (Button)findViewById(R.id.istikbal);
        istikbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.istikbal.com.tr/"));
                startActivity(viewIntent);
            }
        });

        bauhaus = (Button)findViewById(R.id.bauhaus);
        bauhaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.bauhaus.com.tr/"));
                startActivity(viewIntent);
            }
        });

        korkmaz = (Button)findViewById(R.id.korkmaz);
        korkmaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.korkmaz.com.tr/"));
                startActivity(viewIntent);
            }
        });

        mudo = (Button)findViewById(R.id.mudo);
        mudo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.mudo.com.tr/ev-mobilya/"));
                startActivity(viewIntent);
            }
        });

        karaca = (Button)findViewById(R.id.karaca);
        karaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.krc.com.tr/"));
                startActivity(viewIntent);
            }
        });

        linens = (Button)findViewById(R.id.linens);
        linens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.linens.com.tr/"));
                startActivity(viewIntent);
            }
        });

        özdilek = (Button)findViewById(R.id.ozdilek);
        özdilek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ozdilek.com.tr/"));
                startActivity(viewIntent);
            }
        });

        zarahome = (Button)findViewById(R.id.zarahome);
        zarahome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.zarahome.com/tr/"));
                startActivity(viewIntent);
            }
        });

        pasabahce = (Button)findViewById(R.id.pasabahce);
        pasabahce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.pasabahce.com/tr"));
                startActivity(viewIntent);
            }
        });

        schafer = (Button)findViewById(R.id.schafer);
        schafer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.schafer.com.tr/"));
                startActivity(viewIntent);
            }
        });

        tefal = (Button)findViewById(R.id.tefal);
        tefal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.tefalshop.com.tr/"));
                startActivity(viewIntent);
            }
        });

        tac = (Button)findViewById(R.id.tac);
        tac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.tac.com.tr/"));
                startActivity(viewIntent);
            }
        });

        ikea = (Button)findViewById(R.id.ikea);
        ikea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ikea.com.tr/"));
                startActivity(viewIntent);
            }
        });

        koctas = (Button)findViewById(R.id.koctas);
        koctas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.koctas.com.tr/"));
                startActivity(viewIntent);
            }
        });

        evidea = (Button)findViewById(R.id.evidea);
        evidea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.evidea.com/"));
                startActivity(viewIntent);
            }
        });

        dekorazon = (Button)findViewById(R.id.dekorazon);
        dekorazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dekorazon.com/"));
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
                Intent intent = new Intent(HomeStyleActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
