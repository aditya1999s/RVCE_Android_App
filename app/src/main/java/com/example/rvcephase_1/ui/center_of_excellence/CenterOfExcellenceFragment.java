package com.example.rvcephase_1.ui.center_of_excellence;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class CenterOfExcellenceFragment extends Fragment {

    private CenterOfExcellenceViewModel centerOfExcellenceViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        centerOfExcellenceViewModel =
                new ViewModelProvider(this).get(CenterOfExcellenceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_center_of_excellence, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewcenterofexcellence);
        mywebview.loadUrl("https://rvce.edu.in/rvce-center-excellence");
        return root;
    }
}