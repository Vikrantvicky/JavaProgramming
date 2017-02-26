package com.example.vamp.javaprogramming.Adaptor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.vamp.javaprogramming.Fragment.StringFragment;
import com.example.vamp.javaprogramming.Fragment.ExceptionFragment;

/**
 * Created by VAMP on 25-Feb-17.
 */

public class PagerAdapterd extends FragmentStatePagerAdapter {


    public PagerAdapterd(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new StringFragment();
                break;
            case 1:
                fragment = new ExceptionFragment();
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
                return "STRING HANDLING";
            case 1:
                return "EXCEPTION HANDLING";


            default:
                return null;
        }
    }
}
