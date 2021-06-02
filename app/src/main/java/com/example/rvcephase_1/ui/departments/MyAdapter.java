package com.example.rvcephase_1.ui.departments;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                AerospaceFragment aerospaceFragment = new AerospaceFragment();
                return aerospaceFragment;
            case 1:
                BioTechnologyFragment bioTechnologyFragment = new BioTechnologyFragment();
                return bioTechnologyFragment;
            case 2:
                ChemicalFragment chemicalFragment = new ChemicalFragment();
                return chemicalFragment;
            case 3:
                CivilFragment civilFragment = new CivilFragment();
                return civilFragment;
            case 4:
                ComputerScienceFragment computerScienceFragment = new ComputerScienceFragment();
                return computerScienceFragment;
            case 5:
                EEEFragment eeeFragment = new EEEFragment();
                return eeeFragment;
            case 6:
                ElectronicsFragment electronicsFragment = new ElectronicsFragment();
                return electronicsFragment;
            case 7:
                EIEFragment eieFragment = new EIEFragment();
                return eieFragment;
            case 8:
                IndustrialFragment industrialFragment = new IndustrialFragment();
                return industrialFragment;
            case 9:
                InformationFragment informationFragment = new InformationFragment();
                return informationFragment;
            case 10:
                MCAFragment mcaFragment = new MCAFragment();
                return mcaFragment;
            case 11:
                MechanicalFragment mechanical = new MechanicalFragment();
                return mechanical;
            case 12:
                TelecommunicationFragment telecommunicationFragment = new TelecommunicationFragment();
                return telecommunicationFragment;
            case 13:
                IDRCFragment idrcFragment = new IDRCFragment();
                return idrcFragment;
            default:
                return null;
        }
    }
    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}