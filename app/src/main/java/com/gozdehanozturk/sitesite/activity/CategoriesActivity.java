package com.gozdehanozturk.sitesite.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.gozdehanozturk.sitesite.R;
import com.gozdehanozturk.sitesite.adapter.CategoryListAdapter;
import com.gozdehanozturk.sitesite.manager.CategoryManager;
import com.gozdehanozturk.sitesite.manager.LoadListener;
import com.gozdehanozturk.sitesite.model.Category;

import java.util.ArrayList;
import java.util.List;


public class CategoriesActivity extends AppCompatActivity implements LoadListener, AdapterView.OnItemClickListener {

    public static final String ID = "id";
    private CategoryListAdapter adapter;
    private CategoryManager categoryManager;
    private AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        adapter = new CategoryListAdapter(new ArrayList<Category>());
        ListView listView = (ListView) findViewById(R.id.categories);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
        categoryManager = ((MyApplication) getApplication()).getCategoryManager();
        categoryManager.load(this);
        
        reklamiYukle();
    }

    private void reklamiYukle() {
        adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId(getString(R.string.reklam_id));
        LinearLayout layoutReklam = (LinearLayout) findViewById(R.id.reklam);
        layoutReklam.addView(adView);

        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public void onSuccess(List<Category> categories) {
        int id = null != getIntent().getExtras() ? getIntent().getExtras().getInt(ID) : 0;
        if (id > 0) {
            Category category = categoryManager.findById(id);
            setTitle(category.getName());
            adapter.setCategories(category.getCategories());
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        } else {
            adapter.setCategories(categories);
        }

        adapter.notifyDataSetChanged();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            case R.id.fav:
                startActivity(new Intent(CategoriesActivity.this, FavoriteSitesActivity.class));
                return true;
            case R.id.search:
                startActivity(new Intent(CategoriesActivity.this, SearchActivity.class));
                return true;
            case R.id.offer:
                startActivity(new Intent(this, OfferActivity.class));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onError(String error) {

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Category category = adapter.getCategories().get(i);
        if (category.getCategories().size() > 0) {
            Intent intent = new Intent(CategoriesActivity.this, CategoriesActivity.class);
            intent.putExtra(ID, category.getId());
            startActivity(intent);
            return;
        }
        Intent intent = new Intent(CategoriesActivity.this, SitesActivity.class);
        intent.putExtra(ID, category.getId());
        startActivity(intent);
    }
}
