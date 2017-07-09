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

public class MovieActivity extends AppCompatActivity {

    Button netflix, sezonluk, online, diziist, dizipub, dizilab, dizihdtv, puhu, blu, fullhdfilm, sinebol, diziay,dizigo, dizimag, dizibox, hızlıizle, filmgoo, dizihit, diziler, ddizi, fullhdfilmizle, filmifullizle, filmizlesene, hdfilmsitesi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Film & Dizi");

        netflix = (Button)findViewById(R.id.netflix);
        netflix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.spotify.com/tr/"));
                startActivity(viewIntent);
            }
        });

        sezonluk = (Button)findViewById(R.id.sezonluk);
        sezonluk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://fizy.com/#!/listelerim"));
                startActivity(viewIntent);
            }
        });

        online = (Button)findViewById(R.id.online);
        online.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.turktelekommuzik.com/"));
                startActivity(viewIntent);
            }
        });

        diziist = (Button)findViewById(R.id.diziist);
        diziist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.deezer.com/tr/"));
                startActivity(viewIntent);
            }
        });


        dizipub = (Button)findViewById(R.id.dizipub);
        dizipub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.classicalarchives.com/"));
                startActivity(viewIntent);
            }
        });

        dizilab = (Button)findViewById(R.id.dizilab);
        dizilab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/?hl=tr&gl=TR"));
                startActivity(viewIntent);
            }
        });

        dizihdtv = (Button)findViewById(R.id.hdtv);
        dizihdtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.spotify.com/tr/"));
                startActivity(viewIntent);
            }
        });

        puhu = (Button)findViewById(R.id.puhu);
        puhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://fizy.com/#!/listelerim"));
                startActivity(viewIntent);
            }
        });

        blu = (Button)findViewById(R.id.blu);
        blu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.turktelekommuzik.com/"));
                startActivity(viewIntent);
            }
        });

        fullhdfilm = (Button)findViewById(R.id.fullhd);
        fullhdfilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.deezer.com/tr/"));
                startActivity(viewIntent);
            }
        });


        sinebol = (Button)findViewById(R.id.sinebol);
        sinebol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.classicalarchives.com/"));
                startActivity(viewIntent);
            }
        });

        diziay = (Button)findViewById(R.id.diziay);
        diziay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://diziay.com/"));
                startActivity(viewIntent);
            }
        });

        dizigo = (Button)findViewById(R.id.dizigo);
        dizigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hddizigo.com/"));
                startActivity(viewIntent);
            }
        });

        dizimag = (Button)findViewById(R.id.dizimag);
        dizimag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://dizimag2.co/"));
                startActivity(viewIntent);
            }
        });


        dizibox = (Button)findViewById(R.id.dizibox);
        dizibox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dizibox1.com/"));
                startActivity(viewIntent);
            }
        });

        hızlıizle = (Button)findViewById(R.id.hizliizlefilm);
        hızlıizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hizliizlefilm.net/"));
                startActivity(viewIntent);
            }
        });

        filmgoo = (Button)findViewById(R.id.filmgoo);
        filmgoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.filmgoo.com/"));
                startActivity(viewIntent);
            }
        });

        dizihit = (Button)findViewById(R.id.dizihit);
        dizihit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dizihit.com/"));
                startActivity(viewIntent);
            }
        });

        diziler = (Button)findViewById(R.id.diziler);
        diziler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.diziler.com/"));
                startActivity(viewIntent);
            }
        });

        ddizi = (Button)findViewById(R.id.ddizi);
        ddizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.ddizi1.com/"));
                startActivity(viewIntent);
            }
        });


        fullhdfilmizle = (Button)findViewById(R.id.fullhdfilmizlesene);
        fullhdfilmizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.fullhdfilmizlesene.org/"));
                startActivity(viewIntent);
            }
        });

        filmifullizle = (Button)findViewById(R.id.filmifullizle);
        filmifullizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.filmifullizle.org/"));
                startActivity(viewIntent);
            }
        });

        filmizlesene = (Button)findViewById(R.id.filmizlesene);
        filmizlesene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.filmizlesene.com.tr/"));
                startActivity(viewIntent);
            }
        });


        hdfilmsitesi = (Button)findViewById(R.id.hdfilmsitesi);
        hdfilmsitesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hdfilmsitesi.com/"));
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
                Intent intent = new Intent(MovieActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
