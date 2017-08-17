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

public class MyActivity extends AppCompatActivity {

    DatabaseReference dref;
    ListView mListView;
    List<ItemModel> itemList = new ArrayList<ItemModel>();

    BaseAdapter ba;
    LayoutInflater li;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

        ActionBar ab = getSupportActionBar();

        li = LayoutInflater.from(this);

        mListView  = (ListView)findViewById(R.id.applistview);

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


                Picasso.with(MyActivity.this).load(itemList.get(i).getLogoUrl()).into(image);

                return view;
            }
        };

        mListView.setAdapter(ba);

        final String tur = getIntent().getExtras().getString("tür","");

        if(tur.equals("culture")){
            ab.setTitle("Kültür & Sanat");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("kültürsanat");
        }

        if(tur.equals("book")){
            ab.setTitle("Kitap & Dergi");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("kitapdergi");
        }

        if(tur.equals("news")){
            ab.setTitle("Haberler");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("haberler");
        }

        if(tur.equals("travel")){
            ab.setTitle("Seyahat & Tatil");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("seyahat");
        }

         if(tur.equals("fashion")){
            ab.setTitle("Moda");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("moda");
        }

        if(tur.equals("cosmetic")){
            ab.setTitle("Kozmetik");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("kozmetik");
        }

        if(tur.equals("sport")){
            ab.setTitle("Spor");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("spor");
        }

        if(tur.equals("food")){
            ab.setTitle("Yemek");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("yemek");
        }

        if(tur.equals("tech")){
            ab.setTitle("Teknoloji");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("teknoloji");
        }

        if(tur.equals("science")){
            ab.setTitle("Bilim");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("bilim");
        }

        if(tur.equals("movie")){
            ab.setTitle("Film & Dizi");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("filmdizi");
        }

        if(tur.equals("music")){
            ab.setTitle("Müzik");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("müzik");
        }

        if(tur.equals("gift")){
            ab.setTitle("Hediye");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("hediye");
        }

        if(tur.equals("shop")){
            ab.setTitle("E-Alışveriş");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("alisveris");
        }

        if(tur.equals("health")){
            ab.setTitle("Sağlık");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("saglik");
        }

        if(tur.equals("homestyle")){
            ab.setTitle("Ev Tekstili");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("ev");
        }

        if(tur.equals("car")){
            ab.setTitle("Otomobil");
            dref = FirebaseDatabase.getInstance().getReference("kategori").child("otomobil");
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

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(tur.equals("fashion")){
                    switch (i){
                        case 0:
                            Intent intent0 = new Intent(MyActivity.this,ShoesBagActivity.class);
                            startActivity(intent0);
                            break;
                        case 1:
                            Intent intent1 = new Intent(MyActivity.this,ClothesActivity.class);
                            startActivity(intent1);
                            break;
                        case 2:
                            Intent intent2 = new Intent(MyActivity.this,WomanFashionActivity.class);
                            startActivity(intent2);
                            break;
                        case 3:
                            Intent intent3 = new Intent(MyActivity.this,ManFashionActivity.class);
                            startActivity(intent3);
                            break;
                        case 4:
                            Intent intent4 = new Intent(MyActivity.this,SportFashionActivity.class);
                            startActivity(intent4);
                            break;
                        case 5:
                            Intent intent5 = new Intent(MyActivity.this,UnderWearActivity.class);
                            startActivity(intent5);
                            break;
                        case 6:
                            Intent intent6 = new Intent(MyActivity.this,MAKActivity.class);
                            startActivity(intent6);
                            break;
                    }
                }
                else
                {
                    Intent intent = new Intent(MyActivity.this,WebViewActivity.class);
                    intent.putExtra("url",itemList.get(i).getSiteUrl());
                    intent.putExtra("title",itemList.get(i).getTitle());
                    startActivity(intent);
                }
                //finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();super.onBackPressed();
        finish();
    }
}
