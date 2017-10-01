package com.gozdehanozturk.sitesite.activity;

import android.app.Application;

import com.gozdehanozturk.sitesite.manager.CategoryManager;
import com.gozdehanozturk.sitesite.manager.FavoriteManager;

/**
 * Created by Gozde on 30.09.2017.
 */

public class MyApplication extends Application {

    private FavoriteManager favoriteManager;
    private CategoryManager categoryManager;

    @Override
    public void onCreate() {
        super.onCreate();
        favoriteManager = new FavoriteManager(getApplicationContext());
        categoryManager = new CategoryManager();
    }

    public FavoriteManager getFavoriteManager() {
        return favoriteManager;
    }

    public CategoryManager getCategoryManager() {
        return categoryManager;
    }
}
