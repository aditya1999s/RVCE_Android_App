package com.example.rvcephase_1.ui.departments;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class DepartmentsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public DepartmentsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Departments fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}