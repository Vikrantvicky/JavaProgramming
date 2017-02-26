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

public class ProgActivity extends AppCompatActivity{

    @Bind(R.id.appbar)
    Toolbar toolbar;
    // List view
    private ListView lv;
    // Listview Adapter
    ArrayAdapter<String> adapter;
    // Search EditText
    EditText inputSearch;
    String title,code;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prog);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("PROGRAMS");

        // Listview Data
        String products[] = {"Hello World", "Area of triangle", "Odd or Even",
                "Add Subtract Multiply Divide", "Add n numbers", "Add Digits of a number",
                "Greatest of 3 numbers", "Swapping two numbers", "Searching", "Sorting"};

        lv = (ListView) findViewById(R.id.list_view);
        inputSearch = (EditText) findViewById(R.id.inputSearch);

        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.product_name, products);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String selectedFromList =(lv.getItemAtPosition(position).toString());
                switch(selectedFromList){

                    case "Hello World":
                        Intent i = new Intent(ProgActivity.this,ActivityHello.class);
                        startActivity(i);
                        break;

                    case "Area of triangle":
                        Intent a = new Intent(ProgActivity.this,ActivityArea.class);
                        startActivity(a);
                        break;
                    case "Odd or Even":
                        Intent b = new Intent(ProgActivity.this,ActivityOdd.class);
                        startActivity(b);
                        break;
                    case "Add Subtract Multiply Divide":
                        Intent c = new Intent(ProgActivity.this,ActivityASMD.class);
                        startActivity(c);
                        break;
                    case "Add n numbers":
                        Intent d = new Intent(ProgActivity.this,ActivityAddn.class);
                        startActivity(d);
                        break;

                    case "Add Digits of a number":
                        Intent e = new Intent(ProgActivity.this,ActivityDigits.class);
                        startActivity(e);
                        break;
                    case "Greatest of 3 numbers":
                        Intent f = new Intent(ProgActivity.this,ActivityGreatest.class);
                        startActivity(f);
                        break;
                    case "Swapping two numbers":
                        Intent g = new Intent(ProgActivity.this,ActivitySwapping.class);
                        startActivity(g);
                        break;
                    case "Searching":
                        Intent h = new Intent(ProgActivity.this,ActivitySelection.class);
                        startActivity(h);
                        break;
                    case "Sorting":
                        Intent j = new Intent(ProgActivity.this,ActivitySorting.class);
                        startActivity(j);
                        break;




                }

            }


        });
        /**
         * Enabling Search Filter
         * */
        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
                ProgActivity.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2, int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });
    }

}
