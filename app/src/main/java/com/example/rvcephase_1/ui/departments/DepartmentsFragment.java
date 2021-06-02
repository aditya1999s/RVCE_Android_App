package com.example.rvcephase_1.ui.departments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.example.rvcephase_1.R;
import com.google.android.material.tabs.TabLayout;

public class DepartmentsFragment extends Fragment {

    private DepartmentsViewModel homeViewModel;
    TabLayout tabLayout;
    ViewPager viewPager;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        homeViewModel =
                new ViewModelProvider(this).get(DepartmentsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_departments, container, false);

        tabLayout=root.findViewById(R.id.tabLayout);
        viewPager=root.findViewById(R.id.viewPager);

        tabLayout.addTab(tabLayout.newTab().setText("Aerospace"));
        tabLayout.addTab(tabLayout.newTab().setText("BioTechnology"));
        tabLayout.addTab(tabLayout.newTab().setText("Chemical"));
        tabLayout.addTab(tabLayout.newTab().setText("Civil"));
        tabLayout.addTab(tabLayout.newTab().setText("Computer Science"));
        tabLayout.addTab(tabLayout.newTab().setText("EEE-Main"));
        tabLayout.addTab(tabLayout.newTab().setText("Electronics and Communication"));
        tabLayout.addTab(tabLayout.newTab().setText("EIE-Home"));
        tabLayout.addTab(tabLayout.newTab().setText("Industrial and Production"));
        tabLayout.addTab(tabLayout.newTab().setText("Information Science"));
        tabLayout.addTab(tabLayout.newTab().setText("MCA"));
        tabLayout.addTab(tabLayout.newTab().setText("Mechanical"));
        tabLayout.addTab(tabLayout.newTab().setText("Telecommunication"));
        tabLayout.addTab(tabLayout.newTab().setText("IDRC"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final MyAdapter adapter = new MyAdapter(getContext(), getFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return root;
    }
}