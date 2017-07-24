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

public class MAKActivity extends AppCompatActivity {

   DatabaseReference dref;
    ListView mListView;
    ArrayList<String> list = new ArrayList<>();
    ArrayAdapter<String> mAdapter;

    BaseAdapter ba;
    LayoutInflater li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mak);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Saat&Aksesuar&Mücevher");

        mListView  = (ListView)findViewById(R.id.maklistview);
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


                Picasso.with(MAKActivity.this).load("https://cdn.tutsplus.com/vector/uploads/2014/03/0_Gems_tutorial_diamond.jpg").into(image);

                return view;
            }
        };

        mListView.setAdapter(ba);

        dref = FirebaseDatabase.getInstance().getReference("saatmücevher");
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
                        Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.swatch.com/tr_tr/"));
                        startActivity(viewIntent);
                        break;
                    case 1:
                        Intent viewIntent1 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.saatvesaat.com.tr/"));
                        startActivity(viewIntent1);
                        break;
                    case 2:
                        Intent viewIntent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.swarovski.com/Web_TR/tr/index"));
                        startActivity(viewIntent2);
                        break;
                    case 3:
                        Intent viewIntent3 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.sochic.com.tr/"));
                        startActivity(viewIntent3);
                        break;

                    case 4:
                        Intent viewIntent4 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.casio-intl.com/tr/tr/"));
                        startActivity(viewIntent4);
                        break;
                    case 5:
                        Intent viewIntent5 = new Intent("android.intent.action.VIEW", Uri.parse("https://global.diesel.com/homepage?origin=NOUS"));
                        startActivity(viewIntent5);
                        break;
                    case 6:
                        Intent viewIntent6 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.citizenwatch.com/en-us/"));
                        startActivity(viewIntent6);
                        break;
                    case 7:
                        Intent viewIntent7 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hugoboss.com/men-watches/"));
                        startActivity(viewIntent7);
                        break;

                    case 8:
                        Intent viewIntent8 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.fossil.com/us/en.html?borderFreeCountry=n"));
                        startActivity(viewIntent8);
                        break;
                    case 9:
                        Intent viewIntent9 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ferrowatches.com/"));
                        startActivity(viewIntent9);
                        break;
                    case 10:
                        Intent viewIntent10 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hublot.com/en/"));
                        startActivity(viewIntent10);
                        break;
                    case 11:
                        Intent viewIntent11 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.gshock.com/"));
                        startActivity(viewIntent11);
                        break;

                    case 12:
                        Intent viewIntent12 = new Intent("android.intent.action.VIEW", Uri.parse("http://danielklein.com.tr/"));
                        startActivity(viewIntent12);
                        break;
                    case 13:
                        Intent viewIntent13 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.bisaat.com/"));
                        startActivity(viewIntent13);
                        break;
                    case 14:
                        Intent viewIntent14 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.atasay.com/"));
                        startActivity(viewIntent14);
                        break;
                    case 15:
                        Intent viewIntent15 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.assospirlanta.com/"));
                        startActivity(viewIntent15);
                        break;

                    case 16:
                        Intent viewIntent16 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.altinbas.com/"));
                        startActivity(viewIntent16);
                        break;
                    case 17:
                        Intent viewIntent17 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.zenpirlanta.com/"));
                        startActivity(viewIntent17);
                        break;

                    case 18:
                        Intent viewIntent18 = new Intent("android.intent.action.VIEW", Uri.parse("https://gulaylar.com/"));
                        startActivity(viewIntent18);
                        break;

                    case 19:
                        Intent viewIntent19 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.boybeyi.com/"));
                        startActivity(viewIntent19);
                        break;
                    case 20:
                        Intent viewIntent20 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.pandora.net/tr-tr"));
                        startActivity(viewIntent20);
                        break;

                    case 21:
                        Intent viewIntent21 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.azuris.com.tr/"));
                        startActivity(viewIntent21);
                        break;

                    case 22:
                        Intent viewIntent22 = new Intent("android.intent.action.VIEW", Uri.parse("https://shop.chiccy.com/"));
                        startActivity(viewIntent22);
                        break;

                    case 23:
                        Intent viewIntent23 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.burberry.com/"));
                        startActivity(viewIntent23);
                        break;
                    case 24:
                        Intent viewIntent24 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.armaniexchange.com/countries/index"));
                        startActivity(viewIntent24);
                        break;
                    case 25:
                        Intent viewIntent25 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.michaelkors.com/"));
                        startActivity(viewIntent25);
                        break;
                    case 26:
                        Intent viewIntent26 = new Intent("android.intent.action.VIEW", Uri.parse("http://uk.accessorize.com/"));
                        startActivity(viewIntent26);
                        break;
                }
            }
        });

      /*  swatch = (Button)findViewById(R.id.swatch);
        swatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.swatch.com/tr_tr/"));
                startActivity(viewIntent);
            }
        });

        saatsaat = (Button)findViewById(R.id.saatsaat);
        saatsaat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.saatvesaat.com.tr/"));
                startActivity(viewIntent);
            }
        });

        swarovski = (Button)findViewById(R.id.swarovski);
        swarovski.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.swarovski.com/Web_TR/tr/index"));
                startActivity(viewIntent);
            }
        });

        casio = (Button)findViewById(R.id.casio);
        casio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.casio-intl.com/tr/tr/"));
                startActivity(viewIntent);
            }
        });

        diesel = (Button)findViewById(R.id.diesel);
        diesel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://global.diesel.com/homepage?origin=NOUS"));
                startActivity(viewIntent);
            }
        });


        citizen = (Button)findViewById(R.id.citizen);
        citizen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.citizenwatch.com/en-us/"));
                startActivity(viewIntent);
            }
        });

        boss = (Button)findViewById(R.id.boss);
        boss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hugoboss.com/men-watches/"));
                startActivity(viewIntent);
            }
        });

        fossil = (Button)findViewById(R.id.fossil);
        fossil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.fossil.com/us/en.html?borderFreeCountry=n"));
                startActivity(viewIntent);
            }
        });

        atasay = (Button)findViewById(R.id.atasay);
        atasay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.atasay.com/"));
                startActivity(viewIntent);
            }
        });

        altinbas = (Button)findViewById(R.id.altinbas);
        altinbas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.altinbas.com/"));
                startActivity(viewIntent);
            }
        });

        assos = (Button)findViewById(R.id.assos);
        assos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.assospirlanta.com/"));
                startActivity(viewIntent);
            }
        });

        zen = (Button)findViewById(R.id.zen);
        zen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.zenpirlanta.com/"));
                startActivity(viewIntent);
            }
        });

        gülaylar = (Button)findViewById(R.id.gülaylar);
        gülaylar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://gulaylar.com/"));
                startActivity(viewIntent);
            }
        });

        azuris = (Button)findViewById(R.id.azuris);
        azuris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.azuris.com.tr/"));
                startActivity(viewIntent);
            }
        });

        boybeyi = (Button)findViewById(R.id.boybeyi);
        boybeyi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.boybeyi.com/"));
                startActivity(viewIntent);
            }
        });

        chiccy = (Button)findViewById(R.id.chiccy);
        chiccy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://shop.chiccy.com/"));
                startActivity(viewIntent);
            }
        });

        sochic = (Button)findViewById(R.id.sochic);
        sochic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.sochic.com.tr/"));
                startActivity(viewIntent);
            }
        });


        pandora = (Button)findViewById(R.id.pandora);
        pandora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.pandora.net/tr-tr"));
                startActivity(viewIntent);
            }
        });

        prego = (Button)findViewById(R.id.prego);
        prego.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.pandora.net/tr-tr"));
                startActivity(viewIntent);
            }
        });

        burberry = (Button)findViewById(R.id.burberry);
        burberry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.burberry.com/"));
                startActivity(viewIntent);
            }
        });

        armani = (Button)findViewById(R.id.armani);
        armani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.armaniexchange.com/countries/index"));
                startActivity(viewIntent);
            }
        });

        kors = (Button)findViewById(R.id.kors);
        kors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.michaelkors.com/"));
                startActivity(viewIntent);
            }
        });

        accessorize = (Button)findViewById(R.id.accessorize);
        accessorize.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://uk.accessorize.com/"));
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
                Intent intent = new Intent(MAKActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
