package com.example.vamp.javaprogramming.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vamp.javaprogramming.R;

/**
 * Created by VAMP on 21-Feb-17.
 */

public class InsertionFragment extends android.support.v4.app.Fragment {

    public InsertionFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_insertion, container, false);
    }
}
