package com.gozdehanozturk.sitesite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.gozdehanozturk.sitesite.model.ItemModel;
import com.gozdehanozturk.sitesite.model.Site;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    private SiteListAdapter adapter;
    private List<Site> sites = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        MyApplication application = ((MyApplication) getApplication());
        sites = application.getCategoryManager().getFlatSiteList();
        adapter = new SiteListAdapter(sites, application.getFavoriteManager());
        ((ListView) findViewById(R.id.search_list_view)).setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);

        /*MenuItem searchMenuItem = menu.findItem(R.id.searchmenu);
        searchMenuItem.expandActionView();*/

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.searchmenu:
                SearchView searchView = (SearchView)item.getActionView();
                searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                    @Override
                    public boolean onQueryTextSubmit(String query) {
                        return false;
                    }

                    @Override
                    public boolean onQueryTextChange(String newText) {
                        List<Site> foundList = new ArrayList<>(sites);

                        if (newText != null && !newText.isEmpty()) {
                            for(Site site : sites){
                               if(false == site.getName().toLowerCase().contains(newText.toLowerCase())){
                                   foundList.remove(site);
                               }
                            }
                        }

                        adapter.setSites(foundList);
                        adapter.notifyDataSetChanged();

                        return true;
                    }
                });


        }
        return super.onOptionsItemSelected(item);
    }
}
