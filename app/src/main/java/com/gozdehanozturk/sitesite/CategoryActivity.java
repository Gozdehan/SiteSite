package com.gozdehanozturk.sitesite;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.gozdehanozturk.sitesite.model.ItemModel;
import com.miguelcatalan.materialsearchview.MaterialSearchView;
import com.squareup.picasso.Picasso;
import com.wang.avi.AVLoadingIndicatorView;

import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import uk.co.deanwild.materialshowcaseview.MaterialShowcaseSequence;
import uk.co.deanwild.materialshowcaseview.ShowcaseConfig;

public class CategoryActivity extends AppCompatActivity {

    DatabaseReference dref;
    ListView mListView;
    List<ItemModel> itemList = new ArrayList<ItemModel>();

    private AVLoadingIndicatorView avi;


    BaseAdapter ba;
    LayoutInflater li;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);


        avi = (AVLoadingIndicatorView) findViewById(R.id.avi);
        avi.setIndicator("");

        li = LayoutInflater.from(this);

        mListView = (ListView) findViewById(R.id.categoryListView);

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
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {

                if (view == null) {
                    view = li.inflate(R.layout.category_list_item, null);
                }

                ImageView image = view.findViewById(R.id.categoryId);

                TextView text = view.findViewById(R.id.category);
                text.setText(itemList.get(i).getTitle());

                Picasso.with(CategoryActivity.this).load(itemList.get(i).getLogoUrl()).into(image);

                return view;

            }
        };


        mListView.setAdapter(ba);

        avi.setVisibility(View.VISIBLE);
        avi.show();
        dref = FirebaseDatabase.getInstance().getReference("kategori").child("kategori");
        dref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                avi.hide();
                for (DataSnapshot data : dataSnapshot.getChildren()) {
                    ItemModel item = data.getValue(ItemModel.class);
                    itemList.add(item);
                    ba.notifyDataSetChanged();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.d("LOGTEST", databaseError.getMessage());
            }
        });

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(CategoryActivity.this, MyActivity.class);
                switch (i) {
                    case 0:
                        intent.putExtra("tür", "culture");
                        break;
                    case 1:
                        intent.putExtra("tür", "book");
                        break;
                    case 2:
                        intent.putExtra("tür", "news");
                        break;
                    case 3:
                        intent.putExtra("tür", "travel");
                        break;
                    case 4:
                        intent.putExtra("tür", "fashion");
                        break;
                    case 5:
                        intent.putExtra("tür", "cosmetic");
                        break;
                    case 6:
                        intent.putExtra("tür", "sport");
                        break;
                    case 7:
                        intent.putExtra("tür", "food");
                        break;
                    case 8:
                        intent.putExtra("tür", "tech");
                        break;
                    case 9:
                        intent.putExtra("tür", "science");
                        break;
                    case 10:
                        intent.putExtra("tür", "movie");
                        break;
                    case 11:
                        intent.putExtra("tür", "music");
                        break;
                    case 12:
                        intent.putExtra("tür", "gift");
                        break;
                    case 13:
                        intent.putExtra("tür", "shop");
                        break;
                    case 14:
                        intent.putExtra("tür", "health");
                        break;
                    case 15:
                        intent.putExtra("tür", "homestyle");
                        break;
                    case 16:
                        intent.putExtra("tür", "car");
                        break;
                }
                startActivity(intent);
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
        switch (item.getItemId()) {

            case R.id.search:
                startActivity(new Intent(this, SearchActivity.class));
                break;

            case R.id.offer:
                startActivity(new Intent(this,OfferActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

