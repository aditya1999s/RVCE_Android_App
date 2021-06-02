package com.example.rvcephase_1.ui.achievements;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AchievementsViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AchievementsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Achievements fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}