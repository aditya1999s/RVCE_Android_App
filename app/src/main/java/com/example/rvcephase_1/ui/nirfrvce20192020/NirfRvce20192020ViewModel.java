package com.example.rvcephase_1.ui.nirfrvce20192020;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NirfRvce20192020ViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NirfRvce20192020ViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is NIRF RVCE 2019-2020 fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}