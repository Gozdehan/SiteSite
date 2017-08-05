package com.gozdehanozturk.sitesite;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.gozdehanozturk.sitesite.model.ItemModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MySubActivity extends AppCompatActivity {

    DatabaseReference dref;
    ListView mListView;
    List<ItemModel> itemList = new ArrayList<ItemModel>();

    BaseAdapter ba;
    LayoutInflater li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_sub);

        ActionBar ab = getSupportActionBar();

        li = LayoutInflater.from(this);

        mListView  = (ListView)findViewById(R.id.sublistview);

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


                Picasso.with(MySubActivity.this).load(itemList.get(i).getLogoUrl()).into(image);

                return view;
            }
        };

        mListView.setAdapter(ba);

     /*   String tur1 = getIntent().getExtras().getString("tur1");
        String tur2 = getIntent().getExtras().getString("tur2");
        String tur3 = getIntent().getExtras().getString("tur3");
        String tur4 = getIntent().getExtras().getString("tur4");
        String tur5 = getIntent().getExtras().getString("tur5");
        String tur6 = getIntent().getExtras().getString("tur6");
        String tur7 = getIntent().getExtras().getString("tur7"); */

    }
}
