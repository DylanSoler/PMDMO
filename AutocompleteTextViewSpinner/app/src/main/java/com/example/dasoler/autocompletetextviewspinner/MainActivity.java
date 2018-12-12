package com.example.dasoler.autocompletetextviewspinner;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {


   AutoCompleteTextView actv;
   //Texto que autocompleta
   String[] equipos = {"Su majestad Real Betis","Madrid","Barcelona","Atletico","Valencia","Villarreal"};

   Button btn;
   TextView tv;
   Spinner spinner;
   ArrayList<String> equiposSpinner = new ArrayList<String>();
   ArrayList<String> equiposSpinner2 = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        tv = (TextView) findViewById(R.id.textView);
        spinner = (Spinner) findViewById(R.id.spinner);

        btn.setOnClickListener(this);
        spinner.setOnItemSelectedListener(this);

        //-----------AutoCompleteTextView-----------\\
        actv = (AutoCompleteTextView) findViewById(R.id.AutoComplete);
        //adaptador del AutoCompleteText
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,equipos);
        //Empezará a funcionar desde el primer caracter introducido
        actv.setThreshold(1);
        //asignar adaptador
        actv.setAdapter(adapter);


        //Spinner
        ArrayAdapter<String> adapSpinner=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                equiposSpinner2);

        adapSpinner.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapSpinner);

    }

    @Override
    public void onClick(View view) {

        String equipoSeleccionado = this.actv.getEditableText().toString();
        tv.setText(equipoSeleccionado);

        switch (equipoSeleccionado){

            case "Su majestad Real Betis":
                                        equiposSpinner2.add(equipoSeleccionado);
                                        break;

            case "Barcelona":   equiposSpinner2.add(equipoSeleccionado);
                                break;

            case "Madrid":  equiposSpinner2.add(equipoSeleccionado);
                            break;

            case "Valencia": equiposSpinner2.add(equipoSeleccionado);
                             break;

            case "Atletico": equiposSpinner2.add(equipoSeleccionado);
                             break;

            case "Villarreal":  equiposSpinner2.add(equipoSeleccionado);
                                break;
        }


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        Intent intento = new Intent();
        
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
