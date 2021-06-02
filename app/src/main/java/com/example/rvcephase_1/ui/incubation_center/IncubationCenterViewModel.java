package com.example.rvcephase_1.ui.incubation_center;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class IncubationCenterViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public IncubationCenterViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Incubation Center fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}