package com.example.nitropc.dyflix;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;


import java.util.ArrayList;

public class Peliculas extends AppCompatActivity implements AdapterView.OnItemClickListener, View.OnClickListener {

    ListView lv;
    ArrayList<String> pelis = new ArrayList<String>();
    ListaPeliculas listadoPendientes = new ListaPeliculas();
    Button btnPeliculasPendientes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peliculas);

        btnPeliculasPendientes = (Button) findViewById(R.id.btnPeliculasPendientes);

        lv = (ListView) findViewById(R.id.lv);

        pelis.add("El retorno del rey");
        pelis.add("Spiderman 1");
        pelis.add("La vida es bella");
        pelis.add("Sin city");
        pelis.add("Pulp fiction");
        pelis.add("Cadena perpetua");
        pelis.add("El imperio contraataca");
        pelis.add("Malditos bastardos");
        pelis.add("El rey leon");
        pelis.add("Deadpool");

        lv.setAdapter(new PeliculasAdapter<String>(this, R.layout.rowpeli, R.id.tvrowPelis,pelis));

        lv.setOnItemClickListener(this);

        btnPeliculasPendientes.setOnClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



        Toast toast1 = Toast.makeText(getApplicationContext(), pelis.get(position).toString()+", se ha añadido a peliculas pendientes", Toast.LENGTH_LONG);
        toast1.setGravity(Gravity.CENTER,100,100 );
        toast1.show();

        listadoPendientes.aniadirPelicula(pelis.get(position));

    }

    @Override
    public void onClick(View v) {

        Intent iPendientes = new Intent(this, PeliculasPendientes.class);
        iPendientes.putExtra("listadoPendientes", listadoPendientes);
        startActivity(iPendientes);
    }


    class PeliculasAdapter<T> extends ArrayAdapter<T> {
        public PeliculasAdapter(Context c, int resourceId, int textId, ArrayList objects) {
            super(c,resourceId,textId,objects);
        }

        public View getView(int position, View convertView,
                            ViewGroup parent) {

            View row = convertView;

            if (row==null){
                LayoutInflater inflater=getLayoutInflater();
                row=inflater.inflate(R.layout.rowpeli, parent, false);
            }

            TextView tVrow = (TextView) row.findViewById(R.id.tvrowPelis);
            tVrow.setText(pelis.get(position));

            return(row);
        }
    }

}
