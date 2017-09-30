package com.gozdehanozturk.sitesite.manager;

import com.gozdehanozturk.sitesite.model.Category;

import java.util.List;

/**
 * Created by Gozde on 30.09.2017.
 */

public interface LoadListener {

    void onSuccess(List<Category> categories);
    void onError(String error);

}
