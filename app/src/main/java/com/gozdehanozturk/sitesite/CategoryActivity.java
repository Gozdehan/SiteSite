package com.gozdehanozturk.sitesite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CategoryActivity extends AppCompatActivity {
    List<Category> mCategoryList;
    ListView mListView;

    public static final Integer [] categoryPic = {R.drawable.palette,R.drawable.dvr,R.drawable.beach,R.drawable.ic_fitness,R.drawable.eat,R.drawable.devices,R.drawable.movie_creation,R.drawable.music_note,R.drawable.giftcard,R.drawable.shopping_cart,R.drawable.healing};
    public static final String [] categoryName = {"KULTUR/SANAT", "HABERLER", "SEYAHAT/TATIL", "SPOR", "YEMEK","TEKNOLOJI","FILM/DIZI","MUZIK","HEDIYE","E-ALISVERIS","SAGLIK"};

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
                        Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;
                    case 10:
                        Toast.makeText(CategoryActivity.this, i+" tıklandı", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });

    }
}
