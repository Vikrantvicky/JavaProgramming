package com.example.vamp.javaprogramming;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ExpandableListView;
import com.example.vamp.javaprogramming.Adaptor.MyAdaptor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by VAMP on 09-Feb-17.
 */

public class FAQActivity extends AppCompatActivity {
@Bind(R.id.appbar)
        Toolbar t;
    ExpandableListView expandableListView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        ButterKnife.bind(this);
        setSupportActionBar(t);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("FREQUENTLY ASKED QUESTIONS");
        expandableListView = (ExpandableListView) findViewById(R.id.exp_listview);
        List<String> Headings = new ArrayList<String>();
        List<String> L1 = new ArrayList<String>();
        List<String> L2 = new ArrayList<String>();
        List<String> L3 = new ArrayList<String>();
        List<String> L4 = new ArrayList<String>();
        List<String> L5 = new ArrayList<String>();
        List<String> L6 = new ArrayList<String>();
        List<String> L7 = new ArrayList<String>();
        List<String> L8 = new ArrayList<String>();
        List<String> L9 = new ArrayList<String>();
        List<String> L10 = new ArrayList<String>();
        List<String> L11 = new ArrayList<String>();
        List<String> L12 = new ArrayList<String>();
        List<String> L13 = new ArrayList<String>();
        List<String> L14 = new ArrayList<String>();
        List<String> L15 = new ArrayList<String>();



        HashMap<String, List<String>> ChildList = new HashMap<String, List<String>>();
        String heading_items[] = getResources().getStringArray(R.array.header);
        String l1[] = getResources().getStringArray(R.array.Q1);
        String l2[] = getResources().getStringArray(R.array.Q2);
        String l3[] = getResources().getStringArray(R.array.Q3);
        String l4[] = getResources().getStringArray(R.array.Q4);
        String l5[] = getResources().getStringArray(R.array.Q5);
        String l6[] = getResources().getStringArray(R.array.Q6);
        String l7[] = getResources().getStringArray(R.array.Q7);
        String l8[] = getResources().getStringArray(R.array.Q8);
        String l9[] = getResources().getStringArray(R.array.Q9);
        String l10[] = getResources().getStringArray(R.array.Q10);
        String l11[] = getResources().getStringArray(R.array.Q11);
        String l12[] = getResources().getStringArray(R.array.Q12);
        String l13[] = getResources().getStringArray(R.array.Q13);
        String l14[] = getResources().getStringArray(R.array.Q14);
        String l15[] = getResources().getStringArray(R.array.Q15);
        for (String title : heading_items) {
            Headings.add(title);
        }
        for (String title : l1) {
            L1.add(title);
        }
        for (String title : l2) {
            L2.add(title);
        }
        for (String title : l3) {
            L3.add(title);
        }
        for (String title : l4) {
            L4.add(title);
        }
        for (String title : l5) {
            L5.add(title);
        }
        for (String title : l6) {
            L6.add(title);
        }
        for (String title : l7) {
            L7.add(title);
        }
        for (String title : l8) {
            L8.add(title);
        }
        for (String title : l9) {
            L9.add(title);
        }
        for (String title : l10) {
            L10.add(title);
        }
        for (String title : l11) {
            L11.add(title);
        }
        for (String title : l12) {
            L12.add(title);
        }
        for (String title : l13) {
            L13.add(title);
        }
        for (String title : l14) {
            L14.add(title);
        }
        for (String title : l15) {
            L15.add(title);
        }

        ChildList.put(Headings.get(0), L1);
        ChildList.put(Headings.get(1), L2);
        ChildList.put(Headings.get(2), L3);
        ChildList.put(Headings.get(3), L4);
        ChildList.put(Headings.get(4), L5);
        ChildList.put(Headings.get(5), L6);
        ChildList.put(Headings.get(6), L7);
        ChildList.put(Headings.get(7), L8);
        ChildList.put(Headings.get(8), L9);
        ChildList.put(Headings.get(9), L10);
        ChildList.put(Headings.get(10), L11);
        ChildList.put(Headings.get(11), L12);
        ChildList.put(Headings.get(12), L13);
        ChildList.put(Headings.get(13), L14);
        ChildList.put(Headings.get(14), L15);
        MyAdaptor myAdaptor = new MyAdaptor(this, Headings, ChildList);
        expandableListView.setAdapter(myAdaptor);




    }

    }
