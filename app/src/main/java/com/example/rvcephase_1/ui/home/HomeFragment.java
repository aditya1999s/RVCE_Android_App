package com.example.rvcephase_1.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.example.rvcephase_1.R;

public class HomeFragment extends Fragment {
    ViewFlipper viewFlipper;
    private com.example.rvcephase_1.ui.home.HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(com.example.rvcephase_1.ui.home.HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        viewFlipper=(ViewFlipper)root.findViewById(R.id.viewFlip);
        int img[]={R.drawable.home6,R.drawable.home4,R.drawable.home3,R.drawable.home1,R.drawable.home5,R.drawable.home2};

        for(int image: img)
        {
            flipperImager(image);
        }
        return root;
    }
    public void flipperImager(int img){
        ImageView imageView=new ImageView(getContext());
        imageView.setBackgroundResource(img);
        viewFlipper.addView(imageView);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);

    }
}