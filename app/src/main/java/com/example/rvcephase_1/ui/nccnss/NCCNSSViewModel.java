package com.example.rvcephase_1.ui.nccnss;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NCCNSSViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public NCCNSSViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is NCC / NSS fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}