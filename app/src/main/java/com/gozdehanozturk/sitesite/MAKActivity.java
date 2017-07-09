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

public class MAKActivity extends AppCompatActivity {

    Button swatch, swarovski, sochic, casio, diesel, citizen, boss, fossil, atasay, altinbas, assos, zen, gülaylar, azuris, boybeyi, chiccy,
    pandora, prego, saatsaat, burberry, armani, kors, accessorize;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mak);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Saat&Aksesuar&Mücevher");

        swatch = (Button)findViewById(R.id.swatch);
        swatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.swatch.com/tr_tr/"));
                startActivity(viewIntent);
            }
        });

        saatsaat = (Button)findViewById(R.id.saatsaat);
        saatsaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.saatvesaat.com.tr/"));
                startActivity(viewIntent);
            }
        });

        swarovski = (Button)findViewById(R.id.swarovski);
        swarovski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.swarovski.com/Web_TR/tr/index"));
                startActivity(viewIntent);
            }
        });

        casio = (Button)findViewById(R.id.casio);
        casio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.casio-intl.com/tr/tr/"));
                startActivity(viewIntent);
            }
        });

        diesel = (Button)findViewById(R.id.diesel);
        diesel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://global.diesel.com/homepage?origin=NOUS"));
                startActivity(viewIntent);
            }
        });


        citizen = (Button)findViewById(R.id.citizen);
        citizen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.citizenwatch.com/en-us/"));
                startActivity(viewIntent);
            }
        });

        boss = (Button)findViewById(R.id.boss);
        boss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hugoboss.com/men-watches/"));
                startActivity(viewIntent);
            }
        });

        fossil = (Button)findViewById(R.id.fossil);
        fossil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.fossil.com/us/en.html?borderFreeCountry=n"));
                startActivity(viewIntent);
            }
        });

        atasay = (Button)findViewById(R.id.atasay);
        atasay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.atasay.com/"));
                startActivity(viewIntent);
            }
        });

        altinbas = (Button)findViewById(R.id.altinbas);
        altinbas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.altinbas.com/"));
                startActivity(viewIntent);
            }
        });

        assos = (Button)findViewById(R.id.assos);
        assos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.assospirlanta.com/"));
                startActivity(viewIntent);
            }
        });

        zen = (Button)findViewById(R.id.zen);
        zen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.zenpirlanta.com/"));
                startActivity(viewIntent);
            }
        });

        gülaylar = (Button)findViewById(R.id.gülaylar);
        gülaylar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://gulaylar.com/"));
                startActivity(viewIntent);
            }
        });

        azuris = (Button)findViewById(R.id.azuris);
        azuris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.azuris.com.tr/"));
                startActivity(viewIntent);
            }
        });

        boybeyi = (Button)findViewById(R.id.boybeyi);
        boybeyi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.boybeyi.com/"));
                startActivity(viewIntent);
            }
        });

        chiccy = (Button)findViewById(R.id.chiccy);
        chiccy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://shop.chiccy.com/"));
                startActivity(viewIntent);
            }
        });

        sochic = (Button)findViewById(R.id.sochic);
        sochic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.sochic.com.tr/"));
                startActivity(viewIntent);
            }
        });


        pandora = (Button)findViewById(R.id.pandora);
        pandora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.pandora.net/tr-tr"));
                startActivity(viewIntent);
            }
        });

        prego = (Button)findViewById(R.id.prego);
        prego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.pandora.net/tr-tr"));
                startActivity(viewIntent);
            }
        });

        burberry = (Button)findViewById(R.id.burberry);
        burberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.burberry.com/"));
                startActivity(viewIntent);
            }
        });

        armani = (Button)findViewById(R.id.armani);
        armani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.armaniexchange.com/countries/index"));
                startActivity(viewIntent);
            }
        });

        kors = (Button)findViewById(R.id.kors);
        kors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.michaelkors.com/"));
                startActivity(viewIntent);
            }
        });

        accessorize = (Button)findViewById(R.id.accessorize);
        accessorize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://uk.accessorize.com/"));
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
                Intent intent = new Intent(MAKActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
