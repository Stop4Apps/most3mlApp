package com.mbn.olx.helper;

import android.view.View;

import com.mbn.olx.modelsList.myAdsModel;

public interface MyAdsOnclicklinstener {

    void onItemClick(myAdsModel item);

    void delViewOnClick(View v, int position);

    void editViewOnClick(View v, int position);

}
