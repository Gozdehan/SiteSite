package com.gozdehanozturk.sitesite.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.gozdehanozturk.sitesite.R;
import com.gozdehanozturk.sitesite.adapter.SiteListAdapter;
import com.gozdehanozturk.sitesite.manager.CategoryManager;
import com.gozdehanozturk.sitesite.model.Category;

public class SitesActivity extends AppCompatActivity {

    private CategoryManager categoryManager;
    private SiteListAdapter adapter;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sites);

        int id = getIntent().getExtras().getInt(CategoriesActivity.ID);

        MyApplication application = ((MyApplication) getApplication());
        categoryManager = application.getCategoryManager();
        Category category = categoryManager.findById(id);
        setTitle(category.getName());
        adapter = new SiteListAdapter(category.getSites(), application.getFavoriteManager());

        ListView listView = (ListView) findViewById(R.id.site_list_view);
        listView.setAdapter(adapter);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        reklamYukle();
    }

    private void reklamYukle() {
        adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId(getString(R.string.sitelist_reklam_id));
        LinearLayout layoutReklam = (LinearLayout) findViewById(R.id.sitesreklam);
        layoutReklam.addView(adView);

        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
           case android.R.id.home:
               finish();
               return true;
            case R.id.fav:
                startActivity(new Intent(SitesActivity.this,FavoriteSitesActivity.class));
                return true;
            case R.id.search:
                startActivity(new Intent(SitesActivity.this,SearchActivity.class));
                return true;
            case R.id.offer:
                startActivity(new Intent(SitesActivity.this,OfferActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
