package com.example.rvcephase_1.ui.center_of_excellence;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CenterOfExcellenceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CenterOfExcellenceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Center Of Excellence fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}