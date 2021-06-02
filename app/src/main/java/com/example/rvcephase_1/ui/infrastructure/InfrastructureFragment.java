package com.example.rvcephase_1.ui.infrastructure;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.rvcephase_1.R;

public class InfrastructureFragment extends Fragment {

    ViewFlipper viewFlipper;
    private com.example.rvcephase_1.ui.infrastructure.InfrastructureViewModel infrastructureViewModel;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        infrastructureViewModel =
                new ViewModelProvider(this).get(com.example.rvcephase_1.ui.infrastructure.InfrastructureViewModel.class);
        View root = inflater.inflate(R.layout.fragment_infrastructure, container, false);
        viewFlipper=(ViewFlipper)root.findViewById(R.id.viewFlipinfra);
        int img[]={R.drawable.foodcourt1,R.drawable.foodcourt2,R.drawable.foodcourt3,R.drawable.foodcourt4,R.drawable.infra1,R.drawable.infra2,R.drawable.infra3,R.drawable.infra4,R.drawable.infra5,R.drawable.infra6,R.drawable.infra7,R.drawable.infra8,R.drawable.infra9,R.drawable.infra10,R.drawable.infra11,R.drawable.infra12,R.drawable.infra13,R.drawable.infra14,R.drawable.infra15,R.drawable.infra16,R.drawable.infra17,R.drawable.infra18,R.drawable.infra19,R.drawable.infra20,R.drawable.infra21,R.drawable.infra22,R.drawable.infra23,R.drawable.infra24,R.drawable.infra25,R.drawable.infra26,R.drawable.infra27,R.drawable.infra28,R.drawable.infra29};

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