package com.example.rvcephase_1.ui.studentclubs;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class StudentClubViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public StudentClubViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Student fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}