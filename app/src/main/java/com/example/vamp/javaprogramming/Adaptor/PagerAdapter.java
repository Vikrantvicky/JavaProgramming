package com.example.vamp.javaprogramming.Adaptor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.vamp.javaprogramming.Fragment.BubbleFragment;
import com.example.vamp.javaprogramming.Fragment.InsertionFragment;
import com.example.vamp.javaprogramming.Fragment.MergeFragment;
import com.example.vamp.javaprogramming.Fragment.SelectionFragment;



/**
 * Created by VAMP on 21-Feb-17.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new BubbleFragment();
                break;
            case 1:
                fragment = new InsertionFragment();
                break;
            case 2:
                fragment = new MergeFragment();
                break;
            case 3:
                fragment = new SelectionFragment();
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
                return "BUBBLE";
            case 1:
                return "INSERTION";
            case 2:
                return "MERGE";
            case 3:
                return "SELECTION";

            default:
                return null;
        }
    }
}
