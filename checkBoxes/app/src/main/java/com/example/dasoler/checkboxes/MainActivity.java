package com.example.dasoler.checkboxes;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;

    CheckBox chB1;
    CheckBox chB2;
    CheckBox chB3;
    CheckBox chB4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.eT);

        chB1 = (CheckBox) findViewById(R.id.chBox1);
        chB2 = (CheckBox) findViewById(R.id.chBox2);
        chB3 = (CheckBox) findViewById(R.id.chBox3);
        chB4 = (CheckBox) findViewById(R.id.chBox4);

        chB1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true)
                {
                    et.setTypeface(Typeface.DEFAULT_BOLD);
                }
                else
                {
                    et.setTypeface(Typeface.DEFAULT);
                }
            }
        });


        chB2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true)
                {
                    chB3.setChecked(false);
                    et.setTextSize(40);
                }
                else
                {
                    et.setTextSize(20);
                }
            }
        });

        chB3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true)
                {
                    chB2.setChecked(false);
                    et.setTextSize(10);
                }
                else
                {
                    et.setTextSize(20);
                }
            }
        });

        chB4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true)
                {
                    et.setTextColor(Color.RED);
                }
                else
                {
                    et.setTextColor(Color.BLACK);
                }
            }
        });

    }



}
