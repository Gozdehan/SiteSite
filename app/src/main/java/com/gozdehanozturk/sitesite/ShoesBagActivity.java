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

public class ShoesBagActivity extends AppCompatActivity {

    Button aldo, ayakkabi, bambi, beta, camper, deichman, desa, dockers, matmazel, divarese, ecco, elle, flo, footlocker, greyder, hotic, inci, superstep, tanca, ninewest, tergan, macys, dsw, colehaan, clarks, jimmychoo, kurtgeiger, hudsons, skechers, bloomingdales, payless ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes_bag);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Ayakkabı & Çanta");

        aldo = (Button)findViewById(R.id.aldo);
        aldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.aldoshoes.com.tr/"));
                startActivity(viewIntent);
            }
        });

        ayakkabi = (Button)findViewById(R.id.ayakkabi);
        ayakkabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ayakkabidunyasi.com.tr/"));
                startActivity(viewIntent);
            }
        });

        bambi = (Button)findViewById(R.id.bambi);
        bambi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.bambistore.com.tr/"));
                startActivity(viewIntent);
            }
        });

        beta = (Button)findViewById(R.id.beta);
        beta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.betashoes.com/"));
                startActivity(viewIntent);
            }
        });

        camper = (Button)findViewById(R.id.camper);
        camper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.camper.com/tr_TR"));
                startActivity(viewIntent);
            }
        });

        deichman = (Button)findViewById(R.id.deichman);
        deichman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.deichmann.com/TR/tr/shop/welcome.html"));
                startActivity(viewIntent);
            }
        });

        desa = (Button)findViewById(R.id.desa);
        desa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.desa.com.tr/"));
                startActivity(viewIntent);
            }
        });

        divarese = (Button)findViewById(R.id.divarese);
        divarese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.divarese.com.tr/"));
                startActivity(viewIntent);
            }
        });

        dockers = (Button)findViewById(R.id.dockers);
        dockers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dockersturkey.com/"));
                startActivity(viewIntent);
            }
        });

        ecco = (Button)findViewById(R.id.ecco);
        ecco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://tr.ecco.com/"));
                startActivity(viewIntent);
            }
        });

        elle = (Button)findViewById(R.id.elle);
        elle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.elleshoes.com/"));
                startActivity(viewIntent);
            }
        });

        flo = (Button)findViewById(R.id.flo);
        flo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.flo.com.tr/"));
                startActivity(viewIntent);
            }
        });

        footlocker = (Button)findViewById(R.id.footlocker);
        footlocker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.footlocker.com/"));
                startActivity(viewIntent);
            }
        });

        greyder = (Button)findViewById(R.id.greyder);
        greyder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.greyder.com/"));
                startActivity(viewIntent);
            }
        });

        hotic = (Button)findViewById(R.id.hotic);
        hotic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hotic.com.tr/"));
                startActivity(viewIntent);
            }
        });

        inci = (Button)findViewById(R.id.inci);
        inci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.incideri.com/"));
                startActivity(viewIntent);
            }
        });

        tanca = (Button)findViewById(R.id.tanca);
        tanca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.kemaltanca.com.tr/"));
                startActivity(viewIntent);
            }
        });

        matmazel = (Button)findViewById(R.id.matmazel);
        matmazel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.matmazelstore.com/"));
                startActivity(viewIntent);
            }
        });

        ninewest = (Button)findViewById(R.id.ninewest);
        ninewest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ninewest.com.tr/"));
                startActivity(viewIntent);
            }
        });

        superstep = (Button)findViewById(R.id.süperstep);
        superstep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.superstep.com.tr/"));
                startActivity(viewIntent);
            }
        });

        tergan = (Button)findViewById(R.id.tergan);
        tergan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://fitchef.com.tr/"));
                startActivity(viewIntent);
            }
        });

        macys = (Button)findViewById(R.id.macys);
        macys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.macys.com/"));
                startActivity(viewIntent);
            }
        });

        clarks = (Button)findViewById(R.id.clarks);
        clarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.clarks.com.tr/"));
                startActivity(viewIntent);
            }
        });

        jimmychoo = (Button)findViewById(R.id.jimmychoo);
        jimmychoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://row.jimmychoo.com/en/home"));
                startActivity(viewIntent);
            }
        });

        kurtgeiger = (Button)findViewById(R.id.kurtgeiger);
        kurtgeiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.kurtgeiger.com/"));
                startActivity(viewIntent);
            }
        });

        hudsons = (Button)findViewById(R.id.hudsons);
        hudsons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.thebay.com/webapp/wcs/stores/servlet/en/thebay"));
                startActivity(viewIntent);
            }
        });

        bloomingdales = (Button)findViewById(R.id.bloomingdales);
        bloomingdales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.bloomingdales.com/"));
                startActivity(viewIntent);
            }
        });

        payless = (Button)findViewById(R.id.payless);
        payless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.payless.com/"));
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
                Intent intent = new Intent(ShoesBagActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
