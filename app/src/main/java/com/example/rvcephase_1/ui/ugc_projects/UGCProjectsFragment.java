package com.example.rvcephase_1.ui.ugc_projects;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class UGCProjectsFragment extends Fragment {

    private UGCProjectsViewModel UGCProjectsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        UGCProjectsViewModel =
                new ViewModelProvider(this).get(UGCProjectsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_ugc_projects, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewugcprojects);
        mywebview.loadUrl("https://rvce.edu.in/ugc-projects");
        return root;
    }
}