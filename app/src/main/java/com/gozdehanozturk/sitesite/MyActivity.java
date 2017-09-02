package com.gozdehanozturk.sitesite;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.StateListDrawable;
import android.preference.PreferenceManager;
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
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.gozdehanozturk.sitesite.model.FavoriteModel;
import com.gozdehanozturk.sitesite.model.ItemModel;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;

import java.util.ArrayList;
import java.util.List;

public class MyActivity extends AppCompatActivity
{

    DatabaseReference dref;
    ListView mListView;
    List<ItemModel> itemList = new ArrayList<ItemModel>();
    ToggleButton tb;


    BaseAdapter ba;
    LayoutInflater li;


   // SP sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);

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
                final View finalConvertView = convertView;

              /*  boolean isSelected = sp.isFavSelected(itemList.get(position).getTitle());
                Log.e("x","CURR : "+itemList.get(position).getTitle()+" --> "+isSelected);
                tb.setChecked(isSelected);


                tb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                        String baslik= itemList.get(position).getTitle();
                        sp.setFavValueOfSite(baslik, true);

                        Log.e("x",baslik+" --> "+b);
                    }
                });
/*

                tb.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        SharedPreferences sharedPreferences = getSharedPreferences("favorites", Context.MODE_PRIVATE);
                        SharedPreferences.Editor editor = sharedPreferences.edit();
                        TextView text = finalConvertView.findViewById(R.id.item_name);
                        Log.d("LOGTEST",itemList.get(position).getSiteUrl());
                        String currentFavItems = sharedPreferences.getString("favitems", "");

                        String newFavItems = "";
                        if(currentFavItems.equals("")){
                            newFavItems = itemList.get(position).getSharedKey();
                        }else{
                            if(currentFavItems.contains(",")){
                                String items[] = currentFavItems.split(",");

                                for(String item:items){
                                    if(item.equals(itemList.get(position).getSharedKey())){
                                        newFavItems = currentFavItems;
                                    }else{
                                        newFavItems = currentFavItems + "," + itemList.get(position).getSharedKey();
                                    }
                                }
                            }else{

                                newFavItems = currentFavItems + "," + itemList.get(position).getSharedKey();
                            }
                        }
                        editor.putString("favitems", newFavItems);
                        editor.commit();
                        Log.i("FAVORITEST",editor.toString());
                    }
                });
*/
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
