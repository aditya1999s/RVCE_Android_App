package com.example.rvcephase_1.ui.industryii;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class IndustryIIFragment extends Fragment {

    private Object industryII;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        industryII =
                new ViewModelProvider(this).get(IndustryII.class);
        View root = inflater.inflate(R.layout.fragment_menu_industry_institute_interaction, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewindustryinstituteinteraction);
        mywebview.loadUrl("https://www.rvce.edu.in/rvce-industry-institute-interaction-cell");
        return root;
    }
}