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

public class UnderWearActivity extends AppCompatActivity {

    Button blackspade, bonprix, dagi, penti, lasenza, intimissimi, victoria, suwen, calvin, kom, nbb, oysho, loya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_under_wear);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("İç Giyim");

        blackspade = (Button)findViewById(R.id.blackspade);
        blackspade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.blackspade.com.tr/"));
                startActivity(viewIntent);
            }
        });

        bonprix = (Button)findViewById(R.id.bonprix);
        bonprix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.bonprix.com.tr/"));
                startActivity(viewIntent);
            }
        });

        dagi = (Button)findViewById(R.id.dagi);
        dagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dagi.com.tr/"));
                startActivity(viewIntent);
            }
        });

        penti = (Button)findViewById(R.id.penti);
        penti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.penti.com/"));
                startActivity(viewIntent);
            }
        });

        lasenza = (Button)findViewById(R.id.lasenza);
        lasenza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.lasenza.com/"));
                startActivity(viewIntent);
            }
        });


        intimissimi = (Button)findViewById(R.id.intimissimi);
        intimissimi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://world.intimissimi.com/"));
                startActivity(viewIntent);
            }
        });

        victoria = (Button)findViewById(R.id.vsecret);
        victoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.victoriassecret.com/"));
                startActivity(viewIntent);
            }
        });

        suwen = (Button)findViewById(R.id.suwen);
        suwen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.suwen.com.tr/"));
                startActivity(viewIntent);
            }
        });

        calvin = (Button)findViewById(R.id.calvin);
        calvin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://explore.calvinklein.com/"));
                startActivity(viewIntent);
            }
        });

        kom = (Button)findViewById(R.id.kom);
        kom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.kom.com.tr/"));
                startActivity(viewIntent);
            }
        });

        nbb = (Button)findViewById(R.id.nbb);
        nbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.nbb.com.tr/"));
                startActivity(viewIntent);
            }
        });

        oysho = (Button)findViewById(R.id.oysho);
        oysho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.oysho.com/tr/"));
                startActivity(viewIntent);
            }
        });

        loya = (Button)findViewById(R.id.loya);
        loya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.loya.com.tr/"));
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
                Intent intent = new Intent(UnderWearActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
