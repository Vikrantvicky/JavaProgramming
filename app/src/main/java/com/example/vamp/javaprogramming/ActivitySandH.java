package com.example.vamp.javaprogramming;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.vamp.javaprogramming.Adaptor.PagerAdapterd;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by VAMP on 25-Feb-17.
 */

public class ActivitySandH extends AppCompatActivity {


    Toolbar t;
    TabLayout tl;
    ViewPager v;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        t=(Toolbar) findViewById(R.id.appbar);
        tl=(TabLayout)findViewById(R.id.tabLayout);
        v=(ViewPager)findViewById(R.id.viewpager);



        setSupportActionBar(t);

        PagerAdapterd pagerAdapter= new com.example.vamp.javaprogramming.Adaptor.PagerAdapterd(getSupportFragmentManager());
        v.setAdapter(pagerAdapter);
        tl.setupWithViewPager(v);



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("STRING AND EXCEPTION");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        return super.onOptionsItemSelected(item);
    }
}
