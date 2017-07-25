package com.gozdehanozturk.sitesite;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.gozdehanozturk.sitesite.model.ItemModel;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {

    DatabaseReference dref;
    ListView mListView;
    List<ItemModel> itemList = new ArrayList<ItemModel>();


    BaseAdapter ba;
    LayoutInflater li;

    /*List<Category> mCategoryList;
    ListView mListView;

    public static final Integer [] categoryPic = {R.drawable.palette, R.drawable.books, R.drawable.dvr,R.drawable.beach,R.drawable.star, R.drawable.bubble_chart,R.drawable.ic_fitness,R.drawable.restaurant,R.drawable.devices, R.drawable.wb, R.drawable.movie_creation,R.drawable.music_note,R.drawable.giftcard,R.drawable.shopping_cart,R.drawable.healing,R.drawable.home, R.drawable.car};
    public static final String [] categoryName = {"KÜLTÜR & SANAT", "KİTAP & DERGİ", "HABERLER", "SEYAHAT & TATİL","MODA","KOZMETİK", "SPOR", "YEMEK","TEKNOLOJİ", "BİLİM", "FİLM & DİZİ","MÜZİK","HEDİYE","E-ALIŞVERİŞ","SAĞLIK","EV TEKSTİLİ", "OTOMOBİL"};  */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        li = LayoutInflater.from(this);

        mListView  = (ListView)findViewById(R.id.categoryListView);


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

                if(view==null) {
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


        dref = FirebaseDatabase.getInstance().getReference("kategori");
        dref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for(DataSnapshot data:dataSnapshot.getChildren()){
                    ItemModel item = data.getValue(ItemModel.class);
                    itemList.add(item);
                    ba.notifyDataSetChanged();
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Log.d("LOGTEST",databaseError.getMessage());
            }
        });

     /*   mListView = (ListView)findViewById(R.id.categoryListView);
        mCategoryList = new ArrayList<Category>();

        for (int i = 0; i<categoryName.length;i++){
            Category category = new Category(categoryPic[i],categoryName[i]);
            mCategoryList.add(category);
        }

        CategoryAdapter categoryAdapter = new CategoryAdapter(this,mCategoryList);
        mListView.setAdapter(categoryAdapter);  */

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent = new Intent(CategoryActivity.this,CultureArtActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(CategoryActivity.this,BookActivity.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(CategoryActivity.this,NewsActivity.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(CategoryActivity.this,TravelActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(CategoryActivity.this,FashionActivity.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5 = new Intent(CategoryActivity.this,CosmeticActivity.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(CategoryActivity.this,SportActivity.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(CategoryActivity.this,FoodActivity.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(CategoryActivity.this,TechActivity.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(CategoryActivity.this,ScienceActivity.class);
                        startActivity(intent9);
                        break;

                    case 10:
                        Intent intent10 = new Intent(CategoryActivity.this,MovieActivity.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(CategoryActivity.this,MusicActivity.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(CategoryActivity.this,GiftActivity.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(CategoryActivity.this,ShopActivity.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(CategoryActivity.this,HealthActivity.class);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(CategoryActivity.this,HomeStyleActivity.class);
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(CategoryActivity.this,CarActivity.class);
                        startActivity(intent16);
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

}
