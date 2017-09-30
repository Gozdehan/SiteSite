package com.gozdehanozturk.sitesite;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
import android.widget.ToggleButton;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.gozdehanozturk.sitesite.manager.FavoriteManager;
import com.gozdehanozturk.sitesite.model.ItemModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class MyActivity extends AppCompatActivity
{

    DatabaseReference dref;
    ListView mListView;
    List<ItemModel> itemList = new ArrayList<ItemModel>();
    ToggleButton tb;
    private FavoriteManager favoriteManager;

    BaseAdapter ba;
    LayoutInflater li;


   // SP sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        favoriteManager = ((MyApplication) getApplication()).getFavoriteManager();

        ActionBar ab = getSupportActionBar();

        //sp =new SP(this);
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
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(final int position, View convertView, ViewGroup parent) {
                if (convertView == null) {
                    convertView = li.inflate(R.layout.list_item, parent, false);
                }

                tb = (ToggleButton)convertView.findViewById(R.id.tb);
                tb.setChecked(favoriteManager.isFavorite(itemList.get(position).getSiteUrl()));
                tb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (((ToggleButton) view).isChecked()) {
                            favoriteManager.add(itemList.get(position).getSiteUrl());
                        } else {
                            favoriteManager.remove(itemList.get(position).getSiteUrl());
                        }
                    }
                });

                final View finalConvertView = convertView;

                ImageView image = convertView.findViewById(R.id.item_logo);
                TextView text = finalConvertView.findViewById(R.id.item_name);
                text.setText(itemList.get(position).getTitle());

                Picasso.with(MyActivity.this).load(itemList.get(position).getLogoUrl()).into(image);
                return convertView;
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
                    item.setKeys(dataSnapshot.getKey(), data.getKey());
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
                    Intent in = new Intent(MyActivity.this,SubActivity.class);
                    switch (i){
                        case 0:
                            in.putExtra("tur", "ayakkabicanta");
                            break;
                        case 1:
                            in.putExtra("tur", "giyim");
                            break;
                        case 2:
                            in.putExtra("tur", "kadingiyim");
                            break;
                        case 3:
                            in.putExtra("tur", "erkekgiyim");
                            break;
                        case 4:
                            in.putExtra("tur", "sporgiyim");
                            break;
                        case 5:
                            in.putExtra("tur", "icgiyim");
                            break;
                        case 6:
                            in.putExtra("tur", "kozmetik");
                            break;
                    }
                    startActivity(in);
                }
                else
                {
                    Intent intent = new Intent(MyActivity.this,WebViewActivity.class);
                    intent.putExtra("url",itemList.get(i).getSiteUrl());
                    intent.putExtra("title",itemList.get(i).getTitle());
                    startActivity(intent);
                }
            }
        });

        mListView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent shareIntent = new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_SUBJECT, itemList.get(i).getTitle());
                shareIntent.putExtra(Intent.EXTRA_TEXT, itemList.get(i).getSiteUrl());
                startActivity(Intent.createChooser(shareIntent, "PAYLAŞ"));
                return true;
            }
        });
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();super.onBackPressed();
        finish();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.search:
                startActivity(new Intent(this, SearchActivity.class));
                break;

            case R.id.offer:
                startActivity(new Intent(this,OfferActivity.class));
                break;

        /*    case R.id.fav:
                startActivity(new Intent(this,FavoriteActivity.class));
                break;*/
        }
        return super.onOptionsItemSelected(item);
    }

}
