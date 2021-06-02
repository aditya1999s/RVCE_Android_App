package com.example.rvcephase_1.ui.achievements;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class AchievementsFragment extends Fragment {

    private AchievementsViewModel achievementsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        achievementsViewModel =
                new ViewModelProvider(this).get(AchievementsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_achievements, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewachievements);
        mywebview.loadUrl("https://rvce.edu.in/achievements");
        return root;
    }
}