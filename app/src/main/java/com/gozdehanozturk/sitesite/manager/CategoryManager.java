package com.gozdehanozturk.sitesite.manager;

import android.util.Log;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.gozdehanozturk.sitesite.model.Category;
import com.gozdehanozturk.sitesite.model.ItemModel;
import com.gozdehanozturk.sitesite.model.Site;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gozde on 30.09.2017.
 */

public class CategoryManager {

    private ArrayList<Category> categories = new ArrayList<>();

    public CategoryManager(){

    }

    public void load(final LoadListener listener) {
        if (categories.size() > 0) {
            listener.onSuccess(categories);
            return;
        }

        FirebaseDatabase.getInstance().getReference("kategoriler").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot data : dataSnapshot.getChildren()) {
                    categories.add(data.getValue(Category.class));
                }
                listener.onSuccess(categories);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                listener.onError(databaseError.getMessage());
            }
        });
    }

    public Category findById(int id) {
        return findById(categories, id);
    }

    private Category findById(List<Category> categories, int id) {
        for (Category category : categories) {
            if (id == category.getId()) {
                return category;
            } else if (category.getCategories().size() > 0) {
                Category found = findById(category.getCategories(), id);
                if (null != found) {
                    return found;
                }
            }
        }

        return null;
    }

    public List<Site> getFlatSiteList() {
        return makeFlatSiteList(categories);
    }

    private List<Site> makeFlatSiteList(List<Category> categories) {
        List<Site> sites = new ArrayList<>();

        for (Category category : categories) {
            sites.addAll(category.getSites());
            if (category.getCategories().size() > 0) {
                sites.addAll(makeFlatSiteList(category.getCategories()));
            }
        }

        return sites;
    }

}
