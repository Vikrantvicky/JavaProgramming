package com.example.vamp.javaprogramming.Adaptor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.vamp.javaprogramming.Fragment.IfFragment;
import com.example.vamp.javaprogramming.Fragment.ForFragment;
import com.example.vamp.javaprogramming.Fragment.WhileFragment;
import com.example.vamp.javaprogramming.Fragment.SwitchFragment;

/**
 * Created by VAMP on 25-Feb-17.
 */

public class PagerAdapterc extends FragmentStatePagerAdapter {


    public PagerAdapterc(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new IfFragment();
                break;
            case 1:
                fragment = new ForFragment();
                break;
            case 2:
                fragment = new WhileFragment();
                break;
            case 3:
                fragment = new SwitchFragment();
                break;
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "IF";
            case 1:
                return "FOR";
            case 2:
                return "WHILE";
            case 3:
                return "SWITCH";
            default:
                return null;
        }
    }
}
