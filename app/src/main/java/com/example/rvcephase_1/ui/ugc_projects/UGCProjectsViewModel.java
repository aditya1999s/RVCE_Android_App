package com.example.rvcephase_1.ui.ugc_projects;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UGCProjectsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public UGCProjectsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is UGC Projects fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}