package com.gozdehanozturk.sitesite;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;
import com.gozdehanozturk.sitesite.model.ItemModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;


public class BookActivity extends AppCompatActivity {

    DatabaseReference dref;
    ListView mListView;
    List<ItemModel> itemList = new ArrayList<ItemModel>();
    List<ItemModel> il2 = new ArrayList<>();
    BaseAdapter ba;
    LayoutInflater li;
    boolean isSearch = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Kitap & Dergi");

        li = LayoutInflater.from(this);


        mListView  = (ListView)findViewById(R.id.booklistview);

           ba = new BaseAdapter() {
            @Override
            public int getCount() {
                if (!isSearch)
               return itemList.size();
                return il2.size();
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

                if(view==null) {
                    view = li.inflate(R.layout.list_item, null);
                }

                ImageView image = view.findViewById(R.id.item_logo);

                if (!isSearch)
                {

                    TextView text = view.findViewById(R.id.item_name);
                    text.setText(itemList.get(i).getTitle());


                    Picasso.with(BookActivity.this).load(itemList.get(i).getLogoUrl()).into(image);

                }

                else
                {

                    TextView text = view.findViewById(R.id.item_name);
                    text.setText(il2.get(i).getTitle());


                    Picasso.with(BookActivity.this).load(il2.get(i).getLogoUrl()).into(image);

                }
                return view;
            }
        };


        mListView.setAdapter(ba);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               /* Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(itemList.get(i).getSiteUrl()));
                startActivity(intent);  */
                if (!isSearch)
                {
                    Intent intent = new Intent(BookActivity.this,WebViewActivity.class);
                    intent.putExtra("url",itemList.get(i).getSiteUrl());
                    intent.putExtra("title",itemList.get(i).getTitle());
                    startActivity(intent);
                }
                else
                {
                    Intent intent = new Intent(BookActivity.this,WebViewActivity.class);
                    intent.putExtra("url",il2.get(i).getSiteUrl());
                    intent.putExtra("title",il2.get(i).getTitle());
                    startActivity(intent);
                }
            }
        });



        dref = FirebaseDatabase.getInstance().getReference("kitapdergi");
        dref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot data: dataSnapshot.getChildren()){
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

        switch(item.getItemId()){
            case R.id.menuId:
                Intent intent = new Intent(BookActivity.this,CategoryActivity.class);
                startActivity(intent);

            case R.id.search:
                SearchManager searchManager = (SearchManager)getSystemService(Context.SEARCH_SERVICE);
                final SearchView searchView = (SearchView)item.getActionView();

                searchView.setSearchableInfo(searchManager.getSearchableInfo(getComponentName()));

                searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
                    @Override
                    public boolean onQueryTextSubmit(String query) {
                        return false;
                    }

                    @Override
                    public boolean onQueryTextChange(String newText) {

                        il2.clear();
                        if(newText!=null && !newText.isEmpty()){

                            isSearch = true;
                            for(ItemModel item : itemList ){
                                if(item.getTitle().toLowerCase().contains(newText.toLowerCase())){
                                    il2.add(item);
                                }

                                ba.notifyDataSetChanged();
                            }

                        }
                        else
                        {
                            isSearch = false;
                            ba.notifyDataSetChanged();
                        }
                        return true;
                    }
                });



            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
