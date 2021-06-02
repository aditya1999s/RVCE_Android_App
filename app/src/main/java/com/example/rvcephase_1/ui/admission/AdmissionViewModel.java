package com.example.rvcephase_1.ui.admission;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AdmissionViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AdmissionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Admission fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}