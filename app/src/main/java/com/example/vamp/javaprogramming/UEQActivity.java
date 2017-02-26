package com.example.vamp.javaprogramming;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by VAMP on 10-Feb-17.
 */

public class UEQActivity extends AppCompatActivity{

    @Bind(R.id.appbar)
    Toolbar toolbar;
    // List view
    private ListView lv;
    // Listview Adapter
    ArrayAdapter<String> adapter;
    // Search EditText

    String title,code;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_examques);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("EXAM QUESTIONS");

        // Listview Data
        String products[] = {"Q1 List out fundamental data types in Java.", "Q2 What is an array?" , "Q3 What is Variable declaration and Variable Initialization.", "Q4 Define method.",
                "Q5 Define properties of Java.", "Q6 Demonstrate the usage of a switch statement with an example.", "Q7 Distinguish between while and do while.",
                "Q8 Explain the different kinds of loops available in Java.", "Q9 Difference between ArrayList and Vector in Java", "Q10 What is the difference between a constructor and a method?",
        "Q11 What is an abstract class?","Q12 Explain multithreading.", "Q13 Explain inheritance.", "Q14 How we use I/O in Java", "Q15 Explain swings."};

        lv = (ListView) findViewById(R.id.list_view);


        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_eaqitem, R.id.product_eaqname, products);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


            }


        });
        /**
         * Enabling Search Filter
         * */

    }

}
