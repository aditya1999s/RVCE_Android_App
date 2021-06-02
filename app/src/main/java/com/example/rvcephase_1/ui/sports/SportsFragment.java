package com.example.rvcephase_1.ui.sports;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class SportsFragment extends Fragment {

    private SportsViewModel sportsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        sportsViewModel =
                new ViewModelProvider(this).get(SportsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_sports, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewinsports);
        mywebview.loadUrl("https://www.rvce.edu.in/sp-achievements");
        return root;
    }
}