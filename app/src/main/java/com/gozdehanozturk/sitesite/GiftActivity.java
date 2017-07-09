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

public class GiftActivity extends AppCompatActivity {

    Button hSepeti, cSepeti, hFabrikasi, hediyenizbizden, hKulubu, buldumduldum, birDahaSöyle, hTavsiyeleri, hDükkani, hRengi,
    hediyehanem, hediyenikap, bridalook, budayeni, hediyeSitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gift);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Hediye");

        hSepeti = (Button)findViewById(R.id.hediyesepeti);
        hSepeti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hediyesepeti.com/"));
                startActivity(viewIntent);
            }
        });

        cSepeti = (Button)findViewById(R.id.ciceks);
        cSepeti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ciceksepeti.com/#"));
                startActivity(viewIntent);
            }
        });

        hFabrikasi = (Button)findViewById(R.id.hedfab);
        hFabrikasi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hediyefabrikasi.com/"));
                startActivity(viewIntent);
            }
        });

        hediyenizbizden = (Button)findViewById(R.id.hedbiz);
        hediyenizbizden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hediyenizbizden.com/"));
                startActivity(viewIntent);
            }
        });


        hKulubu = (Button)findViewById(R.id.hedkulup);
        hKulubu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hediyekulubu.com/"));
                startActivity(viewIntent);
            }
        });

        buldumduldum = (Button)findViewById(R.id.buldum);
        buldumduldum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.buldumbuldum.com/"));
                startActivity(viewIntent);
            }
        });

        birDahaSöyle = (Button)findViewById(R.id.soyle);
        birDahaSöyle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.1dahasoyle.com/"));
                startActivity(viewIntent);
            }
        });

        hTavsiyeleri = (Button)findViewById(R.id.hedtavsiye);
        hTavsiyeleri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hediyetavsiyeleri.com/"));
                startActivity(viewIntent);
            }
        });

        hDükkani = (Button)findViewById(R.id.hDükkan);
        hDükkani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hediyedukkani.com/"));
                startActivity(viewIntent);
            }
        });

        hRengi = (Button)findViewById(R.id.hRengi);
        hRengi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hediyerengi.com/"));
                startActivity(viewIntent);
            }
        });


        hediyehanem = (Button)findViewById(R.id.hediyehanem);
        hediyehanem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hediyehanem.com/"));
                startActivity(viewIntent);
            }
        });

        budayeni = (Button)findViewById(R.id.budayeni);
        budayeni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.budayeni.com/"));
                startActivity(viewIntent);
            }
        });

        hediyenikap = (Button)findViewById(R.id.hedıyenıkap);
        hediyenikap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hediyenikap.com/"));
                startActivity(viewIntent);
            }
        });

        bridalook = (Button)findViewById(R.id.bridalook);
        bridalook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://bridalook.com/"));
                startActivity(viewIntent);
            }
        });

        hediyeSitem = (Button)findViewById(R.id.hedıyesitem);
        hediyeSitem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://hediyesitem.com/"));
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
                Intent intent = new Intent(GiftActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
