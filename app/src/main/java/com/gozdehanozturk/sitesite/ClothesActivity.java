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

public class ClothesActivity extends AppCompatActivity {

    DatabaseReference dref;
    ListView mListView;
    ArrayList<String> list = new ArrayList<>();
    ArrayAdapter<String> mAdapter;

    BaseAdapter ba;
    LayoutInflater li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothes);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Giyim");

        li = LayoutInflater.from(this);

        mListView  = (ListView)findViewById(R.id.clotheslistview);
        mAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,list);


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


                Picasso.with(ClothesActivity.this).load("https://cdn4.iconfinder.com/data/icons/green-shopper/1054/clothes.png").into(image);

                return view;
            }
        };


        mListView.setAdapter(ba);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://tr.benetton.com/"));
                        startActivity(viewIntent);
                        break;
                    case 1:
                        Intent viewIntent1 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.bershka.com/tr/"));
                        startActivity(viewIntent1);
                        break;
                    case 2:
                        Intent viewIntent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.beymen.com/"));
                        startActivity(viewIntent2);
                        break;
                    case 3:
                        Intent viewIntent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.boyner.com.tr/"));
                        startActivity(viewIntent3);
                        break;

                    case 4:
                        Intent viewIntent4 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.c-and-a.com/uk/en/corporate/company/"));
                        startActivity(viewIntent4);
                        break;
                    case 5:
                        Intent viewIntent5 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.collezione.com/"));
                        startActivity(viewIntent5);
                        break;
                    case 6:
                        Intent viewIntent6 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.colins.com.tr/"));
                        startActivity(viewIntent6);
                        break;
                    case 7:
                        Intent viewIntent7 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.defacto.com.tr/"));
                        startActivity(viewIntent7);
                        break;

                    case 8:
                        Intent viewIntent8 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.deriden.com.tr/"));
                        startActivity(viewIntent8);
                        break;
                    case 9:
                        Intent viewIntent9 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.derimod.com.tr/"));
                        startActivity(viewIntent9);
                        break;
                    case 10:
                        Intent viewIntent10 = new Intent("android.intent.action.VIEW", Uri.parse("http://gap.com.tr/"));
                        startActivity(viewIntent10);
                        break;
                    case 11:
                        Intent viewIntent11 = new Intent("android.intent.action.VIEW", Uri.parse("http://www2.hm.com/tr_tr/index.html"));
                        startActivity(viewIntent11);
                        break;

                    case 12:
                        Intent viewIntent12 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.koton.com/tr/"));
                        startActivity(viewIntent12);
                        break;
                    case 13:
                        Intent viewIntent13 = new Intent("android.intent.action.VIEW", Uri.parse("https://shop.lacoste.com.tr/"));
                        startActivity(viewIntent13);
                        break;
                    case 14:
                        Intent viewIntent14 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.lcwaikiki.com/tr-TR/TR"));
                        startActivity(viewIntent14);
                        break;
                    case 15:
                        Intent viewIntent15 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.leecooper-turkey.com/"));
                        startActivity(viewIntent15);
                        break;

                    case 16:
                        Intent viewIntent16 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.levi.com/TR/tr_TR/"));
                        startActivity(viewIntent16);
                        break;
                    case 17:
                        Intent viewIntent17 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.loft.com.tr/"));
                        startActivity(viewIntent17);
                        break;
                    case 18:
                        Intent viewIntent18 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.ltbjeans.com/"));
                        startActivity(viewIntent18);
                        break;

                    case 19:
                        Intent viewIntent19 = new Intent("android.intent.action.VIEW", Uri.parse("http://shop.mango.com/TR"));
                        startActivity(viewIntent19);
                        break;
                    case 20:
                        Intent viewIntent20 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.marksandspencer.com/"));
                        startActivity(viewIntent20);
                        break;

                    case 21:
                        Intent viewIntent21 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.massimodutti.com/tr/"));
                        startActivity(viewIntent21);
                        break;

                    case 22:
                        Intent viewIntent22 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.mavi.com/"));
                        startActivity(viewIntent22);
                        break;

                    case 23:
                        Intent viewIntent23 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.mustang-jeans.com.tr/"));
                        startActivity(viewIntent23);
                        break;
                    case 24:
                        Intent viewIntent24 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.nautica-tr.com/"));
                        startActivity(viewIntent24);
                        break;
                    case 25:
                        Intent viewIntent25 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.network.com.tr/"));
                        startActivity(viewIntent25);
                        break;

                    case 26:
                        Intent viewIntent26 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.pierrecardin.com.tr/"));
                        startActivity(viewIntent26);
                        break;
                    case 27:
                        Intent viewIntent27 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.pullandbear.com/tr/"));
                        startActivity(viewIntent27);
                        break;

                    case 28:
                        Intent viewIntent28 = new Intent("android.intent.action.VIEW", Uri.parse("http://sarar.com/"));
                        startActivity(viewIntent28);
                        break;
                    case 29:
                        Intent viewIntent29 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.silkandcashmere.com/"));
                        startActivity(viewIntent29);
                        break;

                    case 30:
                        Intent viewIntent30 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.stradivarius.com/tr/"));
                        startActivity(viewIntent30);
                        break;

                    case 31:
                        Intent viewIntent31 = new Intent("android.intent.action.VIEW", Uri.parse("http://global.tommy.com/tr/tr/Collections/start"));
                        startActivity(viewIntent31);
                        break;

                    case 32:
                        Intent viewIntent32 = new Intent("android.intent.action.VIEW", Uri.parse("http://tr.uspoloassn.com/"));
                        startActivity(viewIntent32);
                        break;

                    case 33:
                        Intent viewIntent33 = new Intent("android.intent.action.VIEW", Uri.parse("https://shop.vakko.com/tr"));
                        startActivity(viewIntent33);
                        break;

                    case 34:
                        Intent viewIntent34 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.zara.com/"));
                        startActivity(viewIntent34);
                        break;
                }
            }
        });

        dref = FirebaseDatabase.getInstance().getReference("giyim");
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

     /*   benetton = (Button)findViewById(R.id.benetton);
        benetton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://tr.benetton.com/"));
                startActivity(viewIntent);
            }
        });

        bershka = (Button)findViewById(R.id.bershka);
        bershka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.bershka.com/tr/"));
                startActivity(viewIntent);
            }
        });

        beymen = (Button)findViewById(R.id.beymen);
        beymen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.beymen.com/"));
                startActivity(viewIntent);
            }
        });

        boyner = (Button)findViewById(R.id.boyner);
        boyner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.boyner.com.tr/"));
                startActivity(viewIntent);
            }
        });


        ca = (Button)findViewById(R.id.ca);
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.c-and-a.com/uk/en/corporate/company/"));
                startActivity(viewIntent);
            }
        });

        collezione = (Button)findViewById(R.id.collezione);
        collezione.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.collezione.com/"));
                startActivity(viewIntent);
            }
        });

        colins = (Button)findViewById(R.id.colins);
        colins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.colins.com.tr/"));
                startActivity(viewIntent);
            }
        });

        defacto = (Button)findViewById(R.id.defacto);
        defacto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.defacto.com.tr/"));
                startActivity(viewIntent);
            }
        });

        deriden = (Button)findViewById(R.id.deriden);
        deriden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.deriden.com.tr/"));
                startActivity(viewIntent);
            }
        });

        derimod = (Button)findViewById(R.id.derimod);
        derimod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.derimod.com.tr/"));
                startActivity(viewIntent);
            }
        });


        gap = (Button)findViewById(R.id.gap);
        gap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://gap.com.tr/"));
                startActivity(viewIntent);
            }
        });

        hm = (Button)findViewById(R.id.hm);
        hm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www2.hm.com/tr_tr/index.html"));
                startActivity(viewIntent);
            }
        });

        koton = (Button)findViewById(R.id.koton);
        koton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.koton.com/tr/"));
                startActivity(viewIntent);
            }
        });

        lacoste = (Button)findViewById(R.id.lacoste);
        lacoste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://shop.lacoste.com.tr/"));
                startActivity(viewIntent);
            }
        });

        lc = (Button)findViewById(R.id.lc);
        lc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.lcwaikiki.com/tr-TR/TR"));
                startActivity(viewIntent);
            }
        });


        levis = (Button)findViewById(R.id.levis);
        levis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.levi.com/TR/tr_TR/"));
                startActivity(viewIntent);
            }
        });

        leecooper = (Button)findViewById(R.id.leecooper);
        leecooper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.leecooper-turkey.com/"));
                startActivity(viewIntent);
            }
        });

        loft = (Button)findViewById(R.id.loft);
        loft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.loft.com.tr/"));
                startActivity(viewIntent);
            }
        });

        ltb = (Button)findViewById(R.id.ltb);
        ltb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.ltbjeans.com/"));
                startActivity(viewIntent);
            }
        });

        mango = (Button)findViewById(R.id.mango);
        mango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://shop.mango.com/TR"));
                startActivity(viewIntent);
            }
        });

        marks = (Button)findViewById(R.id.marks);
        marks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.marksandspencer.com/"));
                startActivity(viewIntent);
            }
        });

        massimo = (Button)findViewById(R.id.massimo);
        massimo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.massimodutti.com/tr/"));
                startActivity(viewIntent);
            }
        });


        mavi = (Button)findViewById(R.id.mavi);
        mavi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.mavi.com/"));
                startActivity(viewIntent);
            }
        });

        mustang = (Button)findViewById(R.id.mustang);
        mustang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.mustang-jeans.com.tr/"));
                startActivity(viewIntent);
            }
        });

        nautica = (Button)findViewById(R.id.nautica);
        nautica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.nautica-tr.com/"));
                startActivity(viewIntent);
            }
        });

        network = (Button)findViewById(R.id.network);
        network.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.network.com.tr/"));
                startActivity(viewIntent);
            }
        });

        pullandbear = (Button)findViewById(R.id.pullandbear);
        pullandbear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.pullandbear.com/tr/"));
                startActivity(viewIntent);
            }
        });

        sarar = (Button)findViewById(R.id.sarar);
        sarar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://sarar.com/"));
                startActivity(viewIntent);
            }
        });

        silkandcashmere = (Button)findViewById(R.id.silkandcasmere);
        silkandcashmere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.silkandcashmere.com/"));
                startActivity(viewIntent);
            }
        });

        stradivarius = (Button)findViewById(R.id.stradivarius);
        stradivarius.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.stradivarius.com/tr/"));
                startActivity(viewIntent);
            }
        });


        tommy = (Button)findViewById(R.id.tommy);
        tommy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://global.tommy.com/tr/tr/Collections/start"));
                startActivity(viewIntent);
            }
        });

        polo = (Button)findViewById(R.id.uspolo);
        polo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://tr.uspoloassn.com/"));
                startActivity(viewIntent);
            }
        });

        vakko = (Button)findViewById(R.id.vakko);
        vakko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://shop.vakko.com/tr"));
                startActivity(viewIntent);
            }
        });

        zara = (Button)findViewById(R.id.zara);
        zara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.zara.com/"));
                startActivity(viewIntent);
            }
        });

        pierre = (Button)findViewById(R.id.pierre);
        pierre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.ipekyol.com.tr/"));
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
                Intent intent = new Intent(ClothesActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
