package com.example.vamp.javaprogramming;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by VAMP on 10-Feb-17.
 */

public class TutorialActivity extends AppCompatActivity {


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
        getSupportActionBar().setTitle("TUTORIALS");

        // Listview Data
        String products[] = {"1. Introduction", "2. Structure of Java program" , "3. Variables and Operators", "4. Flow of Control",
                "5. Class","6. Method", "7. Constructor",
                "8. Object", "9. String and Exception Handling","10. Array" ,"11. Features of Java","12. Applet",
                "13. Swing"};

        lv = (ListView) findViewById(R.id.list_view);


        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_eaqitem, R.id.product_eaqname, products);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                String selectedFromList =(lv.getItemAtPosition(position).toString());
                switch(selectedFromList){

                    case "1. Introduction":
                        Intent i = new Intent(TutorialActivity.this,ActivityIntro.class);
                        startActivity(i);
                        break;

                    case "2. Structure of Java program":
                        Intent a = new Intent(TutorialActivity.this,ActivityStructure.class);
                        startActivity(a);
                        break;
                    case "3. Variables and Operators":
                        Intent b = new Intent(TutorialActivity.this,ActivityVO.class);
                        startActivity(b);
                        break;
                    case "4. Flow of Control":
                        Intent c = new Intent(TutorialActivity.this,ActivityLoop.class);
                        startActivity(c);
                        break;
                    case "5. Class":
                        Intent d = new Intent(TutorialActivity.this,ActivityClass.class);
                        startActivity(d);
                        break;

                    case "6. Method":
                        Intent e = new Intent(TutorialActivity.this,ActivityMethod.class);
                        startActivity(e);
                        break;
                    case "7. Constructor":
                        Intent f = new Intent(TutorialActivity.this,ActivityConstructor.class);
                        startActivity(f);
                        break;
                    case "8. Object":
                        Intent g = new Intent(TutorialActivity.this,ActivityObject.class);
                        startActivity(g);
                        break;
                    case "9. String and Exception Handling":
                        Intent h = new Intent(TutorialActivity.this,ActivitySandH.class);
                        startActivity(h);
                        break;
                    case "10. Array":
                        Intent j = new Intent(TutorialActivity.this,ActivityArray.class);
                        startActivity(j);
                        break;
                    case "11. Features of Java":
                        Intent k = new Intent(TutorialActivity.this,ActivityFeatures.class);
                        startActivity(k);
                        break;
                    case "12. Applet":
                        Intent l = new Intent(TutorialActivity.this,ActivityApplet.class);
                        startActivity(l);
                        break;
                    case "13. Swing":
                        Intent m = new Intent(TutorialActivity.this,ActivitySwing.class);
                        startActivity(m);
                        break;





                }


            }


        });
        /**
         * Enabling Search Filter
         * */

    }

}
