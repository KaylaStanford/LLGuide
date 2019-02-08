package com.example.android.llguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter (Context context, FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EatsFragment();
        } else if (position == 1) {
            return new LodgingFragment();
        } else if (position == 2) {
            return new AttractionsFragment();
        } else {
            return new PinsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position){
        if (position == 0){
            return mContext.getString(R.string.eats_category);
        } else if (position == 1){
            return mContext.getString(R.string.lodging_category);
        } else if (position == 2){
            return mContext.getString(R.string.attractions_category);
        } else{
            return mContext.getString(R.string.pins_category);
        }

    }
}

