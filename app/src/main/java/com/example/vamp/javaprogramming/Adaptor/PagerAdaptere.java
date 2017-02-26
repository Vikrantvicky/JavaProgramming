package com.example.vamp.javaprogramming.Adaptor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.widget.BaseExpandableListAdapter;

import com.example.vamp.javaprogramming.Fragment.InheritanceFragment;
import com.example.vamp.javaprogramming.Fragment.PolymorphismFragment;
import com.example.vamp.javaprogramming.Fragment.AbstractFragment;
import com.example.vamp.javaprogramming.Fragment.EncapsulationFragment;

/**
 * Created by VAMP on 25-Feb-17.
 */

public class PagerAdaptere extends FragmentStatePagerAdapter {

    public PagerAdaptere(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new InheritanceFragment();
                break;
            case 1:
                fragment = new PolymorphismFragment();
                break;
            case 2:
                fragment = new AbstractFragment();
                break;
            case 3:
                fragment = new EncapsulationFragment();
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
                return "INHERITANCE";
            case 1:
                return "POLYMORPHISM";
            case 2:
                return "ABSTRACT";
            case 3:
                return "ENCAPSULATION";

            default:
                return null;
        }
    }
}
