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

public class ManFashionActivity extends AppCompatActivity {

  DatabaseReference dref;
    ListView mListView;
    ArrayList<String> list = new ArrayList<>();
    ArrayAdapter<String> mAdapter;

    BaseAdapter ba;
    LayoutInflater li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_fashion);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Erkek Giyim");

        mListView  = (ListView)findViewById(R.id.manfashionlistview);
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


                Picasso.with(ManFashionActivity.this).load("https://cdn3.iconfinder.com/data/icons/clothing/500/Agent_coat_male_man_people_business_businessman_clothes_tie_suit-512.png").into(image);

                return view;
            }
        };

        mListView.setAdapter(ba);

        dref = FirebaseDatabase.getInstance().getReference("erkekgiyim");
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
                        Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.altinyildizclassics.com/"));
                        startActivity(viewIntent);
                        break;
                    case 1:
                        Intent viewIntent1 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.avva.com.tr/"));
                        startActivity(viewIntent1);
                        break;
                    case 2:
                        Intent viewIntent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.cacharel.com.tr/"));
                        startActivity(viewIntent2);
                        break;
                    case 3:
                        Intent viewIntent3 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.damattween.com/"));
                        startActivity(viewIntent3);
                        break;

                    case 4:
                        Intent viewIntent4 = new Intent("android.intent.action.VIEW", Uri.parse("http://efor.com.tr/"));
                        startActivity(viewIntent4);
                        break;
                    case 5:
                        Intent viewIntent5 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hatemoglu.com/tr/"));
                        startActivity(viewIntent5);
                        break;
                    case 6:
                        Intent viewIntent6 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.igs.com.tr/"));
                        startActivity(viewIntent6);
                        break;
                    case 7:
                        Intent viewIntent7 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.jackjones.com/on/demandware.store/Sites-jj-root-Site/default/Country-Show"));
                        startActivity(viewIntent7);
                        break;

                    case 8:
                        Intent viewIntent8 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.kigili.com/"));
                        startActivity(viewIntent8);
                        break;
                    case 9:
                        Intent viewIntent9 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ramsey.com.tr/"));
                        startActivity(viewIntent9);
                        break;
                    case 10:
                        Intent viewIntent10 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.suvari.com.tr/tr/"));
                        startActivity(viewIntent10);
                        break;
                }
            }
        });


    /*    avva = (Button)findViewById(R.id.avva);
        avva.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.avva.com.tr/"));
                startActivity(viewIntent);
            }
        });


        damat = (Button)findViewById(R.id.damat);
        damat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.damattween.com/"));
                startActivity(viewIntent);
            }
        });

        hatemoglu = (Button)findViewById(R.id.hatemoglu);
        hatemoglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hatemoglu.com/tr/"));
                startActivity(viewIntent);
            }
        });

        igs = (Button)findViewById(R.id.igs);
        igs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.igs.com.tr/"));
                startActivity(viewIntent);
            }
        });



        jack = (Button)findViewById(R.id.jack);
        jack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.jackjones.com/on/demandware.store/Sites-jj-root-Site/default/Country-Show"));
                startActivity(viewIntent);
            }
        });

        kigılı = (Button)findViewById(R.id.kigili);
        kigılı.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.kigili.com/"));
                startActivity(viewIntent);
            }
        });

        efor = (Button)findViewById(R.id.efor);
        efor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://efor.com.tr/"));
                startActivity(viewIntent);
            }
        });

        süvari = (Button)findViewById(R.id.süvari);
        süvari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.suvari.com.tr/tr/"));
                startActivity(viewIntent);
            }
        });

        ramsey = (Button)findViewById(R.id.ramsey);
        ramsey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ramsey.com.tr/"));
                startActivity(viewIntent);
            }
        });

        cacharel = (Button)findViewById(R.id.cacharel);
        cacharel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.cacharel.com.tr/"));
                startActivity(viewIntent);
            }
        });

        altinyildiz = (Button)findViewById(R.id.altinyildiz);
        altinyildiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.altinyildizclassics.com/"));
                startActivity(viewIntent);
            }
        });

        fabrika = (Button)findViewById(R.id.fabrika);
        fabrika.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(ManFashionActivity.this,"Boyner'in sitesinden Fabrika'nın ürünlerine ulaşabilirsiniz.",Toast.LENGTH_LONG).show();
            }
        });  */
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
            case R.id.menuId:
                Intent intent = new Intent(ManFashionActivity.this, CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
