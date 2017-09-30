package com.gozdehanozturk.sitesite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.gozdehanozturk.sitesite.manager.FavoriteManager;
import com.gozdehanozturk.sitesite.model.Site;

import java.util.ArrayList;
import java.util.List;

public class FavoriteSitesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_sites);

        MyApplication application = (MyApplication) getApplication();
        FavoriteManager favoriteManager = application.getFavoriteManager();
        List<Site> sites = filterFavoriteSites(application.getCategoryManager().getFlatSiteList(), favoriteManager);

        ListView listView = (ListView) findViewById(R.id.favorite_site_list_view);
        listView.setAdapter(new SiteListAdapter(sites, favoriteManager));
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
}
