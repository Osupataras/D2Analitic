package com.osypchuk.taras.d2a.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.osypchuk.taras.d2a.Tabs.FragmentTab1;
import com.osypchuk.taras.d2a.Tabs.FragmentTab2;
import com.osypchuk.taras.d2a.Tabs.FragmentTab3;

/**
 * Created by Taras on 25.11.2016.
 */
public class PagerAdapter extends FragmentPagerAdapter {
    int NumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.NumOfTabs = NumOfTabs;
    }

    @Override

    public int getCount() {
        return NumOfTabs;
    }

    @Override

    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                FragmentTab1 tab1 = new FragmentTab1();
                return tab1;
            case 1:
                FragmentTab2 tab2 = new FragmentTab2();
                return tab2;
            case 2:
                FragmentTab3 tab3 = new FragmentTab3();
                return tab3;
            default:
                return null;


        }
    }

}
