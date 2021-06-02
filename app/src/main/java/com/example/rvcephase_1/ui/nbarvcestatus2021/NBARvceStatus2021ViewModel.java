package com.example.rvcephase_1.ui.nbarvcestatus2021;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NBARvceStatus2021ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NBARvceStatus2021ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is NBA RVCE Status 2021 fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}