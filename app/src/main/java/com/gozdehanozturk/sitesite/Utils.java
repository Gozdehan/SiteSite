package com.gozdehanozturk.sitesite;

import com.gozdehanozturk.sitesite.model.ItemModel;

import java.util.List;

public class Utils {
    public static String getNewSharedData(List<ItemModel> list, int removeIndex){
        list.remove(removeIndex);
        String s = "";
        int count = 0;
        for(ItemModel item:list){
            if(count == 0){
                s = item.getSharedKey();
            }else{
                s = s + "," + item.getSharedKey();
            }
            count++;
        }
        return s;
    }

    public static String getSharedData(List<ItemModel> list){
        String s = "";
        int count = 0;
        for(ItemModel item:list){
            if(count == 0){
                s = item.getSharedKey();
            }else{
                s = s + "," + item.getSharedKey();
            }
            count++;
        }
        return s;
    }
}
