package com.gozdehanozturk.sitesite;

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
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class SearchActivity extends AppCompatActivity {

    DatabaseReference dr;
    ListView searchListView;
    List<ItemModel> itemList = new ArrayList<ItemModel>();
    List<ItemModel> foundList = new ArrayList<>();

    boolean isSearch = false;

    BaseAdapter ba;
    LayoutInflater li;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        li = LayoutInflater.from(this);
        searchListView = (ListView)findViewById(R.id.listSearch);

        ba = new BaseAdapter() {
            @Override
            public int getCount() {


                if (!isSearch)  return itemList.size();
                else return foundList.size();

            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {

                    if(view==null)
                    {
                        view = li.inflate(R.layout.list_item,null);
                    }

                    ImageView image = view.findViewById(R.id.item_logo);


                    TextView text = view.findViewById(R.id.item_name);

                    if (!isSearch) {
                        text.setText(itemList.get(i).getTitle());
                        Picasso.with(SearchActivity.this).load(itemList.get(i).getLogoUrl()).into(image);
                    }
                    else
                        {
                            text.setText(foundList.get(i).getTitle());
                            Picasso.with(SearchActivity.this).load(foundList.get(i).getLogoUrl()).into(image);
                    }
                    //return view;

                return view;
            }
        };

        searchListView.setAdapter(ba);

        dr = FirebaseDatabase.getInstance().getReference("arama");

        dr.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot data:dataSnapshot.getChildren()){
                    ItemModel item = data.getValue(ItemModel.class);
                    itemList.add(item);
                    ba.notifyDataSetChanged();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.d("LOGTEST",databaseError.getMessage());
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.search:
                SearchView searchView = (SearchView)item.getActionView();
                searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                    @Override
                    public boolean onQueryTextSubmit(String query) {
                        return false;
                    }

                    @Override
                    public boolean onQueryTextChange(String newText)
                    {

                        if (newText != null && !newText.isEmpty()) {
                            isSearch  = true;
                            foundList.clear();
                            for(ItemModel item : itemList){
                               if(item.getTitle().toLowerCase().contains(newText.toLowerCase())){
                                   foundList.add(item);
                               }
                            }

                            ba.notifyDataSetChanged();
                        }
                        else
                        {
                            isSearch = false;
                            foundList.clear();
                            ba.notifyDataSetChanged();
                        }
                        return true;
                    }
                });


        }
        return super.onOptionsItemSelected(item);
    }
}
