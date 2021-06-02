package com.example.rvcephase_1.ui.placement;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PlacementViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PlacementViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Placement fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}