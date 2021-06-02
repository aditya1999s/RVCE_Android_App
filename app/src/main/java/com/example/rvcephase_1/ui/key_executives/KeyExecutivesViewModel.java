package com.example.rvcephase_1.ui.key_executives;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class KeyExecutivesViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public KeyExecutivesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Key Executives fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}