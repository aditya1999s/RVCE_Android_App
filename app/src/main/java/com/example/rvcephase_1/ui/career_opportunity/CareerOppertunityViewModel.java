package com.example.rvcephase_1.ui.career_opportunity;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CareerOppertunityViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CareerOppertunityViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Career Oppertunity fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}