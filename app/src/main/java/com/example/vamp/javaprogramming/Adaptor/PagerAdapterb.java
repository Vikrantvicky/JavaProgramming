package com.example.vamp.javaprogramming.Adaptor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.vamp.javaprogramming.Fragment.VariableFragment;
import com.example.vamp.javaprogramming.Fragment.OperatorFragment;

/**
 * Created by VAMP on 25-Feb-17.
 */

public class PagerAdapterb extends FragmentStatePagerAdapter {


    public PagerAdapterb(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new VariableFragment();
                break;
            case 1:
                fragment = new OperatorFragment();
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
                return "VARIABLE";
            case 1:
                return "OPERATOR";


            default:
                return null;
        }
    }
}
