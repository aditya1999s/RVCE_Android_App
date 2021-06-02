package com.example.rvcephase_1.ui.infrastructure;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class InfrastructureViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public InfrastructureViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Infrastructure fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}