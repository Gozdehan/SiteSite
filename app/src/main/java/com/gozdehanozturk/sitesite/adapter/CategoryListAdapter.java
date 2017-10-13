package com.gozdehanozturk.sitesite.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.gozdehanozturk.sitesite.R;
import com.gozdehanozturk.sitesite.model.Category;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gozde on 30.09.2017.
 */

public class CategoryListAdapter extends BaseAdapter {

    private List<Category> categories = new ArrayList<>();

    public CategoryListAdapter(List<Category> categories) {
        this.categories = categories;
    }

    @Override
    public int getCount() {
        return categories.size();
    }

    @Override
    public Object getItem(int i) {
        return categories.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = null == view ? newView(viewGroup.getContext()) : view;

        Category category = categories.get(i);
        ImageView image = view.findViewById(R.id.categoryId);
        TextView text = view.findViewById(R.id.category);

        text.setText(category.getName());
        Picasso.with(view.getContext()).load(category.getLogoUrl()).placeholder(R.drawable.sg).into(image);

        return view;
    }

    private View newView(Context context) {
        LayoutInflater li = LayoutInflater.from(context);
        return li.inflate(R.layout.category_list_item, null);
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Category> getCategories() {
        return categories;
    }
}
