package com.example.dasoler.colortexto;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

    EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.texto);

        Button btnAzul = (Button) findViewById(R.id.btnazul);
        Button btnRojo = (Button) findViewById(R.id.btnrojo);
        Button btnVerde = (Button) findViewById(R.id.btnverde);


        btnAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setTextColor(Color.BLUE);
            }
        });

        btnRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setTextColor(Color.RED);
            }
        });

        btnVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.setTextColor(Color.GREEN);
            }
        });

    }

}
