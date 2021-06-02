package com.example.rvcephase_1.ui.mediasays;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MediaSaysViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public MediaSaysViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Media Says fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}