package com.gozdehanozturk.sitesite;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {
    List<Category> mCategoryList;
    ListView mListView;

    public static final Integer [] categoryPic = {R.drawable.palette,R.drawable.dvr,R.drawable.beach,R.drawable.star, R.drawable.watch, R.drawable.bubble_chart,R.drawable.ic_fitness,R.drawable.restaurant,R.drawable.devices,R.drawable.movie_creation,R.drawable.music_note,R.drawable.giftcard,R.drawable.shopping_cart,R.drawable.healing,R.drawable.home};
    public static final String [] categoryName = {"KÜLTÜR & SANAT", "HABERLER", "SEYAHAT & TATİL","MODA", "SAAT & MÜCEVHER","KOZMETİK", "SPOR", "YEMEK","TEKNOLOJİ","FİLM & DİZİ","MÜZİK","HEDİYE","E-ALIŞVERİŞ","SAĞLIK","EV TEKSTİLİ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        mListView = (ListView)findViewById(R.id.categoryListView);
        mCategoryList = new ArrayList<Category>();

        for (int i = 0; i<categoryName.length;i++){
            Category category = new Category(categoryPic[i],categoryName[i]);
            mCategoryList.add(category);
        }

        CategoryAdapter categoryAdapter = new CategoryAdapter(this,mCategoryList);
        mListView.setAdapter(categoryAdapter);

        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        Intent intent = new Intent(CategoryActivity.this,CultureArtActivity.class);
                        startActivity(intent);
                       //Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Intent intent1 = new Intent(CategoryActivity.this,NewsActivity.class);
                        startActivity(intent1);
                        //Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Intent intent2 = new Intent(CategoryActivity.this,TravelActivity.class);
                        startActivity(intent2);
                        //Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Intent intent3 = new Intent(CategoryActivity.this,FashionActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(CategoryActivity.this,MAKActivity.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5 = new Intent(CategoryActivity.this,CosmeticActivity.class);
                        startActivity(intent5);
                        // Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Intent intent6 = new Intent(CategoryActivity.this,SportActivity.class);
                        startActivity(intent6);
                       // Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Intent intent7 = new Intent(CategoryActivity.this,FoodActivity.class);
                        startActivity(intent7);
                        //Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Intent intent8 = new Intent(CategoryActivity.this,TechActivity.class);
                        startActivity(intent8);
                        //Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Intent intent9 = new Intent(CategoryActivity.this,MovieActivity.class);
                        startActivity(intent9);
                        //Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 10:
                        Intent intent10 = new Intent(CategoryActivity.this,MusicActivity.class);
                        startActivity(intent10);
                        //Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 11:
                        Intent intent11 = new Intent(CategoryActivity.this,GiftActivity.class);
                        startActivity(intent11);
                        //Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 12:
                        Intent intent12 = new Intent(CategoryActivity.this,ShopActivity.class);
                        startActivity(intent12);
                        //Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 13:
                        Intent intent13 = new Intent(CategoryActivity.this,HealthActivity.class);
                        startActivity(intent13);
                        //Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 14:
                        Intent intent14 = new Intent(CategoryActivity.this,HomeStyleActivity.class);
                        startActivity(intent14);
                        // Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
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
