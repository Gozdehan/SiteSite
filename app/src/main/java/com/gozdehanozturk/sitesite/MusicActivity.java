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

public class MusicActivity extends AppCompatActivity {

    Button spotify, fizy, türktelekom, deezer, classical,youtube, tunein,justhearit, dashradio, tracks8, lastfm, soundcloud, hypem, gaana, bandcamp, müzikdinletv, slacker, myspace, müsicovery, jango, müsixhub, difm, radiotuna, live365, jazzradio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Müzik");

        spotify = (Button)findViewById(R.id.spotify);
        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.spotify.com/tr/"));
                startActivity(viewIntent);
            }
        });

        fizy = (Button)findViewById(R.id.fizy);
        fizy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://fizy.com/#!/listelerim"));
                startActivity(viewIntent);
            }
        });

        türktelekom = (Button)findViewById(R.id.ttm);
        türktelekom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.turktelekommuzik.com/"));
                startActivity(viewIntent);
            }
        });

        deezer = (Button)findViewById(R.id.deezer);
        deezer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.deezer.com/tr/"));
                startActivity(viewIntent);
            }
        });


        classical = (Button)findViewById(R.id.ca);
        classical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.classicalarchives.com/"));
                startActivity(viewIntent);
            }
        });

        youtube = (Button)findViewById(R.id.youtube);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/?hl=tr&gl=TR"));
                startActivity(viewIntent);
            }
        });

        tunein = (Button)findViewById(R.id.tunein);
        tunein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://beta.tunein.com/"));
                startActivity(viewIntent);
            }
        });

        dashradio = (Button)findViewById(R.id.dashradio);
        dashradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://dashradio.com/"));
                startActivity(viewIntent);
            }
        });

        tracks8 = (Button)findViewById(R.id.tracks8);
        tracks8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://8tracks.com/"));
                startActivity(viewIntent);
            }
        });

        lastfm = (Button)findViewById(R.id.lastfm);
        lastfm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.last.fm/"));
                startActivity(viewIntent);
            }
        });


        soundcloud = (Button)findViewById(R.id.sc);
        soundcloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://soundcloud.com/"));
                startActivity(viewIntent);
            }
        });

        hypem = (Button)findViewById(R.id.hypem);
        hypem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://hypem.com/"));
                startActivity(viewIntent);
            }
        });

        gaana = (Button)findViewById(R.id.gaana);
        gaana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://gaana.com/"));
                startActivity(viewIntent);
            }
        });

        bandcamp = (Button)findViewById(R.id.bandcamp);
        bandcamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://bandcamp.com/"));
                startActivity(viewIntent);
            }
        });

        müzikdinletv = (Button)findViewById(R.id.müzikdinletv);
        müzikdinletv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://muzikdinle.tv.tr/"));
                startActivity(viewIntent);
            }
        });

        slacker = (Button)findViewById(R.id.slacker);
        slacker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.slacker.com/"));
                startActivity(viewIntent);
            }
        });


        myspace = (Button)findViewById(R.id.myspace);
        myspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://myspace.com/"));
                startActivity(viewIntent);
            }
        });

        müsicovery = (Button)findViewById(R.id.musicovery);
        müsicovery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://b2b.musicovery.com/"));
                startActivity(viewIntent);
            }
        });

        jango = (Button)findViewById(R.id.jango);
        jango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.jango.com/"));
                startActivity(viewIntent);
            }
        });

        müsixhub = (Button)findViewById(R.id.musixhub);
        müsixhub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.musixhub.com/"));
                startActivity(viewIntent);
            }
        });

        difm = (Button)findViewById(R.id.difm);
        difm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.di.fm/"));
                startActivity(viewIntent);
            }
        });

        radiotuna = (Button)findViewById(R.id.radiotuna);
        radiotuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://radiotuna.com/"));
                startActivity(viewIntent);
            }
        });

        live365 = (Button)findViewById(R.id.live365);
        live365.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://live365.com/"));
                startActivity(viewIntent);
            }
        });

        jazzradio = (Button)findViewById(R.id.jazzradio);
        jazzradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.jazzradio.com/"));
                startActivity(viewIntent);
            }
        });

        justhearit = (Button)findViewById(R.id.justhearit);
        justhearit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://justhearit.com/"));
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
                Intent intent = new Intent(MusicActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
