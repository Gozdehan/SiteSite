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

public class ShoesBagActivity extends AppCompatActivity {

 //   Button aldo, ayakkabi, bambi, beta, camper, deichman, desa, dockers, matmazel, divarese, ecco, elle, flo, footlocker, greyder, hotic, inci, superstep, tanca, ninewest, tergan, macys, dsw, colehaan, clarks, jimmychoo, kurtgeiger, hudsons, skechers, bloomingdales, payless ;

    DatabaseReference dref;
    ListView mListView;
    ArrayList<String> list = new ArrayList<>();
    ArrayAdapter<String> mAdapter;

    BaseAdapter ba;
    LayoutInflater li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoes_bag);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Ayakkabı & Çanta");

        mListView  = (ListView)findViewById(R.id.shoesbaglistview);
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


                Picasso.with(ShoesBagActivity.this).load("https://cdn3.iconfinder.com/data/icons/women-and-men-shoes/500/snickers_soccer_sport_icon_dance_men_shoes-512.png").into(image);

                return view;
            }
        };

        mListView.setAdapter(ba);

        dref = FirebaseDatabase.getInstance().getReference("ayakkabicanta");
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
                        Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.aldoshoes.com.tr/"));
                        startActivity(viewIntent);
                        break;
                    case 1:
                        Intent viewIntent1 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ayakkabidunyasi.com.tr/"));
                        startActivity(viewIntent1);
                        break;
                    case 2:
                        Intent viewIntent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.bambistore.com.tr/"));
                        startActivity(viewIntent2);
                        break;
                    case 3:
                        Intent viewIntent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.betashoes.com/"));
                        startActivity(viewIntent3);
                        break;

                    case 4:
                        Intent viewIntent4 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.bloomingdales.com/"));
                        startActivity(viewIntent4);
                        break;
                    case 5:
                        Intent viewIntent5 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.camper.com/tr_TR"));
                        startActivity(viewIntent5);
                        break;
                    case 6:
                        Intent viewIntent6 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.clarks.com.tr/"));
                        startActivity(viewIntent6);
                        break;
                    case 7:
                        Intent viewIntent7 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.deichmann.com/TR/tr/shop/welcome.html"));
                        startActivity(viewIntent7);
                        break;

                    case 8:
                        Intent viewIntent8 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.desa.com.tr/"));
                        startActivity(viewIntent8);
                        break;
                    case 9:
                        Intent viewIntent9 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.divarese.com.tr/"));
                        startActivity(viewIntent9);
                        break;
                    case 10:
                        Intent viewIntent10 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dockersturkey.com/"));
                        startActivity(viewIntent10);
                        break;
                    case 11:
                        Intent viewIntent11 = new Intent("android.intent.action.VIEW", Uri.parse("https://tr.ecco.com/"));
                        startActivity(viewIntent11);
                        break;

                    case 12:
                        Intent viewIntent12 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.elleshoes.com/"));
                        startActivity(viewIntent12);
                        break;
                    case 13:
                        Intent viewIntent13 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.flo.com.tr/"));
                        startActivity(viewIntent13);
                        break;
                    case 14:
                        Intent viewIntent14 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.footlocker.com/"));
                        startActivity(viewIntent14);
                        break;
                    case 15:
                        Intent viewIntent15 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.greyder.com/"));
                        startActivity(viewIntent15);
                        break;

                    case 16:
                        Intent viewIntent16 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hotic.com.tr/"));
                        startActivity(viewIntent16);
                        break;
                    case 17:
                        Intent viewIntent17 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.thebay.com/webapp/wcs/stores/servlet/en/thebay"));
                        startActivity(viewIntent17);
                        break;

                    case 18:
                        Intent viewIntent18 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.incideri.com/"));
                        startActivity(viewIntent18);
                        break;

                    case 19:
                        Intent viewIntent19 = new Intent("android.intent.action.VIEW", Uri.parse("http://row.jimmychoo.com/en/home"));
                        startActivity(viewIntent19);
                        break;
                    case 20:
                        Intent viewIntent20 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.kemaltanca.com.tr/"));
                        startActivity(viewIntent20);
                        break;

                    case 21:
                        Intent viewIntent21 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.kurtgeiger.com/"));
                        startActivity(viewIntent21);
                        break;

                    case 22:
                        Intent viewIntent22 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.macys.com/"));
                        startActivity(viewIntent22);
                        break;

                    case 23:
                        Intent viewIntent23 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.matmazelstore.com/"));
                        startActivity(viewIntent23);
                        break;
                    case 24:
                        Intent viewIntent24 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ninewest.com.tr/"));
                        startActivity(viewIntent24);
                        break;
                    case 25:
                        Intent viewIntent25 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.payless.com/"));
                        startActivity(viewIntent25);
                        break;
                    case 26:
                        Intent viewIntent26 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.superstep.com.tr/"));
                        startActivity(viewIntent26);
                        break;
                    case 27:
                        Intent viewIntent27 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.tergan.com.tr/"));
                        startActivity(viewIntent27);
                        break;

                }
            }
        });

     /*   aldo = (Button)findViewById(R.id.aldo);
        aldo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.aldoshoes.com.tr/"));
                startActivity(viewIntent);
            }
        });

        ayakkabi = (Button)findViewById(R.id.ayakkabi);
        ayakkabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ayakkabidunyasi.com.tr/"));
                startActivity(viewIntent);
            }
        });

        bambi = (Button)findViewById(R.id.bambi);
        bambi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.bambistore.com.tr/"));
                startActivity(viewIntent);
            }
        });

        beta = (Button)findViewById(R.id.beta);
        beta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.betashoes.com/"));
                startActivity(viewIntent);
            }
        });

        camper = (Button)findViewById(R.id.camper);
        camper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.camper.com/tr_TR"));
                startActivity(viewIntent);
            }
        });

        deichman = (Button)findViewById(R.id.deichman);
        deichman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.deichmann.com/TR/tr/shop/welcome.html"));
                startActivity(viewIntent);
            }
        });

        desa = (Button)findViewById(R.id.desa);
        desa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.desa.com.tr/"));
                startActivity(viewIntent);
            }
        });

        divarese = (Button)findViewById(R.id.divarese);
        divarese.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.divarese.com.tr/"));
                startActivity(viewIntent);
            }
        });

        dockers = (Button)findViewById(R.id.dockers);
        dockers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dockersturkey.com/"));
                startActivity(viewIntent);
            }
        });

        ecco = (Button)findViewById(R.id.ecco);
        ecco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://tr.ecco.com/"));
                startActivity(viewIntent);
            }
        });

        elle = (Button)findViewById(R.id.elle);
        elle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.elleshoes.com/"));
                startActivity(viewIntent);
            }
        });

        flo = (Button)findViewById(R.id.flo);
        flo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.flo.com.tr/"));
                startActivity(viewIntent);
            }
        });

        footlocker = (Button)findViewById(R.id.footlocker);
        footlocker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.footlocker.com/"));
                startActivity(viewIntent);
            }
        });

        greyder = (Button)findViewById(R.id.greyder);
        greyder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.greyder.com/"));
                startActivity(viewIntent);
            }
        });

        hotic = (Button)findViewById(R.id.hotic);
        hotic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hotic.com.tr/"));
                startActivity(viewIntent);
            }
        });

        inci = (Button)findViewById(R.id.inci);
        inci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.incideri.com/"));
                startActivity(viewIntent);
            }
        });

        tanca = (Button)findViewById(R.id.tanca);
        tanca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.kemaltanca.com.tr/"));
                startActivity(viewIntent);
            }
        });

        matmazel = (Button)findViewById(R.id.matmazel);
        matmazel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.matmazelstore.com/"));
                startActivity(viewIntent);
            }
        });

        ninewest = (Button)findViewById(R.id.ninewest);
        ninewest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ninewest.com.tr/"));
                startActivity(viewIntent);
            }
        });

        superstep = (Button)findViewById(R.id.süperstep);
        superstep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.superstep.com.tr/"));
                startActivity(viewIntent);
            }
        });

        tergan = (Button)findViewById(R.id.tergan);
        tergan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://fitchef.com.tr/"));
                startActivity(viewIntent);
            }
        });

        macys = (Button)findViewById(R.id.macys);
        macys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.macys.com/"));
                startActivity(viewIntent);
            }
        });

        clarks = (Button)findViewById(R.id.clarks);
        clarks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.clarks.com.tr/"));
                startActivity(viewIntent);
            }
        });

        jimmychoo = (Button)findViewById(R.id.jimmychoo);
        jimmychoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://row.jimmychoo.com/en/home"));
                startActivity(viewIntent);
            }
        });

        kurtgeiger = (Button)findViewById(R.id.kurtgeiger);
        kurtgeiger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.kurtgeiger.com/"));
                startActivity(viewIntent);
            }
        });

        hudsons = (Button)findViewById(R.id.hudsons);
        hudsons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.thebay.com/webapp/wcs/stores/servlet/en/thebay"));
                startActivity(viewIntent);
            }
        });

        bloomingdales = (Button)findViewById(R.id.bloomingdales);
        bloomingdales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.bloomingdales.com/"));
                startActivity(viewIntent);
            }
        });

        payless = (Button)findViewById(R.id.payless);
        payless.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.payless.com/"));
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
                Intent intent = new Intent(ShoesBagActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
