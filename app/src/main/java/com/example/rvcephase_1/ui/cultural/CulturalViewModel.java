package com.example.rvcephase_1.ui.cultural;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CulturalViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CulturalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Cultural fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}