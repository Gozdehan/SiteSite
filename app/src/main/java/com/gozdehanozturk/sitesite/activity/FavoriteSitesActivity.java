package com.gozdehanozturk.sitesite.activity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.gozdehanozturk.sitesite.R;
import com.gozdehanozturk.sitesite.adapter.SiteListAdapter;
import com.gozdehanozturk.sitesite.manager.FavoriteManager;
import com.gozdehanozturk.sitesite.model.Site;

import java.util.ArrayList;
import java.util.List;

public class FavoriteSitesActivity extends AppCompatActivity {

    SiteListAdapter sla;
    TextView tv;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_sites);


        tv = (TextView) findViewById(R.id.notFavoriteInfo);

        getSupportActionBar().setTitle("Favorilerim");

        MyApplication application = (MyApplication) getApplication();
        FavoriteManager favoriteManager = application.getFavoriteManager();
        List<Site> sites = filterFavoriteSites(application.getCategoryManager().getFlatSiteList(), favoriteManager);

        ListView listView = (ListView) findViewById(R.id.favorite_site_list_view);
        sla = new SiteListAdapter(sites, favoriteManager);
        sla.setViews(listView, tv);
        listView.setAdapter(sla);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        reklamYukle();
    }

    private void reklamYukle() {
        adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId(getString(R.string.favori_reklam));
        LinearLayout layoutReklam = (LinearLayout) findViewById(R.id.favorireklam);
        layoutReklam.addView(adView);

        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    private List<Site> filterFavoriteSites(List<Site> sites, FavoriteManager favoriteManager) {
        List<Site> result = new ArrayList<>();

        for (Site site : sites) {
            if (favoriteManager.isFavorite(site.getUrl())) {
                result.add(site);
            }
        }

        return result;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
