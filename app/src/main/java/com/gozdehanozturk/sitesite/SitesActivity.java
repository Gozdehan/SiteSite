package com.gozdehanozturk.sitesite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.gozdehanozturk.sitesite.manager.CategoryManager;
import com.gozdehanozturk.sitesite.manager.FavoriteManager;
import com.gozdehanozturk.sitesite.model.Category;

import java.util.List;

public class SitesActivity extends AppCompatActivity {

    private CategoryManager categoryManager;
    private SiteListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sites);

        int id = getIntent().getExtras().getInt(CategoriesActivity.ID);

        MyApplication application =((MyApplication) getApplication());
        categoryManager = application.getCategoryManager();
        Category category = categoryManager.findById(id);
        setTitle(category.getName());
        adapter = new SiteListAdapter(category.getSites(), application.getFavoriteManager());

        ListView listView = (ListView)findViewById(R.id.site_list_view);
        listView.setAdapter(adapter);
    }
}
