package com.example.rvcephase_1.ui.ug_pg_programs;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UGPGProgramsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public UGPGProgramsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is UG PG Programs fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}