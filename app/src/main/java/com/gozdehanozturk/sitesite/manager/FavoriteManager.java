package com.gozdehanozturk.sitesite.manager;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Gozde on 30.09.2017.
 */

public class FavoriteManager {

    public static final String FAVORITES_SITES = "FAVORITES_SITES";

    private final SharedPreferences preferences;
    private Set<String> favoriteSites = new HashSet<>();

    public FavoriteManager(Context context) {
        this.preferences = PreferenceManager.getDefaultSharedPreferences(context);
        favoriteSites.addAll(preferences.getStringSet(FAVORITES_SITES, new HashSet<String>()));
    }

    public void add(String url) {
        if (null == url) {
            return;
        }
        favoriteSites.add(url);
        save();
    }

    private void save() {
        preferences.edit().putStringSet(FAVORITES_SITES, favoriteSites).commit();
    }

    public boolean isFavorite(String url){
        for (String siteUrl : favoriteSites) {
            if (siteUrl.equals(url)) {
                return true;
            }
        }

        return false;
    }

    public void remove(String url) {
        favoriteSites.remove(url);
        save();
    }

    public Set<String> getFavoriteSites() {
        return favoriteSites;
    }
}
