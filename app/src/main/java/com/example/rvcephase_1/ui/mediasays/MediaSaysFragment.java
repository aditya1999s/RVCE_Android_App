package com.example.rvcephase_1.ui.mediasays;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class MediaSaysFragment extends Fragment {

    private MediaSaysViewModel mediaSaysViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mediaSaysViewModel =
                new ViewModelProvider(this).get(MediaSaysViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_media_says, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewmediasays);
        mywebview.loadUrl("https://www.rvce.edu.in/rvce-media");
        return root;
    }
}