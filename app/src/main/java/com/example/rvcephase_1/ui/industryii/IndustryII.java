package com.example.rvcephase_1.ui.industryii;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IndustryII extends ViewModel {

    private MutableLiveData<String> mText;

    public IndustryII() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Industry Institute Interaction fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}