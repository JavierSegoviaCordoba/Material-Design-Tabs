package com.videum.javier.tabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.videum.javier.tabs.TabFragments.Tab1;
import com.videum.javier.tabs.TabFragments.Tab2;


public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence titles[];
    int tabNumber;


    // Constructor
    public ViewPagerAdapter(FragmentManager fragmentManager, CharSequence titles[], int tabNumber) {
        super(fragmentManager);

        this.titles = titles;
        this.tabNumber = tabNumber;

    }

    // Return Fragment for each position
    @Override
    public Fragment getItem(int position) {
        Tab1 tab1 = new Tab1();
        Tab2 tab2 = new Tab2();

        switch (position) {
            case 0:
                return tab1;
            case 1:
                return tab2;
            case 2:
                return tab1;
            case 3:
                return tab2;
        }
        return null;
    }

    // Return tab titles for each position

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }

    // Return tab number.
    @Override
    public int getCount() {
        return tabNumber;
    }
}
