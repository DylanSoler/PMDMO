package com.example.dasoler.intentlocalizaciones;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner spinner;
    String [] localizaciones = {"--selecciona--","Sevilla","Londres","Ciudad de México"};
    //formato ("geo:"+_lat+","+_lon);
    Uri sevilla = Uri.parse("geo:37.3828300,-5.9731700");
    Uri londres = Uri.parse("geo:51.5072,-0.1275");
    Uri mexico = Uri.parse("geo:19.4284700,-99.1276600");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);

        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<String> adapSpinner=new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item,
                localizaciones);

        adapSpinner.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapSpinner);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        Intent loc;

        switch(localizaciones[i]){

            case "Sevilla": loc = new Intent(Intent.ACTION_VIEW,sevilla);
                startActivity(loc);
                break;
            case "Londres": loc = new Intent(Intent.ACTION_VIEW,londres);
                startActivity(loc);
                break;
            case "Mexico":  loc = new Intent(Intent.ACTION_VIEW,mexico);
                startActivity(loc);
                break;
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


}
