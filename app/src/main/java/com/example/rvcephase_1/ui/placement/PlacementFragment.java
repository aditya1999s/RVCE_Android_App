package com.example.rvcephase_1.ui.placement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class PlacementFragment extends Fragment {

    private PlacementViewModel placementViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        placementViewModel =
                new ViewModelProvider(this).get(PlacementViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_placement, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewplacement);
        mywebview.loadUrl("https://www.rvce.edu.in/placement-menu");
        return root;
    }
}