package com.example.dasoler.aumentartexto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;

import java.sql.Types;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText et;
    Button btnAumentar;
    Button btnDisminuir;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = (EditText) findViewById(R.id.et);
        btnAumentar = (Button) findViewById(R.id.btnAumentar);
        btnDisminuir = (Button) findViewById(R.id.btnDisminuir);

        btnAumentar.setOnClickListener(this);
        btnDisminuir.setOnClickListener(this);



    }

    @Override
    public void onClick (View view)
    {
        Switch(view.getId())
        {
            case R.id.btnAumentar: et.setTextSize(TypedValue.COMPLEX_UNIT_DIP,);
                                break;

        }
    }
}
