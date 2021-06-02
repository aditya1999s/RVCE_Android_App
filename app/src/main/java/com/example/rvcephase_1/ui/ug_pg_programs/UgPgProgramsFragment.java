package com.example.rvcephase_1.ui.ug_pg_programs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class UgPgProgramsFragment extends Fragment {

    private UGPGProgramsViewModel UGPGProgramsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        UGPGProgramsViewModel =
                new ViewModelProvider(this).get(UGPGProgramsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_ug_pg_programs, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewugpgprograms);
        mywebview.loadUrl("https://rvce.edu.in/ug-pg-programs");
        return root;
    }
}