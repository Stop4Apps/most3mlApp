package com.mbn.olx.helper;

import com.mbn.olx.modelsList.PackagesModel;

public interface OnItemClickListenerPackages {
    void onItemClick(PackagesModel item);

    void onItemTouch();

    void onItemSelected(PackagesModel packagesModel, int spinnerPosition);
}
