package com.example.vamp.javaprogramming;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by VAMP on 09-Feb-17.
 */

public class DashboardActivity extends AppCompatActivity {
@Bind(R.id.appbar)
    Toolbar t;
   @Bind(R.id.tutorial)
    CardView c1;
    @Bind(R.id.prog)
    CardView c2;
    @Bind(R.id.faq)
    CardView c3;
    @Bind(R.id.ueq)
    CardView c4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        Toast.makeText(this, "Welcome To JAVA Programming", Toast.LENGTH_SHORT).show();
        ButterKnife.bind(this);

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(DashboardActivity.this,TutorialActivity.class);
                startActivity(i);
            }
        });

        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(DashboardActivity.this,ProgActivity.class);
                startActivity(i);
            }
        });

        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(DashboardActivity.this,FAQActivity.class);
                startActivity(i);
            }
        });
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(DashboardActivity.this,UEQActivity.class);
                startActivity(i);
            }
        });




        setSupportActionBar(t);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setTitle("JAVA PROGRAMMING");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.action_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.aboutbar:
                Intent ii=new Intent(DashboardActivity.this,ActivityAbout.class);
                startActivity(ii);
                return true;
            case R.id.ratebar:
                Toast.makeText(this, "UPDATING", Toast.LENGTH_SHORT).show();
                return true;

            case R.id.contactbar:
                Intent iii=new Intent(DashboardActivity.this,ContactActivity.class);
                startActivity(iii);
                return true;

            case R.id.privacybar:
                Toast.makeText(this, "UPDATING", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.refrences:
                Intent a=new Intent(DashboardActivity.this,ActivityRefrence.class);
                startActivity(a);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }

    }

}

