package com.videum.javier.tabs;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.videum.javier.tabs.Utils.SlidingTabLayout;

public class MyFragment extends Fragment {
    
    ViewPager pager;
    ViewPagerAdapter adapter;
    SlidingTabLayout tabs;
    CharSequence titles[]={"Tab 1","Tab 2", "Tab 3", "Tab 4 with a long title"};
    int tabNumber = 4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.my_fragment,container,false);

        //  Setup tabs
        adapter =  new ViewPagerAdapter(getFragmentManager(),titles,tabNumber);
        pager = (ViewPager) view.findViewById(R.id.pager);
        pager.setAdapter(adapter);
        tabs = (SlidingTabLayout) view.findViewById(R.id.tabs);
        tabs.setDistributeEvenly(false);

        // Tab indicator color
        tabs.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                //TypedValue typedValue = new TypedValue();
                //getActivity().getTheme().resolveAttribute(R.attr.colorAccent, typedValue, true);
                //final int color = typedValue.data;
                return getResources().getColor(R.color.md_white_1000);
            }
        });

        tabs.setViewPager(pager);

        return view;
    }
}
