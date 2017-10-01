package com.gozdehanozturk.sitesite.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ListView;

import com.gozdehanozturk.sitesite.R;
import com.gozdehanozturk.sitesite.adapter.SiteListAdapter;
import com.gozdehanozturk.sitesite.manager.CategoryManager;
import com.gozdehanozturk.sitesite.model.Category;

public class SitesActivity extends AppCompatActivity {

    private CategoryManager categoryManager;
    private SiteListAdapter adapter;

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
