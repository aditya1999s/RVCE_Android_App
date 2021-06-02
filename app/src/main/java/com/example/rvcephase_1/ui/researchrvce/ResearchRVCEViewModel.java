package com.example.rvcephase_1.ui.researchrvce;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ResearchRVCEViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ResearchRVCEViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Research @ RVCE fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}