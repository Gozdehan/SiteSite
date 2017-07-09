package com.gozdehanozturk.sitesite;

import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class CultureArtActivity extends AppCompatActivity {

    Button btnBiletix,btnDr,btnKtpYurdu,btnIdefix,btnRemziKitapevi,btnNezih, btnNadir, btnKabalci, btnMephisto, btnBeyazPerde,btnIstModern,btnSanatlog,
            btnSanatonline,btnTiyatronline,btnDunyaBizim, btnPera, btnKoc, btnSabanci,btnIsSanat, btnOyuncak,btnAkbankSanat ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture_art);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Kültür & Sanat");

        btnBiletix = (Button)findViewById(R.id.biletix);
        btnBiletix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.biletix.com/anasayfa/TURKIYE/tr"));
                startActivity(viewIntent);
            }
        });

        btnDr = (Button)findViewById(R.id.dr);
        btnDr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dr.com.tr/"));
                startActivity(viewIntent);
            }
        });

        btnKtpYurdu = (Button)findViewById(R.id.kitapYurdu);
        btnKtpYurdu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.kitapyurdu.com/"));
                startActivity(viewIntent);
            }
        });

        btnIdefix = (Button)findViewById(R.id.idefix);
        btnIdefix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.idefix.com/"));
                startActivity(viewIntent);
            }
        });

        btnRemziKitapevi = (Button)findViewById(R.id.remzi);
        btnRemziKitapevi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.remzi.com.tr/anasayfa"));
                startActivity(viewIntent);
            }
        });

        btnNezih = (Button)findViewById(R.id.nezih);
        btnNezih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.nezih.com.tr/"));
                startActivity(viewIntent);
            }
        });

        btnNadir = (Button)findViewById(R.id.nadir);
        btnNadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.nadirkitap.com/"));
                startActivity(viewIntent);
            }
        });

        btnKabalci = (Button)findViewById(R.id.kabalci);
        btnKabalci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.kabalci.com.tr/"));
                startActivity(viewIntent);
            }
        });

        btnMephisto = (Button)findViewById(R.id.mephisto);
        btnMephisto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.mephisto.com.tr/"));
                startActivity(viewIntent);
            }
        });

        btnBeyazPerde = (Button)findViewById(R.id.beyazperde);
        btnBeyazPerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.beyazperde.com/"));
                startActivity(viewIntent);
            }
        });

        btnIstModern = (Button)findViewById(R.id.ISTModern);
        btnIstModern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.istanbulmodern.org/"));
                startActivity(viewIntent);
            }
        });

        btnSanatlog = (Button)findViewById(R.id.sanatlog);
        btnSanatlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.sanatlog.com/"));
                startActivity(viewIntent);
            }
        });

        btnSanatonline = (Button)findViewById(R.id.sanatOnline);
        btnSanatonline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://sanatonline.net/"));
                startActivity(viewIntent);
            }
        });

        btnTiyatronline = (Button)findViewById(R.id.tiyatroOnline);
        btnTiyatronline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.tiyatronline.com/"));
                startActivity(viewIntent);
            }
        });

        btnDunyaBizim = (Button)findViewById(R.id.dunyaBizim);
        btnDunyaBizim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dunyabizim.com/"));
                startActivity(viewIntent);
            }
        });

        btnPera = (Button)findViewById(R.id.pera);
        btnPera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.peramuzesi.org.tr/"));
                startActivity(viewIntent);
            }
        });

        btnKoc = (Button)findViewById(R.id.koç);
        btnKoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.rmk-museum.org.tr/default.aspx"));
                startActivity(viewIntent);
            }
        });

        btnSabanci = (Button)findViewById(R.id.sabanci);
        btnSabanci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.sakipsabancimuzesi.org/"));
                startActivity(viewIntent);
            }
        });

        btnIsSanat = (Button)findViewById(R.id.isSanat);
        btnIsSanat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.issanat.com.tr/TR/etkinlikler/Sayfalar/etkinlikler.aspx"));
                startActivity(viewIntent);
            }
        });

        btnOyuncak = (Button)findViewById(R.id.oyuncak);
        btnOyuncak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.istanbuloyuncakmuzesi.com/#"));
                startActivity(viewIntent);
            }
        });


        btnAkbankSanat = (Button)findViewById(R.id.akbank);
        btnAkbankSanat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.akbanksanat.com/"));
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
                Intent intent = new Intent(CultureArtActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
