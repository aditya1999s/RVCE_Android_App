package com.example.rvcephase_1.ui.sports;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SportsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SportsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Sports fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}