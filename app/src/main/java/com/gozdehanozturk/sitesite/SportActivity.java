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

public class SportActivity extends AppCompatActivity {
    Button decathlon, fb, gs, bjk, ts, sporx, aspor, fotomac, sahadan, mackolik, sporoku, reebok, enderspor, newbalance, nike, adidas, puma, columbia, hummel, northface, salomon,
    jackwolfskin, spx, skechers, beınsports, tff, tvf, tbf, taf, tyf, ttf, tfgf, tmok;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Spor");

        decathlon = (Button)findViewById(R.id.decathlon);
        decathlon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.decathlon.com.tr/"));
                startActivity(viewIntent);
            }
        });

        reebok = (Button)findViewById(R.id.reebok);
        reebok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.reebok.com.tr/"));
                startActivity(viewIntent);
            }
        });

        fb = (Button)findViewById(R.id.fb);
        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.fenerbahce.org/"));
                startActivity(viewIntent);
            }
        });

        gs = (Button)findViewById(R.id.gs);
        gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.galatasaray.org/anasayfa"));
                startActivity(viewIntent);
            }
        });

        bjk = (Button)findViewById(R.id.bjk);
        bjk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.bjk.com.tr/tr"));
                startActivity(viewIntent);
            }
        });

        ts = (Button)findViewById(R.id.ts);
        ts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.trabzonspor.org.tr/tr"));
                startActivity(viewIntent);
            }
        });

        sporx = (Button)findViewById(R.id.sporx);
        sporx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.sporx.com/"));
                startActivity(viewIntent);
            }
        });

        aspor = (Button)findViewById(R.id.aspor);
        aspor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.aspor.com.tr/"));
                startActivity(viewIntent);
            }
        });

        fotomac = (Button)findViewById(R.id.fotomac);
        fotomac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.fotomac.com.tr/"));
                startActivity(viewIntent);
            }
        });

        sahadan = (Button)findViewById(R.id.sahadan);
        sahadan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://wap.sahadan.com/(S(3oth4midotuf5scmxeok5y3t))/Default.aspx?r=3b57e"));
                startActivity(viewIntent);
            }
        });

        mackolik = (Button)findViewById(R.id.mackolik);
        mackolik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.mackolik.com/default.aspx"));
                startActivity(viewIntent);
            }
        });

        sporoku = (Button)findViewById(R.id.sporoku);
        sporoku.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.sporoku.com/"));
                startActivity(viewIntent);
            }
        });

        enderspor = (Button)findViewById(R.id.enderspor);
        enderspor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.enderspor.com/"));
                startActivity(viewIntent);
            }
        });

        newbalance = (Button)findViewById(R.id.newbalance);
        newbalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.newbalance.com.tr/"));
                startActivity(viewIntent);
            }
        });

        nike = (Button)findViewById(R.id.nike);
        nike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.nike.com/tr/tr_tr/"));
                startActivity(viewIntent);
            }
        });

        adidas = (Button)findViewById(R.id.adidas);
        adidas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://shop.adidas.com.tr/"));
                startActivity(viewIntent);
            }
        });

        puma = (Button)findViewById(R.id.puma);
        puma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.puma.com.tr/"));
                startActivity(viewIntent);
            }
        });

        columbia = (Button)findViewById(R.id.columbia);
        columbia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.columbia.com.tr/"));
                startActivity(viewIntent);
            }
        });

        hummel = (Button)findViewById(R.id.hummel);
        hummel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://shop.hummel.com.tr/"));
                startActivity(viewIntent);
            }
        });

        northface = (Button)findViewById(R.id.north);
        northface.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.thenorthface.com/"));
                startActivity(viewIntent);
            }
        });

        salomon = (Button)findViewById(R.id.salomon);
        salomon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.salomon.com/"));
                startActivity(viewIntent);
            }
        });

        jackwolfskin = (Button)findViewById(R.id.wolfskin);
        jackwolfskin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.jack-wolfskin.com/"));
                startActivity(viewIntent);
            }
        });

        spx = (Button)findViewById(R.id.spx);
        spx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.spx.com.tr/"));
                startActivity(viewIntent);
            }
        });

        skechers = (Button)findViewById(R.id.skechers);
        skechers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.skechers.com.tr/"));
                startActivity(viewIntent);
            }
        });

        beınsports = (Button)findViewById(R.id.beinSports);
        beınsports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://tr.beinsports.com/"));
                startActivity(viewIntent);
            }
        });

        tff = (Button)findViewById(R.id.tff);
        tff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.tff.org/"));
                startActivity(viewIntent);
            }
        });

        tvf = (Button)findViewById(R.id.tvf);
        tvf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.tvf.org.tr/"));
                startActivity(viewIntent);
            }
        });

        tbf = (Button)findViewById(R.id.tbf);
        tbf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.tbf.org.tr/"));
                startActivity(viewIntent);
            }
        });

        taf = (Button)findViewById(R.id.taf);
        taf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.taf.org.tr/"));
                startActivity(viewIntent);
            }
        });

        tyf = (Button)findViewById(R.id.tyf);
        tyf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://tyf.gov.tr/"));
                startActivity(viewIntent);
            }
        });

        ttf = (Button)findViewById(R.id.ttf);
        ttf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.ttf.org.tr/"));
                startActivity(viewIntent);
            }
        });

        tfgf = (Button)findViewById(R.id.fit);
        tfgf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.tvgfbf.gov.tr/"));
                startActivity(viewIntent);
            }
        });

        tmok = (Button)findViewById(R.id.olimpiyat);
        tmok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.olimpiyatkomitesi.org.tr/"));
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
                Intent intent = new Intent(SportActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
