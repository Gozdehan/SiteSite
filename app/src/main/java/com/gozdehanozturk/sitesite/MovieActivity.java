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

public class MovieActivity extends AppCompatActivity {

   DatabaseReference dref;
    ListView mListView;
    ArrayList<String> list = new ArrayList<>();
    ArrayAdapter<String> mAdapter;

    BaseAdapter ba;
    LayoutInflater li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Film & Dizi");

        mListView  = (ListView)findViewById(R.id.movielistview);
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


                Picasso.with(MovieActivity.this).load("http://icons.iconarchive.com/icons/designbolts/free-multimedia/1024/Clapper-icon.png").into(image);

                return view;
            }
        };

        mListView.setAdapter(ba);

        dref = FirebaseDatabase.getInstance().getReference("filmdizi");
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
                        Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.beyazperde.com/"));
                        startActivity(viewIntent);
                        break;
                    case 1:
                        Intent viewIntent1 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.netflix.com/"));
                        startActivity(viewIntent1);
                        break;
                    case 2:
                        Intent viewIntent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://puhutv.com/"));
                        startActivity(viewIntent2);
                        break;
                    case 3:
                        Intent viewIntent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.blutv.com.tr/"));
                        startActivity(viewIntent3);
                        break;

                    case 4:
                        Intent viewIntent4 = new Intent("android.intent.action.VIEW", Uri.parse("http://sezonlukdizi.net/"));
                        startActivity(viewIntent4);
                        break;
                    case 5:
                        Intent viewIntent5 = new Intent("android.intent.action.VIEW", Uri.parse("http://onlinedizi.com/"));
                        startActivity(viewIntent5);
                        break;
                    case 6:
                        Intent viewIntent6 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dizist1.com/"));
                        startActivity(viewIntent6);
                        break;
                    case 7:
                        Intent viewIntent7 = new Intent("android.intent.action.VIEW", Uri.parse("http://dizipub.com/"));
                        startActivity(viewIntent7);
                        break;

                    case 8:
                        Intent viewIntent8 = new Intent("android.intent.action.VIEW", Uri.parse("http://dizilab.net/"));
                        startActivity(viewIntent8);
                        break;
                    case 9:
                        Intent viewIntent9 = new Intent("android.intent.action.VIEW", Uri.parse("http://diziay.com/"));
                        startActivity(viewIntent9);
                        break;
                    case 10:
                        Intent viewIntent10 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hddizigo.com/"));
                        startActivity(viewIntent10);
                        break;
                    case 11:
                        Intent viewIntent11 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dizibox1.com/"));
                        startActivity(viewIntent11);
                        break;

                    case 12:
                        Intent viewIntent12 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dizihit.com/"));
                        startActivity(viewIntent12);
                        break;

                    case 13:
                        Intent viewIntent13 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hddizitvim.com/"));
                        startActivity(viewIntent13);
                        break;

                    case 14:
                        Intent viewIntent14 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.diziler.com/"));
                        startActivity(viewIntent14);
                        break;

                    case 15:
                        Intent viewIntent15 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.ddizi1.com/"));
                        startActivity(viewIntent15);
                        break;
                    case 16:
                        Intent viewIntent16 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.fullhdfilm.gen.tr/"));
                        startActivity(viewIntent16);
                        break;

                    case 17:
                        Intent viewIntent17 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hdfilmsitesi.com/"));
                        startActivity(viewIntent17);
                        break;

                    case 18:
                        Intent viewIntent18 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.fullhdfilmizlesene.org/"));
                        startActivity(viewIntent18);
                        break;

                    case 19:
                        Intent viewIntent19 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hizliizlefilm.net/"));
                        startActivity(viewIntent19);
                        break;

                    case 20:
                        Intent viewIntent20 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.filmgoo.com/"));
                        startActivity(viewIntent20);
                        break;
                    case 21:
                        Intent viewIntent21 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.filmifullizle.org/"));
                        startActivity(viewIntent21);
                        break;

                    case 22:
                        Intent viewIntent22 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.filmizlesene.com.tr/"));
                        startActivity(viewIntent22);
                        break;


                    case 23:
                        Intent viewIntent23 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.sinebol.org/"));
                        startActivity(viewIntent23);
                        break;
                }
            }
        });

     /*   netflix = (Button)findViewById(R.id.netflix);
        netflix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.spotify.com/tr/"));
                startActivity(viewIntent);
            }
        });

        sezonluk = (Button)findViewById(R.id.sezonluk);
        sezonluk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://fizy.com/#!/listelerim"));
                startActivity(viewIntent);
            }
        });

        online = (Button)findViewById(R.id.online);
        online.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.turktelekommuzik.com/"));
                startActivity(viewIntent);
            }
        });

        diziist = (Button)findViewById(R.id.diziist);
        diziist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.deezer.com/tr/"));
                startActivity(viewIntent);
            }
        });


        dizipub = (Button)findViewById(R.id.dizipub);
        dizipub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.classicalarchives.com/"));
                startActivity(viewIntent);
            }
        });

        dizilab = (Button)findViewById(R.id.dizilab);
        dizilab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/?hl=tr&gl=TR"));
                startActivity(viewIntent);
            }
        });

        dizihdtv = (Button)findViewById(R.id.hdtv);
        dizihdtv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.spotify.com/tr/"));
                startActivity(viewIntent);
            }
        });

        puhu = (Button)findViewById(R.id.puhu);
        puhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://fizy.com/#!/listelerim"));
                startActivity(viewIntent);
            }
        });

        blu = (Button)findViewById(R.id.blu);
        blu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.turktelekommuzik.com/"));
                startActivity(viewIntent);
            }
        });

        fullhdfilm = (Button)findViewById(R.id.fullhd);
        fullhdfilm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.deezer.com/tr/"));
                startActivity(viewIntent);
            }
        });


        sinebol = (Button)findViewById(R.id.sinebol);
        sinebol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.classicalarchives.com/"));
                startActivity(viewIntent);
            }
        });

        diziay = (Button)findViewById(R.id.diziay);
        diziay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://diziay.com/"));
                startActivity(viewIntent);
            }
        });

        dizigo = (Button)findViewById(R.id.dizigo);
        dizigo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.hddizigo.com/"));
                startActivity(viewIntent);
            }
        });

        dizimag = (Button)findViewById(R.id.dizimag);
        dizimag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://dizimag2.co/"));
                startActivity(viewIntent);
            }
        });


        dizibox = (Button)findViewById(R.id.dizibox);
        dizibox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dizibox1.com/"));
                startActivity(viewIntent);
            }
        });

        hızlıizle = (Button)findViewById(R.id.hizliizlefilm);
        hızlıizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hizliizlefilm.net/"));
                startActivity(viewIntent);
            }
        });

        filmgoo = (Button)findViewById(R.id.filmgoo);
        filmgoo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.filmgoo.com/"));
                startActivity(viewIntent);
            }
        });

        dizihit = (Button)findViewById(R.id.dizihit);
        dizihit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.dizihit.com/"));
                startActivity(viewIntent);
            }
        });

        diziler = (Button)findViewById(R.id.diziler);
        diziler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.diziler.com/"));
                startActivity(viewIntent);
            }
        });

        ddizi = (Button)findViewById(R.id.ddizi);
        ddizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.ddizi1.com/"));
                startActivity(viewIntent);
            }
        });


        fullhdfilmizle = (Button)findViewById(R.id.fullhdfilmizlesene);
        fullhdfilmizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.fullhdfilmizlesene.org/"));
                startActivity(viewIntent);
            }
        });

        filmifullizle = (Button)findViewById(R.id.filmifullizle);
        filmifullizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.filmifullizle.org/"));
                startActivity(viewIntent);
            }
        });

        filmizlesene = (Button)findViewById(R.id.filmizlesene);
        filmizlesene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.filmizlesene.com.tr/"));
                startActivity(viewIntent);
            }
        });


        hdfilmsitesi = (Button)findViewById(R.id.hdfilmsitesi);
        hdfilmsitesi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.hdfilmsitesi.com/"));
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
                Intent intent = new Intent(MovieActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
