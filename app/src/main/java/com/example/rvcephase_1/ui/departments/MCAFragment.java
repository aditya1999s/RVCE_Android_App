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
 * Use the {@link MCAFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MCAFragment extends Fragment {
    ViewFlipper viewFlipper;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MCAFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MCAFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MCAFragment newInstance(String param1, String param2) {
        MCAFragment fragment = new MCAFragment();
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
        View root=inflater.inflate(R.layout.fragment_m_c_a, container, false);

        viewFlipper=(ViewFlipper)root.findViewById(R.id.viewFlip);
        int img[]={R.drawable.mca1,R.drawable.mca2,R.drawable.mca3,R.drawable.mca4,R.drawable.mca5,R.drawable.mac6,R.drawable.mca7,R.drawable.mca8,R.drawable.mca9,R.drawable.mca10,R.drawable.mca11,R.drawable.mca12,R.drawable.mca13,R.drawable.mca14,R.drawable.mca15,R.drawable.mca16,R.drawable.mca17,R.drawable.mca18,R.drawable.mca18,R.drawable.mca19,R.drawable.mca20,R.drawable.mca21,R.drawable.mca22,R.drawable.mca23};

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
        viewFlipper.setFlipInterval(2500);
        viewFlipper.setAutoStart(true);

    }
}
