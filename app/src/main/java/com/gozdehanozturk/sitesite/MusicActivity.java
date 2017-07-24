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

public class MusicActivity extends AppCompatActivity {

   // Button spotify, fizy, türktelekom, deezer, classical,youtube, tunein,justhearit, dashradio, tracks8, lastfm, soundcloud, hypem, gaana, bandcamp, müzikdinletv, slacker, myspace, müsicovery, jango, müsixhub, difm, radiotuna, live365, jazzradio;
   DatabaseReference dref;
    ListView mListView;
    ArrayList<String> list = new ArrayList<>();
    ArrayAdapter<String> mAdapter;

    BaseAdapter ba;
    LayoutInflater li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Müzik");

        mListView  = (ListView)findViewById(R.id.musiclistview);
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


                Picasso.with(MusicActivity.this).load("http://icons.iconarchive.com/icons/dtafalonso/yosemite-flat/512/Music-icon.png").into(image);

                return view;
            }
        };

        mListView.setAdapter(ba);

        dref = FirebaseDatabase.getInstance().getReference("müzik");
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
                        Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.spotify.com/tr/"));
                        startActivity(viewIntent);
                        break;
                    case 1:
                        Intent viewIntent1 = new Intent("android.intent.action.VIEW", Uri.parse("http://fizy.com/#!/listelerim"));
                        startActivity(viewIntent1);
                        break;
                    case 2:
                        Intent viewIntent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.turktelekommuzik.com/"));
                        startActivity(viewIntent2);
                        break;
                    case 3:
                        Intent viewIntent3 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/?hl=tr&gl=TR"));
                        startActivity(viewIntent3);
                        break;

                    case 4:
                        Intent viewIntent4 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.deezer.com/tr/"));
                        startActivity(viewIntent4);
                        break;
                    case 5:
                        Intent viewIntent5 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.classicalarchives.com/"));
                        startActivity(viewIntent5);
                        break;
                    case 6:
                        Intent viewIntent6 = new Intent("android.intent.action.VIEW", Uri.parse("https://beta.tunein.com/"));
                        startActivity(viewIntent6);
                        break;
                    case 7:
                        Intent viewIntent7 = new Intent("android.intent.action.VIEW", Uri.parse("https://dashradio.com/"));
                        startActivity(viewIntent7);
                        break;

                    case 8:
                        Intent viewIntent8 = new Intent("android.intent.action.VIEW", Uri.parse("https://8tracks.com/"));
                        startActivity(viewIntent8);
                        break;
                    case 9:
                        Intent viewIntent9 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.last.fm/"));
                        startActivity(viewIntent9);
                        break;
                    case 10:
                        Intent viewIntent10 = new Intent("android.intent.action.VIEW", Uri.parse("https://soundcloud.com/"));
                        startActivity(viewIntent10);
                        break;
                    case 11:
                        Intent viewIntent11 = new Intent("android.intent.action.VIEW", Uri.parse("http://hypem.com/"));
                        startActivity(viewIntent11);
                        break;

                    case 12:
                        Intent viewIntent12 = new Intent("android.intent.action.VIEW", Uri.parse("http://gaana.com/"));
                        startActivity(viewIntent12);
                        break;

                    case 13:
                        Intent viewIntent13 = new Intent("android.intent.action.VIEW", Uri.parse("https://bandcamp.com/"));
                        startActivity(viewIntent13);
                        break;

                    case 14:
                        Intent viewIntent14 = new Intent("android.intent.action.VIEW", Uri.parse("http://muzikdinle.tv.tr/"));
                        startActivity(viewIntent14);
                        break;

                    case 15:
                        Intent viewIntent15 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.slacker.com/"));
                        startActivity(viewIntent15);
                        break;
                    case 16:
                        Intent viewIntent16 = new Intent("android.intent.action.VIEW", Uri.parse("https://myspace.com/"));
                        startActivity(viewIntent16);
                        break;

                    case 17:
                        Intent viewIntent17 = new Intent("android.intent.action.VIEW", Uri.parse("http://b2b.musicovery.com/"));
                        startActivity(viewIntent17);
                        break;

                    case 18:
                        Intent viewIntent18 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.jango.com/"));
                        startActivity(viewIntent18);
                        break;

                    case 19:
                        Intent viewIntent19 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.di.fm/"));
                        startActivity(viewIntent19);
                        break;

                    case 20:
                        Intent viewIntent20 = new Intent("android.intent.action.VIEW", Uri.parse("http://radiotuna.com/"));
                        startActivity(viewIntent20);
                        break;
                    case 21:
                        Intent viewIntent21 = new Intent("android.intent.action.VIEW", Uri.parse("https://live365.com/"));
                        startActivity(viewIntent21);
                        break;

                    case 22:
                        Intent viewIntent22 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.jazzradio.com/"));
                        startActivity(viewIntent22);
                        break;


                    case 23:
                        Intent viewIntent23 = new Intent("android.intent.action.VIEW", Uri.parse("https://justhearit.com/"));
                        startActivity(viewIntent23);
                        break;
                    case 24:
                        Intent viewIntent24 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.musixhub.com/"));
                        startActivity(viewIntent24);
                        break;
                }
            }
        });


      /*  spotify = (Button)findViewById(R.id.spotify);
        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.spotify.com/tr/"));
                startActivity(viewIntent);
            }
        });

        fizy = (Button)findViewById(R.id.fizy);
        fizy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://fizy.com/#!/listelerim"));
                startActivity(viewIntent);
            }
        });

        türktelekom = (Button)findViewById(R.id.ttm);
        türktelekom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.turktelekommuzik.com/"));
                startActivity(viewIntent);
            }
        });

        deezer = (Button)findViewById(R.id.deezer);
        deezer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.deezer.com/tr/"));
                startActivity(viewIntent);
            }
        });


        classical = (Button)findViewById(R.id.ca);
        classical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.classicalarchives.com/"));
                startActivity(viewIntent);
            }
        });

        youtube = (Button)findViewById(R.id.youtube);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.youtube.com/?hl=tr&gl=TR"));
                startActivity(viewIntent);
            }
        });

        tunein = (Button)findViewById(R.id.tunein);
        tunein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://beta.tunein.com/"));
                startActivity(viewIntent);
            }
        });

        dashradio = (Button)findViewById(R.id.dashradio);
        dashradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://dashradio.com/"));
                startActivity(viewIntent);
            }
        });

        tracks8 = (Button)findViewById(R.id.tracks8);
        tracks8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://8tracks.com/"));
                startActivity(viewIntent);
            }
        });

        lastfm = (Button)findViewById(R.id.lastfm);
        lastfm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.last.fm/"));
                startActivity(viewIntent);
            }
        });


        soundcloud = (Button)findViewById(R.id.sc);
        soundcloud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://soundcloud.com/"));
                startActivity(viewIntent);
            }
        });

        hypem = (Button)findViewById(R.id.hypem);
        hypem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://hypem.com/"));
                startActivity(viewIntent);
            }
        });

        gaana = (Button)findViewById(R.id.gaana);
        gaana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://gaana.com/"));
                startActivity(viewIntent);
            }
        });

        bandcamp = (Button)findViewById(R.id.bandcamp);
        bandcamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://bandcamp.com/"));
                startActivity(viewIntent);
            }
        });

        müzikdinletv = (Button)findViewById(R.id.müzikdinletv);
        müzikdinletv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://muzikdinle.tv.tr/"));
                startActivity(viewIntent);
            }
        });

        slacker = (Button)findViewById(R.id.slacker);
        slacker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.slacker.com/"));
                startActivity(viewIntent);
            }
        });


        myspace = (Button)findViewById(R.id.myspace);
        myspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://myspace.com/"));
                startActivity(viewIntent);
            }
        });

        müsicovery = (Button)findViewById(R.id.musicovery);
        müsicovery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://b2b.musicovery.com/"));
                startActivity(viewIntent);
            }
        });

        jango = (Button)findViewById(R.id.jango);
        jango.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.jango.com/"));
                startActivity(viewIntent);
            }
        });

        müsixhub = (Button)findViewById(R.id.musixhub);
        müsixhub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.musixhub.com/"));
                startActivity(viewIntent);
            }
        });

        difm = (Button)findViewById(R.id.difm);
        difm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.di.fm/"));
                startActivity(viewIntent);
            }
        });

        radiotuna = (Button)findViewById(R.id.radiotuna);
        radiotuna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("http://radiotuna.com/"));
                startActivity(viewIntent);
            }
        });

        live365 = (Button)findViewById(R.id.live365);
        live365.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://live365.com/"));
                startActivity(viewIntent);
            }
        });

        jazzradio = (Button)findViewById(R.id.jazzradio);
        jazzradio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://www.jazzradio.com/"));
                startActivity(viewIntent);
            }
        });

        justhearit = (Button)findViewById(R.id.justhearit);
        justhearit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent("android.intent.action.VIEW", Uri.parse("https://justhearit.com/"));
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
                Intent intent = new Intent(MusicActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
