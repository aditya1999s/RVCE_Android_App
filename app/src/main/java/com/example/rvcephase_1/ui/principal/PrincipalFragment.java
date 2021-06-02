package com.example.rvcephase_1.ui.principal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class PrincipalFragment extends Fragment {

    private Object principalViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        principalViewModel =
                new ViewModelProvider(this).get(PrincipalViewModel.class);
        View root = inflater.inflate(R.layout.fragment_principal, container, false);
        return root;
    }
}