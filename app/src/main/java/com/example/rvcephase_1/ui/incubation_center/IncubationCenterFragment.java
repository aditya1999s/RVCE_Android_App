package com.example.rvcephase_1.ui.incubation_center;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class IncubationCenterFragment extends Fragment {

    private IncubationCenterViewModel incubationCenterViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        incubationCenterViewModel =
                new ViewModelProvider(this).get(IncubationCenterViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_incubation_center, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewincubationcenter);
        mywebview.loadUrl("https://rvce.edu.in/incubationcenter");
        return root;
    }
}