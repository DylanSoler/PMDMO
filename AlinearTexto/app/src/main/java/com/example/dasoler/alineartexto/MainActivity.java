package com.example.dasoler.alineartexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText edtext = (EditText) findViewById(R.id.edtText);
        Button btnAlignR = (Button) findViewById(R.id.btnAlignR);
        Button btnAlignL = (Button) findViewById(R.id.btnAlignL);

        btnAlignR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edtext.setGravity(Gravity.RIGHT);
            }
        });

        btnAlignL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edtext.setGravity(Gravity.LEFT);
            }
        });

    }
}
