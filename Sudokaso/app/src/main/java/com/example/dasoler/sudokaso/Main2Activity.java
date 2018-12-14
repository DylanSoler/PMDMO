package com.example.dasoler.sudokaso;

import android.app.ListActivity;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        if(findViewById(R.id.frlayoutsudoku)==null){

            if (savedInstanceState != null) {
                return;
            }

            ListFragment frag1 = new ListFragment();

            frag1.setArguments(getIntent().getExtras());

            getSupportFragmentManager().beginTransaction().add(R.id.frlayout, frag1).commit();

        }
    }
}
