package com.example.rvcephase_1.ui.principal;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PrincipalViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PrincipalViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Principal fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}