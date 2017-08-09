package com.gozdehanozturk.sitesite.model;

import com.google.firebase.database.PropertyName;

/**
 * Created by DELL on 22.07.2017.
 */
public class ItemModel {

    @PropertyName("title")
    public String title;

    @PropertyName("site_url")
    public String siteUrl;

    @PropertyName("logo_url")
    public String logoUrl;

    public ItemModel() {

    }

    public ItemModel(String title, String logo_url, String site_url) {
        this.title=title;
        this.logoUrl=logo_url;
        this.siteUrl=site_url;
    }

    @Override
    public String toString() {
        return title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSiteUrl() {
        return siteUrl;
    }

    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }
}