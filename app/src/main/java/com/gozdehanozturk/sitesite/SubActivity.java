package com.gozdehanozturk.sitesite;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
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

public class SubActivity extends AppCompatActivity {
    DatabaseReference dref;
    ListView subListView;
    List<ItemModel> itemList = new ArrayList<ItemModel>();

    BaseAdapter ba;
    LayoutInflater li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        ActionBar ab = getSupportActionBar();

        li = LayoutInflater.from(this);

        subListView  = (ListView)findViewById(R.id.sublistview);

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


                Picasso.with(SubActivity.this).load(itemList.get(i).getLogoUrl()).into(image);

                return view;
            }
        };

        subListView.setAdapter(ba);

        final String tur = getIntent().getExtras().getString("tur");

        if(tur.equals("ayakkabicanta")){
            ab.setTitle("Ayakkabı & Çanta");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("ayakkabicanta");
        }

        if(tur.equals("giyim")){
            ab.setTitle("Giyim");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("giyim");
        }

        if(tur.equals("kadingiyim")){
            ab.setTitle("Kadın Giyim");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("kadingiyim");
        }

        if(tur.equals("erkekgiyim")){
            ab.setTitle("Erkek Giyim");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("erkekgiyim");
        }

        if(tur.equals("sporgiyim")){
            ab.setTitle("Spor Giyim");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("sporgiyim");
        }

        if(tur.equals("icgiyim")){
            ab.setTitle("İç Giyim");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("icgiyim");
        }
        if(tur.equals("kozmetik")){
            ab.setTitle("Saat&Aksesuar&Mücevher");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("saatmücevher");
        }

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

        subListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(SubActivity.this,WebViewActivity.class);
                intent.putExtra("url",itemList.get(i).getSiteUrl());
                intent.putExtra("title",itemList.get(i).getTitle());
                startActivity(intent);
            }
        });

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();super.onBackPressed();
        finish();
    }
}
