package com.example.vamp.javaprogramming;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by VAMP on 21-Feb-17.
 */

public class ActivityAddn extends AppCompatActivity {
    @Bind(R.id.appbar)
    Toolbar t;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_n_numb);
        ButterKnife.bind(this);
        setSupportActionBar(t);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("PROGRAMS");

    }
}
