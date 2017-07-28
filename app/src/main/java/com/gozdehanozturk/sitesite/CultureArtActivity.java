package com.gozdehanozturk.sitesite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
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
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class CultureArtActivity extends AppCompatActivity {

    DatabaseReference dref;
    ListView mListView;
    List<ItemModel> itemList = new ArrayList<ItemModel>();

    BaseAdapter ba;
    LayoutInflater li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_culture_art);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Kültür & Sanat");

        li = LayoutInflater.from(this);

        mListView  = (ListView)findViewById(R.id.cultureartlistview);


        ba = new BaseAdapter() {
            @Override
            public int getCount() {
                return itemList.size();
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


                TextView text = view.findViewById(R.id.item_name);
                text.setText(itemList.get(i).getTitle());


                Picasso.with(CultureArtActivity.this).load(itemList.get(i).getLogoUrl()).into(image);
                return view;
            }
        };


        mListView.setAdapter(ba);

        dref = FirebaseDatabase.getInstance().getReference("kültürsanat");
        dref.addValueEventListener(new ValueEventListener() {
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

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               /* Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(itemList.get(i).getSiteUrl()));
                startActivity(intent);  */
                Intent intent = new Intent(CultureArtActivity.this,WebViewActivity.class);
                intent.putExtra("url",itemList.get(i).getSiteUrl());
                intent.putExtra("title",itemList.get(i).getTitle());
                startActivity(intent);
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
                Intent intent = new Intent(CultureArtActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
