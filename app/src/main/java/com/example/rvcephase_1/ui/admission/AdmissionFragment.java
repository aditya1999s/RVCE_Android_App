package com.example.rvcephase_1.ui.admission;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class AdmissionFragment extends Fragment {

    private AdmissionViewModel admissionViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        admissionViewModel =
                new ViewModelProvider(this).get(AdmissionViewModel.class);
        View root= inflater.inflate(R.layout.fragment_admission, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewadmi);
        mywebview.loadUrl("https://rvce.edu.in/admission");
        return root;
    }
}
