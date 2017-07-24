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

public class HomeStyleActivity extends AppCompatActivity {

  DatabaseReference dref;
    ListView mListView;
    ArrayList<String> list = new ArrayList<>();
    ArrayAdapter<String> mAdapter;

    BaseAdapter ba;
    LayoutInflater li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_style);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Ev Tekstili");

        mListView  = (ListView)findViewById(R.id.homelistview);
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


                Picasso.with(HomeStyleActivity.this).load("https://cdn4.iconfinder.com/data/icons/basic-interface-overcolor/512/home-512.png").into(image);

                return view;
            }
        };

        mListView.setAdapter(ba);

        dref = FirebaseDatabase.getInstance().getReference("ev");
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
                        Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.bauhaus.com.tr/"));
                        startActivity(viewIntent);
                        break;
                    case 1:
                        Intent viewIntent1 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.bellona.com.tr/"));
                        startActivity(viewIntent1);
                        break;
                    case 2:
                        Intent viewIntent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.bernardo.com.tr/"));
                        startActivity(viewIntent2);
                        break;
                    case 3:
                        Intent viewIntent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.chakra.com.tr/"));
                        startActivity(viewIntent3);
                        break;

                    case 4:
                        Intent viewIntent4 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dekorazon.com/"));
                        startActivity(viewIntent4);
                        break;
                    case 5:
                        Intent viewIntent5 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.englishhome.com.tr/"));
                        startActivity(viewIntent5);
                        break;
                    case 6:
                        Intent viewIntent6 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.enplus.com.tr/"));
                        startActivity(viewIntent6);
                        break;
                    case 7:
                        Intent viewIntent7 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.enzahome.com.tr/"));
                        startActivity(viewIntent7);
                        break;

                    case 8:
                        Intent viewIntent8 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.evidea.com/"));
                        startActivity(viewIntent8);
                        break;
                    case 9:
                        Intent viewIntent9 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.evmanya.com/"));
                        startActivity(viewIntent9);
                        break;
                    case 10:
                        Intent viewIntent10 = new Intent("android.intent.action.VIEW", Uri.parse("http://fakir.com.tr/"));
                        startActivity(viewIntent10);
                        break;
                    case 11:
                        Intent viewIntent11 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.homesweethome.com.tr/"));
                        startActivity(viewIntent11);
                        break;

                    case 12:
                        Intent viewIntent12 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.istikbal.com.tr/"));
                        startActivity(viewIntent12);
                        break;
                    case 13:
                        Intent viewIntent13 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ikea.com.tr/"));
                        startActivity(viewIntent13);
                        break;
                    case 14:
                        Intent viewIntent14 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.jumbo.com.tr/"));
                        startActivity(viewIntent14);
                        break;
                    case 15:
                        Intent viewIntent15 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.krc.com.tr/"));
                        startActivity(viewIntent15);
                        break;

                    case 16:
                        Intent viewIntent16 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.koctas.com.tr/"));
                        startActivity(viewIntent16);
                        break;
                    case 17:
                        Intent viewIntent17 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.korkmaz.com.tr/"));
                        startActivity(viewIntent17);
                        break;
                    case 18:
                        Intent viewIntent18 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.linens.com.tr/"));
                        startActivity(viewIntent18);
                        break;

                    case 19:
                        Intent viewIntent19 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.madamecoco.com/"));
                        startActivity(viewIntent19);
                        break;
                    case 20:
                        Intent viewIntent20 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.mondi.com.tr/"));
                        startActivity(viewIntent20);
                        break;

                    case 21:
                        Intent viewIntent21 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.mudo.com.tr/ev-mobilya/"));
                        startActivity(viewIntent21);
                        break;

                    case 22:
                        Intent viewIntent22 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ozdilek.com.tr/"));
                        startActivity(viewIntent22);
                        break;

                    case 23:
                        Intent viewIntent23 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.pasabahce.com/tr"));
                        startActivity(viewIntent23);
                        break;
                    case 24:
                        Intent viewIntent24 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.schafer.com.tr/"));
                        startActivity(viewIntent24);
                        break;
                    case 25:
                        Intent viewIntent25 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.tac.com.tr/"));
                        startActivity(viewIntent25);
                        break;

                    case 26:
                        Intent viewIntent26 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.tefalshop.com.tr/"));
                        startActivity(viewIntent26);
                        break;
                    case 27:
                        Intent viewIntent27 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.yatasbedding.com.tr/"));
                        startActivity(viewIntent27);
                        break;

                    case 28:
                        Intent viewIntent28 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.zarahome.com/tr/"));
                        startActivity(viewIntent28);
                        break;
                    case 29:
                        Intent viewIntent29 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.whiteandbeige.com/"));
                        startActivity(viewIntent29);
                        break;
                }
            }
        });

     /*   enza = (Button)findViewById(R.id.enza);
        enza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.enzahome.com.tr/"));
                startActivity(viewIntent);
            }
        });

        enplus = (Button)findViewById(R.id.enplus);
        enplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.enplus.com.tr/"));
                startActivity(viewIntent);
            }
        });

        fakir = (Button)findViewById(R.id.fakir);
        fakir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://fakir.com.tr/"));
                startActivity(viewIntent);
            }
        });


        jumbo = (Button)findViewById(R.id.jumbo);
        jumbo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.jumbo.com.tr/"));
                startActivity(viewIntent);
            }
        });

        englishhome = (Button)findViewById(R.id.englishhome);
        englishhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.englishhome.com.tr/"));
                startActivity(viewIntent);
            }
        });


        chakra = (Button)findViewById(R.id.chakra);
        chakra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.chakra.com.tr/"));
                startActivity(viewIntent);
            }
        });

        bernardo = (Button)findViewById(R.id.bernardo);
        bernardo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.bernardo.com.tr/"));
                startActivity(viewIntent);
            }
        });

        coco = (Button)findViewById(R.id.coco);
        coco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.madamecoco.com/"));
                startActivity(viewIntent);
            }
        });

        homesweet = (Button)findViewById(R.id.homesweet);
        homesweet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.homesweethome.com.tr/"));
                startActivity(viewIntent);
            }
        });

        evmanya = (Button)findViewById(R.id.evmanya);
        evmanya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.evmanya.com/"));
                startActivity(viewIntent);
            }
        });

        yatas = (Button)findViewById(R.id.yatas);
        yatas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.yatasbedding.com.tr/"));
                startActivity(viewIntent);
            }
        });

        bellona = (Button)findViewById(R.id.bellona);
        bellona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.bellona.com.tr/"));
                startActivity(viewIntent);
            }
        });

        istikbal = (Button)findViewById(R.id.istikbal);
        istikbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.istikbal.com.tr/"));
                startActivity(viewIntent);
            }
        });

        bauhaus = (Button)findViewById(R.id.bauhaus);
        bauhaus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.bauhaus.com.tr/"));
                startActivity(viewIntent);
            }
        });

        korkmaz = (Button)findViewById(R.id.korkmaz);
        korkmaz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.korkmaz.com.tr/"));
                startActivity(viewIntent);
            }
        });

        mudo = (Button)findViewById(R.id.mudo);
        mudo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.mudo.com.tr/ev-mobilya/"));
                startActivity(viewIntent);
            }
        });

        karaca = (Button)findViewById(R.id.karaca);
        karaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.krc.com.tr/"));
                startActivity(viewIntent);
            }
        });

        linens = (Button)findViewById(R.id.linens);
        linens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.linens.com.tr/"));
                startActivity(viewIntent);
            }
        });

        özdilek = (Button)findViewById(R.id.ozdilek);
        özdilek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ozdilek.com.tr/"));
                startActivity(viewIntent);
            }
        });

        zarahome = (Button)findViewById(R.id.zarahome);
        zarahome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.zarahome.com/tr/"));
                startActivity(viewIntent);
            }
        });

        pasabahce = (Button)findViewById(R.id.pasabahce);
        pasabahce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.pasabahce.com/tr"));
                startActivity(viewIntent);
            }
        });

        schafer = (Button)findViewById(R.id.schafer);
        schafer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.schafer.com.tr/"));
                startActivity(viewIntent);
            }
        });

        tefal = (Button)findViewById(R.id.tefal);
        tefal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.tefalshop.com.tr/"));
                startActivity(viewIntent);
            }
        });

        tac = (Button)findViewById(R.id.tac);
        tac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.tac.com.tr/"));
                startActivity(viewIntent);
            }
        });

        ikea = (Button)findViewById(R.id.ikea);
        ikea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ikea.com.tr/"));
                startActivity(viewIntent);
            }
        });

        koctas = (Button)findViewById(R.id.koctas);
        koctas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.koctas.com.tr/"));
                startActivity(viewIntent);
            }
        });

        evidea = (Button)findViewById(R.id.evidea);
        evidea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.evidea.com/"));
                startActivity(viewIntent);
            }
        });

        dekorazon = (Button)findViewById(R.id.dekorazon);
        dekorazon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dekorazon.com/"));
                startActivity(viewIntent);
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

        switch(item.getItemId()){
            case R.id.menuId:
                Intent intent = new Intent(HomeStyleActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
