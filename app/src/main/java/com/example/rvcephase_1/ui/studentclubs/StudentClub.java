package com.example.rvcephase_1.ui.studentclubs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class StudentClub extends Fragment {

    private StudentClubViewModel studentClubViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        studentClubViewModel =
                new ViewModelProvider(this).get(StudentClubViewModel.class);
        View root = inflater.inflate(R.layout.fragment_menu_student_clubs, container, false);
        WebView mywebview = (WebView) root.findViewById(R.id.webViewstudentclub);
        mywebview.loadUrl("https://rvce.edu.in/rvce-students-clubs-technical-innovative");
        return root;
    }
}