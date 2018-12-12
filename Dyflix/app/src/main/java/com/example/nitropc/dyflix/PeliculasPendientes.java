package com.example.nitropc.dyflix;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PeliculasPendientes extends AppCompatActivity {

    ListView lvPendientes;
    ListaPeliculas listadoPendientes = new ListaPeliculas();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peliculas_pendientes);

        listadoPendientes = getIntent().getExtras().getParcelable("listadoPendientes");

        lvPendientes = (ListView) findViewById(R.id.lvPendientes);

        ArrayAdapter<String> adapPendientes = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,listadoPendientes.getPeliculas());

        lvPendientes.setAdapter(adapPendientes);

    }
}
