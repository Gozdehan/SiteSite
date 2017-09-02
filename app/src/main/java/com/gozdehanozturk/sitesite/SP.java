package com.gozdehanozturk.sitesite;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by Gozde on 28.08.2017.
 */

public class SP
{
    SharedPreferences sp;
    SharedPreferences.Editor edit;

    public SP(Context c)
    {
        sp = PreferenceManager.getDefaultSharedPreferences(c);
        edit = sp.edit();
    }

    public boolean isIndexCreated()
    {
        return sp.getBoolean("index_ok",false);
    }

    public void setIndexCreated()
    {
        edit.putBoolean("index_ok", true).commit();
    }

    public void setFavValues(String siteAdi)
    {
        edit.putBoolean(siteAdi, false).commit();
    }

    public boolean isFavSelected(String siteAdi)
    {
        return sp.getBoolean(siteAdi, false);
    }

    public void setFavValueOfSite(String siteAdi, boolean isFav)
    {
        edit.putBoolean(siteAdi, isFav).commit();
    }
}
