package com.example.rvcephase_1.ui.key_executives;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class KeyExecutivesFragment extends Fragment {

    private KeyExecutivesViewModel keyExecutivesViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        keyExecutivesViewModel =
                new ViewModelProvider(this).get(KeyExecutivesViewModel.class);
        View root = inflater.inflate(R.layout.fragment_key_executives, container, false);
        return root;
    }
}