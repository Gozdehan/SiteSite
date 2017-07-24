package com.gozdehanozturk.sitesite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class FashionActivity extends AppCompatActivity {

    DatabaseReference dref;
    ListView mListView;
    ArrayList<String> list = new ArrayList<>();
    ArrayAdapter<String> mAdapter;

   // Button shoesBag, clothes, manFashion, womanFashion, underWear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion);

        ActionBar ab = getSupportActionBar();
        ab.setTitle("Moda");

        mListView  = (ListView)findViewById(R.id.fashionlistview);
        mAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,list);
        mListView.setAdapter(mAdapter);

        dref = FirebaseDatabase.getInstance().getReference("moda");
        dref.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                String value = dataSnapshot.getValue(String.class);
                list.add(value);
                mAdapter.notifyDataSetChanged();
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
                        Intent intent = new Intent(FashionActivity.this,ShoesBagActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(FashionActivity.this,ClothesActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(FashionActivity.this,WomanFashionActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(FashionActivity.this,ManFashionActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(FashionActivity.this,SportFashionActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(FashionActivity.this,UnderWearActivity.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(FashionActivity.this,MAKActivity.class);
                        startActivity(intent6);
                        break;
                }
            }
        });
    }


       /* shoesBag = (Button)findViewById(R.id.ayakkabicanta);
        shoesBag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent(FashionActivity.this,ShoesBagActivity.class);
                startActivity(viewIntent);
            }
        });

        manFashion = (Button)findViewById(R.id.erkekgiyim);
        manFashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent(FashionActivity.this,ManFashionActivity.class);
                startActivity(viewIntent);
            }
        });

        clothes = (Button)findViewById(R.id.giyim);
        clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent(FashionActivity.this,ClothesActivity.class);
                startActivity(viewIntent);
            }
        });

        womanFashion = (Button)findViewById(R.id.kadingiyim);
        womanFashion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent(FashionActivity.this,WomanFashionActivity.class);
                startActivity(viewIntent);
            }
        });

        underWear = (Button)findViewById(R.id.icgiyim);
        underWear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent viewIntent = new Intent(FashionActivity.this,UnderWearActivity.class);
                startActivity(viewIntent);
            }
        });
         }
         */

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
                Intent intent = new Intent(FashionActivity.this,CategoryActivity.class);
                startActivity(intent);

            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
