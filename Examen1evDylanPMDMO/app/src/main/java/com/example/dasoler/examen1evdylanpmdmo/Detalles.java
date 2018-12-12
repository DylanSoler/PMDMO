package com.example.dasoler.examen1evdylanpmdmo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Detalles extends AppCompatActivity {

    ImageView foto;
    TextView nombre;
    Button btnBorrar;
    Spinner posicion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles);

        foto = (ImageView) findViewById(R.id.imageViewFotoJug);
        btnBorrar = (Button) findViewById(R.id.buttonBorrar);
        nombre = (TextView) findViewById(R.id.tvNombre);
        posicion = (Spinner) findViewById(R.id.spinnerPosiciones);

        Object o = getIntent().getParcelableExtra("jugador");

        if(o instanceof futbolista) {

            futbolista f = (futbolista) o;
            foto.setImageResource(f.getFoto());
            nombre.setText(f.getNombre());

            ArrayAdapter<String> adapSpinner = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,f.getPosiciones());
            adapSpinner.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
            posicion.setVisibility(View.VISIBLE);
            posicion.setAdapter(adapSpinner);


        }else {

            baloncestista b = (baloncestista) o;
            foto.setImageResource(b.getFoto());
            nombre.setText(b.getNombre());
            posicion.setVisibility(View.INVISIBLE);
        }
    }
}
