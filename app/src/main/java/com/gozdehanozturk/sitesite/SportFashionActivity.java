package com.gozdehanozturk.sitesite;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
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

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class SportFashionActivity extends AppCompatActivity {
    DatabaseReference dref;
    ListView mListView;
    ArrayList<String> list = new ArrayList<>();
    ArrayAdapter<String> mAdapter;

    BaseAdapter ba;
    LayoutInflater li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport_fashion);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Spor Giyim");


        mListView  = (ListView)findViewById(R.id.sportfashionlistview);
        mAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,list);

        li = LayoutInflater.from(this);

        ba = new BaseAdapter() {
            @Override
            public int getCount() {
                return list.size();
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
                text.setText(list.get(i));


                Picasso.with(SportFashionActivity.this).load("https://www.redfaire.com/assets/images/icons/icon-world-class-bi.png").into(image);

                return view;
            }
        };

        mListView.setAdapter(ba);

        dref = FirebaseDatabase.getInstance().getReference("sporgiyim");
        dref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                list.add(dataSnapshot.getValue().toString());
                ba.notifyDataSetChanged();
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.decathlon.com.tr/"));
                        startActivity(viewIntent);
                        break;
                    case 1:
                        Intent viewIntent1 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.columbia.com.tr/"));
                        startActivity(viewIntent1);
                        break;
                    case 2:
                        Intent viewIntent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.salomon.com/"));
                        startActivity(viewIntent2);
                        break;
                    case 3:
                        Intent viewIntent3 = new Intent("android.intent.action.VIEW", Uri.parse("http://shop.hummel.com.tr/"));
                        startActivity(viewIntent3);
                        break;

                    case 4:
                        Intent viewIntent4 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.jack-wolfskin.com/"));
                        startActivity(viewIntent4);
                        break;
                    case 5:
                        Intent viewIntent5 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.thenorthface.com/"));
                        startActivity(viewIntent5);
                        break;
                    case 6:
                        Intent viewIntent6 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.newbalance.com.tr/"));
                        startActivity(viewIntent6);
                        break;
                    case 7:
                        Intent viewIntent7 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.nike.com/tr/tr_tr/"));
                        startActivity(viewIntent7);
                        break;

                    case 8:
                        Intent viewIntent8 = new Intent("android.intent.action.VIEW", Uri.parse("https://shop.adidas.com.tr/"));
                        startActivity(viewIntent8);
                        break;
                    case 9:
                        Intent viewIntent9 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.puma.com.tr/"));
                        startActivity(viewIntent9);
                        break;
                    case 10:
                        Intent viewIntent10 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.skechers.com.tr/"));
                        startActivity(viewIntent10);
                        break;
                    case 11:
                        Intent viewIntent11 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.spx.com.tr/"));
                        startActivity(viewIntent11);
                        break;

                    case 12:
                        Intent viewIntent12 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.reebok.com.tr/"));
                        startActivity(viewIntent12);
                        break;
                    case 13:
                        Intent viewIntent13 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.enderspor.com/"));
                        startActivity(viewIntent13);
                        break;
                }
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
                Intent intent = new Intent(SportFashionActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
