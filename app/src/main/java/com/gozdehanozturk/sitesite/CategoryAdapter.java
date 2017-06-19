package com.gozdehanozturk.sitesite;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class CategoryAdapter extends BaseAdapter {
    Context mContext;
    List<Category> mCategories;

    private class Holder{
        ImageView categoryId;
        TextView categoryName;
    }

    public CategoryAdapter(Context context, List<Category> categories) {
        mContext = context;
        mCategories = categories;
    }

    @Override
    public int getCount() {
        return mCategories.size();
    }

    @Override
    public Object getItem(int i) {
        return mCategories.get(i);
    }

    @Override
    public long getItemId(int i) {
        return mCategories.indexOf(getItem(i));
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        Holder holder = null;

        LayoutInflater layoutInflater = (LayoutInflater)mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        view= layoutInflater.inflate(R.layout.category_list_item,null);

        holder = new Holder();
        holder.categoryId=(ImageView)view.findViewById(R.id.categoryId);
        holder.categoryName=(TextView)view.findViewById(R.id.category);

        Category category = (Category)getItem(i);

        holder.categoryId.setImageResource(category.getCategoryId());
        holder.categoryName.setText(category.getCategoryName());

        return view;
    }
}
