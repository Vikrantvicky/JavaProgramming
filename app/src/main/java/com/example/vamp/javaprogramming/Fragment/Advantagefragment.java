package com.example.vamp.javaprogramming.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vamp.javaprogramming.R;

/**
 * Created by VAMP on 25-Feb-17.
 */

public class Advantagefragment extends android.support.v4.app.Fragment {
    public Advantagefragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_adv, container, false);
    }
}
