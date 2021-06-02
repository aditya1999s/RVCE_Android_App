package com.example.rvcephase_1.ui.contactus;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class ContactUsFragment extends Fragment {

    private ContactUsViewModel contactUsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        contactUsViewModel =
                new ViewModelProvider(this).get(ContactUsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_contact_us, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewcontactus);
        mywebview.loadUrl("https://rvce.edu.in/contact-us");
        return root;
    }
}