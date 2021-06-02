package com.example.rvcephase_1.ui.cultural;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class CulturalFragment extends Fragment {

    private CulturalViewModel culturalViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        culturalViewModel =
                new ViewModelProvider(this).get(CulturalViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_cultural, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewcultural);
        mywebview.loadUrl("https://rvce.edu.in/extra-curricular");
        return root;
    }
}