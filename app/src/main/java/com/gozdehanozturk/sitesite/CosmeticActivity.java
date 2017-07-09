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

public class CosmeticActivity extends AppCompatActivity {
    Button yves, rossman, watsons, gratis, flormar, goldenrose, mac, six, avon, bodyshop, tshop, tekinacar, sephora, clinique;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cosmetic);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Kozmetik");

        yves = (Button)findViewById(R.id.yves);
        yves.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.yvesrocher.com.tr/control/main/"));
                startActivity(viewIntent);
            }
        });

        six = (Button)findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://sixkozmetik.com/"));
                startActivity(viewIntent);
            }
        });

        rossman = (Button)findViewById(R.id.rossman);
        rossman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.rossmann.com.tr/"));
                startActivity(viewIntent);
            }
        });

        watsons = (Button)findViewById(R.id.watsons);
        watsons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.watsons.com.tr/"));
                startActivity(viewIntent);
            }
        });


        gratis = (Button)findViewById(R.id.gratis);
        gratis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.gratis.com/"));
                startActivity(viewIntent);
            }
        });

        flormar = (Button)findViewById(R.id.flormar);
        flormar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.flormar.com.tr/"));
                startActivity(viewIntent);
            }
        });

        goldenrose = (Button)findViewById(R.id.golden);
        goldenrose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.goldenrose.com.tr/"));
                startActivity(viewIntent);
            }
        });

        mac = (Button)findViewById(R.id.mac);
        mac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.maccosmetics.com.tr/"));
                startActivity(viewIntent);
            }
        });

        avon = (Button)findViewById(R.id.avon);
        avon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://kozmetik.avon.com.tr/"));
                startActivity(viewIntent);
            }
        });

        bodyshop = (Button)findViewById(R.id.bodyshop);
        bodyshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.thebodyshop.com.tr/"));
                startActivity(viewIntent);
            }
        });

        tshop = (Button)findViewById(R.id.tshop);
        tshop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.tshop.com.tr/"));
                startActivity(viewIntent);
            }
        });

        tekinacar = (Button)findViewById(R.id.tekin);
        tekinacar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.tekinacar.com.tr/"));
                startActivity(viewIntent);
            }
        });

        sephora = (Button)findViewById(R.id.sephora);
        sephora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.sephora.com.tr/"));
                startActivity(viewIntent);
            }
        });

        clinique = (Button)findViewById(R.id.clinique);
        clinique.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.clinique.com.tr/"));
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
                Intent intent = new Intent(CosmeticActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
