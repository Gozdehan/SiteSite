package com.gozdehanozturk.sitesite;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.gozdehanozturk.sitesite.manager.FavoriteManager;
import com.gozdehanozturk.sitesite.model.Site;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import static com.gozdehanozturk.sitesite.R.id.tb;

/**
 * Created by Gozde on 30.09.2017.
 */

public class SiteListAdapter extends BaseAdapter {

    private List<Site> sites = new ArrayList<>();
    private FavoriteManager favoriteManager;

    public SiteListAdapter(List<Site> sites, FavoriteManager favoriteManager){
        this.sites=sites;
        this.favoriteManager=favoriteManager;
    }

    @Override
    public int getCount() {
        return sites.size();
    }

    @Override
    public Object getItem(int i) {
        return sites.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = null == view ? newView(viewGroup.getContext()) : view;

        final Site site = sites.get(i);
        ToggleButton tb = (ToggleButton)view.findViewById(R.id.tb);
        ImageView image = view.findViewById(R.id.item_logo);
        TextView text = view.findViewById(R.id.item_name);

        tb.setChecked(favoriteManager.isFavorite(site.getUrl()));
        tb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (((ToggleButton) view).isChecked()) {
                    favoriteManager.add(site.getUrl());
                } else {
                    favoriteManager.remove(site.getUrl());
                }
            }
        });
        text.setText(site.getName());
        Picasso.with(view.getContext()).load(site.getLogoUrl()).into(image);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), WebViewActivity.class);
                intent.putExtra("url", site.getUrl());
                intent.putExtra("title", site.getName());
                view.getContext().startActivity(intent);
            }
        });

        return view;
    }

    private View newView(Context context) {
        LayoutInflater li = LayoutInflater.from(context);
        return li.inflate(R.layout.list_item, null);
    }

    public void setSites(List<Site> sites) {
        this.sites = sites;
    }
}
