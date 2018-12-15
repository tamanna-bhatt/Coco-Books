package Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import wolfsoft1.cocobooks.FrictionFragment;
import wolfsoft1.cocobooks.PopularFragment;

public class FictionTabAdapter extends FragmentPagerAdapter {
    int mnumoftabs;

    public FictionTabAdapter(FragmentManager fm, int numoftabs) {
        super(fm);
        this.mnumoftabs = numoftabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                FrictionFragment tab1 = new FrictionFragment();
                return tab1;
            case 1:
                FrictionFragment tab2 = new FrictionFragment();
                return tab2;

            case 2:
                FrictionFragment tab3 = new FrictionFragment();
                return tab3;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mnumoftabs;
    }
}

