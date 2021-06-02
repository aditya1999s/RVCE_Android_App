package com.example.rvcephase_1.ui.nirfrvce20192020;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class NirfRvce20192020Fragment extends Fragment {

    private NirfRvce20192020ViewModel nirfRvce20192020ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        nirfRvce20192020ViewModel =
                new ViewModelProvider(this).get(NirfRvce20192020ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_nirf_rvce_2019_2020, container, false);
        Uri uri = Uri.parse("https://rvce.edu.in/sites/default/files/NIRF-Ranking-MHRD-NIRF-AllReport.pdf");
        startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
        return root;
    }
}