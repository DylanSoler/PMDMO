package com.example.nitropc.fragmentprueba;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.btnFr1);
        btn2 = (Button) findViewById(R.id.btnFr2);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        if(findViewById(R.id.frameLayout)!=null)

        switch (v.getId()) {

            case R.id.btnFr1:

                break;

            case R.id.btnFr2:

                break;
        }


    }
}
