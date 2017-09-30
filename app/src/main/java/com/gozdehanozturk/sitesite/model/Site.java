package com.gozdehanozturk.sitesite.model;

import com.google.firebase.database.PropertyName;

/**
 * Created by Gozde on 30.09.2017.
 */

public class Site {

    @PropertyName("name")
    public String name;
    @PropertyName("logo_url")
    public String logoUrl;
    @PropertyName("url")
    public String url;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
