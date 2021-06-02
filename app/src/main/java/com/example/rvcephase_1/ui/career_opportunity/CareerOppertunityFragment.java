package com.example.rvcephase_1.ui.career_opportunity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class CareerOppertunityFragment extends Fragment {

    private CareerOppertunityViewModel careerOppertunityViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        careerOppertunityViewModel =
                new ViewModelProvider(this).get(CareerOppertunityViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_career_oppertunity, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewcareeropper);
        mywebview.loadUrl("https://rvce.edu.in/www.rvce.edu.in/career");
        return root;
    }
}