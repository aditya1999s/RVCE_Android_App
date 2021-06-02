package com.example.rvcephase_1.ui.departments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.rvcephase_1.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AerospaceFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AerospaceFragment extends Fragment {
    ViewFlipper viewFlipper;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AerospaceFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AerospaceFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AerospaceFragment newInstance(String param1, String param2) {
        AerospaceFragment fragment = new AerospaceFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_aerospace, container, false);

        viewFlipper=(ViewFlipper)root.findViewById(R.id.viewFlip);
        int img[]={R.drawable.aero1,R.drawable.aero2,R.drawable.aero3,R.drawable.aero4,R.drawable.aero5,R.drawable.aero6};

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