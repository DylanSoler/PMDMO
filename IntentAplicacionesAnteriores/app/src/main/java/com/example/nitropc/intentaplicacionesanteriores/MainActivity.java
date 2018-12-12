package com.example.nitropc.intentaplicacionesanteriores;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements  AdapterView.OnItemSelectedListener {

    Spinner spn;
    String[] apli = {"","Camara","Localizaciones","AutocompleteText"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spn = (Spinner) findViewById(R.id.spinner);
        spn.setOnItemSelectedListener(this);
        ArrayAdapter<String> adap = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,apli);
        adap.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spn.setAdapter(adap);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

        if(position!=0) {
            Intent iApps = new Intent();
            iApps.setAction(Intent.ACTION_VIEW);


            switch (apli[position]) {

                case "Camara":
                    iApps.addCategory("miCamara");
                    break;

                case "Localizaciones":
                    iApps.addCategory("miLocalizaciones");
                    break;

                case "AutocompleteText":
                    iApps.addCategory("miAutoCompleteText");
                    break;
            }

            if (iApps.resolveActivity(getPackageManager()) != null) {
                startActivity(iApps);
            }
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

        apli[0] = "Selecciona una aplicacion";

    }
}
