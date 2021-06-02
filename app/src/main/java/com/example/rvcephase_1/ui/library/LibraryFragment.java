package com.example.rvcephase_1.ui.library;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class LibraryFragment extends Fragment {

    private LibraryViewModel libraryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        libraryViewModel =
                new ViewModelProvider(this).get(LibraryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_library, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewlibrary);
        mywebview.loadUrl("https://www.rvce.edu.in/library");
        return root;
    }
}