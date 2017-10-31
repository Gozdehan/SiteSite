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
