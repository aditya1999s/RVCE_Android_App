package com.example.rvcephase_1.ui.nbarvcestatus2021;

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

public class NbaRvceStatus2021Fragment extends Fragment {

    private NBARvceStatus2021ViewModel NBARvceStatus2021ViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        NBARvceStatus2021ViewModel =
                new ViewModelProvider(this).get(NBARvceStatus2021ViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_nba_rvce_2021, container, false);
        Uri uri = Uri.parse("https://rvce.edu.in//sites/default/files/VTUNBAAFFILIATIONOFPROGRAMCOURSES542021new.pdf");
        startActivity( new Intent( Intent.ACTION_VIEW, uri ) );
        return root;
    }
}