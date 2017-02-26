package com.example.vamp.javaprogramming.Adaptor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.vamp.javaprogramming.Fragment.Introfragment;
import com.example.vamp.javaprogramming.Fragment.Advantagefragment;


/**
 * Created by VAMP on 25-Feb-17.
 */

public class PagerAdaptera extends FragmentStatePagerAdapter {


    public PagerAdaptera(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new Introfragment();
                break;
            case 1:
                fragment = new Advantagefragment();
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
                return "INTRODUCTION";
            case 1:
                return "ADVANTAGE";


            default:
                return null;
        }
    }
}
