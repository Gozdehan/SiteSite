package com.gozdehanozturk.sitesite;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.ToggleButton;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.gozdehanozturk.sitesite.model.FavoriteModel;
import com.gozdehanozturk.sitesite.model.ItemModel;

import java.util.ArrayList;
import java.util.List;

public class FavoriteActivity extends AppCompatActivity {

    DatabaseReference dref;
   // ListView mFavoriteListView;
    List<ItemModel> itemList = new ArrayList<ItemModel>();

    BaseAdapter ba;
    LayoutInflater li;

   /* SharedPreferences sharedPreferences;
    SP sp;

    List<FavoriteModel> favList;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

        li = LayoutInflater.from(this);
        //  mFavoriteListView = (ListView)findViewById(R.id.favoritelist);

        //  sp = new SP(this);

        ba = new BaseAdapter() {
            @Override
            public int getCount() {
                return 0;
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
                return null;
            }
        };

        //  mFavoriteListView.setAdapter(ba);

        dref = FirebaseDatabase.getInstance().getReference("kategori");

        dref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
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

     /*   sharedPreferences = getSharedPreferences("favorites", Context.MODE_PRIVATE);
        String favItems = sharedPreferences.getString("favitems","");
        Log.d("LOGTEST", favItems);

        favList = new ArrayList<>();

        String[] items = favItems.split(",");
        for(String item:items){
            String parts[] = item.split("-");
            String category = parts[0];
            String itemKey = parts[1];
            FavoriteModel favoriteModel = new FavoriteModel();
            favoriteModel.setCategory(category);
            favoriteModel.setItemKey(itemKey);
            favList.add(favoriteModel);
        }

        for(FavoriteModel favoriteModel:favList){
            Log.d("LOGTEST", favoriteModel.getCategory() + " kategorisindeki " + favoriteModel.getItemKey() + "favorilenmiş");

        }

        // TODO: Favori listesine, kategori ve key'leri doldurduk.
        // TODO: Bu bilgilerle, firebase'deki tüm kategorilerdeki kayıtları getirip bir listeye doldurup,
        // TODOO: listedeki eşleşen kategori ve onun altındaki item key'

        ItemModel itemModel = new ItemModel();
        ItemModel itemModel2 = new ItemModel();
        ItemModel itemModel3 = new ItemModel();
        ItemModel itemModel4 = new ItemModel();

        itemModel.setKeys("haberler","value0");
        itemModel2.setKeys("haberler", "value1");
        itemModel3.setKeys("haberler", "value2");
        itemModel4.setKeys("kultursanat", "value3");
        List<ItemModel> list = new ArrayList<>();

        list.add(itemModel);
        list.add(itemModel2);
        list.add(itemModel3);
        list.add(itemModel4);


        String newSharedData = Utils.getNewSharedData(list, 2);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("favitems",newSharedData);
        editor.commit();  */
    }
}
