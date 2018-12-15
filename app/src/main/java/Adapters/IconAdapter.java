package Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import wolfsoft1.cocobooks.BookFragment;
import wolfsoft1.cocobooks.PopularFragment;

public class IconAdapter extends FragmentStatePagerAdapter {
    int mnumoftabs;

    public IconAdapter(FragmentManager fm, int numoftabs) {
        super(fm);
        this.mnumoftabs = numoftabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                BookFragment tab1 = new BookFragment();
                return tab1;
            case 1:
                BookFragment tab2 = new BookFragment();
                return tab2;

            case 2:
                BookFragment tab3 = new BookFragment();
                return tab3;
            case 3:
                BookFragment tab4 = new BookFragment();
                return tab4;


            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mnumoftabs;
    }
}
