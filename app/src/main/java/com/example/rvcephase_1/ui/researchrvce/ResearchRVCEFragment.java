package com.example.rvcephase_1.ui.researchrvce;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class ResearchRVCEFragment extends Fragment {

    private ResearchRVCEViewModel researchRVCEViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        researchRVCEViewModel =
                new ViewModelProvider(this).get(ResearchRVCEViewModel.class);
        View root= inflater.inflate(R.layout.fragment_research_rvce, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewresearchrvce);
        mywebview.loadUrl("https://rvce.edu.in/research-at-rvce");
        return root;
    }
}
