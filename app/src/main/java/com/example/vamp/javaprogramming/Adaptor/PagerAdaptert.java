package com.example.vamp.javaprogramming.Adaptor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.vamp.javaprogramming.Fragment.LinearFragment;
import com.example.vamp.javaprogramming.Fragment.BinaryFragment;


/**
 * Created by VAMP on 21-Feb-17.
 */

public class PagerAdaptert extends FragmentStatePagerAdapter {

    public PagerAdaptert(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new LinearFragment();
                break;
            case 1:
                fragment = new BinaryFragment();
                break;


        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "LINEAR";
            case 1:
                return "BINARY";


            default:
                return null;
        }
    }
}
