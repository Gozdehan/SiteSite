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

public class ClothesActivity extends AppCompatActivity {
    Button benetton, bershka, beymen, boyner, ca, collezione, colins, defacto, deriden, derimod, gap, hm, koton, lacoste,
    lc, levis, leecooper, loft, ltb, mango, marks, massimo, mavi, mustang, nautica, network, pullandbear, sarar, silkandcashmere, stradivarius, tommy, twist,
    polo, vakko, zara, pierre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Giyim");

        benetton = (Button)findViewById(R.id.benetton);
        benetton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://tr.benetton.com/"));
                startActivity(viewIntent);
            }
        });

        bershka = (Button)findViewById(R.id.bershka);
        bershka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.bershka.com/tr/"));
                startActivity(viewIntent);
            }
        });

        beymen = (Button)findViewById(R.id.beymen);
        beymen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.beymen.com/"));
                startActivity(viewIntent);
            }
        });

        boyner = (Button)findViewById(R.id.boyner);
        boyner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.boyner.com.tr/"));
                startActivity(viewIntent);
            }
        });


        ca = (Button)findViewById(R.id.ca);
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.c-and-a.com/uk/en/corporate/company/"));
                startActivity(viewIntent);
            }
        });

        collezione = (Button)findViewById(R.id.collezione);
        collezione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.collezione.com/"));
                startActivity(viewIntent);
            }
        });

        colins = (Button)findViewById(R.id.colins);
        colins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.colins.com.tr/"));
                startActivity(viewIntent);
            }
        });

        defacto = (Button)findViewById(R.id.defacto);
        defacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.defacto.com.tr/"));
                startActivity(viewIntent);
            }
        });

        deriden = (Button)findViewById(R.id.deriden);
        deriden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.deriden.com.tr/"));
                startActivity(viewIntent);
            }
        });

        derimod = (Button)findViewById(R.id.derimod);
        derimod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.derimod.com.tr/"));
                startActivity(viewIntent);
            }
        });


        gap = (Button)findViewById(R.id.gap);
        gap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://gap.com.tr/"));
                startActivity(viewIntent);
            }
        });

        hm = (Button)findViewById(R.id.hm);
        hm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www2.hm.com/tr_tr/index.html"));
                startActivity(viewIntent);
            }
        });

        koton = (Button)findViewById(R.id.koton);
        koton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.koton.com/tr/"));
                startActivity(viewIntent);
            }
        });

        lacoste = (Button)findViewById(R.id.lacoste);
        lacoste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://shop.lacoste.com.tr/"));
                startActivity(viewIntent);
            }
        });

        lc = (Button)findViewById(R.id.lc);
        lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.lcwaikiki.com/tr-TR/TR"));
                startActivity(viewIntent);
            }
        });


        levis = (Button)findViewById(R.id.levis);
        levis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.levi.com/TR/tr_TR/"));
                startActivity(viewIntent);
            }
        });

        leecooper = (Button)findViewById(R.id.leecooper);
        leecooper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.leecooper-turkey.com/"));
                startActivity(viewIntent);
            }
        });

        loft = (Button)findViewById(R.id.loft);
        loft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.loft.com.tr/"));
                startActivity(viewIntent);
            }
        });

        ltb = (Button)findViewById(R.id.ltb);
        ltb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.ltbjeans.com/"));
                startActivity(viewIntent);
            }
        });

        mango = (Button)findViewById(R.id.mango);
        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://shop.mango.com/TR"));
                startActivity(viewIntent);
            }
        });

        marks = (Button)findViewById(R.id.marks);
        marks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.marksandspencer.com/"));
                startActivity(viewIntent);
            }
        });

        massimo = (Button)findViewById(R.id.massimo);
        massimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.massimodutti.com/tr/"));
                startActivity(viewIntent);
            }
        });


        mavi = (Button)findViewById(R.id.mavi);
        mavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.mavi.com/"));
                startActivity(viewIntent);
            }
        });

        mustang = (Button)findViewById(R.id.mustang);
        mustang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.mustang-jeans.com.tr/"));
                startActivity(viewIntent);
            }
        });

        nautica = (Button)findViewById(R.id.nautica);
        nautica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.nautica-tr.com/"));
                startActivity(viewIntent);
            }
        });

        network = (Button)findViewById(R.id.network);
        network.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.network.com.tr/"));
                startActivity(viewIntent);
            }
        });

        pullandbear = (Button)findViewById(R.id.pullandbear);
        pullandbear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.pullandbear.com/tr/"));
                startActivity(viewIntent);
            }
        });

        sarar = (Button)findViewById(R.id.sarar);
        sarar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://sarar.com/"));
                startActivity(viewIntent);
            }
        });

        silkandcashmere = (Button)findViewById(R.id.silkandcasmere);
        silkandcashmere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.silkandcashmere.com/"));
                startActivity(viewIntent);
            }
        });

        stradivarius = (Button)findViewById(R.id.stradivarius);
        stradivarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.stradivarius.com/tr/"));
                startActivity(viewIntent);
            }
        });


        tommy = (Button)findViewById(R.id.tommy);
        tommy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://global.tommy.com/tr/tr/Collections/start"));
                startActivity(viewIntent);
            }
        });

        polo = (Button)findViewById(R.id.uspolo);
        polo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://tr.uspoloassn.com/"));
                startActivity(viewIntent);
            }
        });

        vakko = (Button)findViewById(R.id.vakko);
        vakko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://shop.vakko.com/tr"));
                startActivity(viewIntent);
            }
        });

        zara = (Button)findViewById(R.id.zara);
        zara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.zara.com/"));
                startActivity(viewIntent);
            }
        });

        pierre = (Button)findViewById(R.id.pierre);
        pierre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ipekyol.com.tr/"));
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
                Intent intent = new Intent(ClothesActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
