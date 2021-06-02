package com.example.rvcephase_1.ui.nccnss;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class NCCNSSFragment extends Fragment {

    private NCCNSSViewModel NCCNSSViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        NCCNSSViewModel =
                new ViewModelProvider(this).get(NCCNSSViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_ncc_nss, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewnccnss);
        mywebview.loadUrl("https://www.rvce.edu.in/ncc-nss");
        return root;
    }
}