package com.example.dasoler.listviewdinamic;

import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;


public class MainActivity extends ListActivity {

    private static final Equipo betis = new Equipo(R.drawable.betis,"Betis");
    private static final Equipo barca = new Equipo(R.drawable.barca,"Barca");
    private static final Equipo atletico = new Equipo(R.drawable.atletico,"Atletico");
    private static final Equipo villarreal = new Equipo(R.drawable.villarreal, "Villarreal");
    private static final Equipo valencia = new Equipo(R.drawable.valencia, "Valencia");
    private static final Equipo madrid = new Equipo(R.drawable.madrid, "Madrid");

    private static final ArrayList<Equipo> equipos = new ArrayList<Equipo>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        equipos.add(betis);
        equipos.add(barca);
        equipos.add(atletico);
        equipos.add(villarreal);
        equipos.add(valencia);
        equipos.add(madrid);


        setListAdapter(new IconicAdapter<Equipo>(this, R.layout.row, R.id.tVrow,equipos));

    }

    class IconicAdapter<T> extends ArrayAdapter<T> {
        IconicAdapter( Context c, int resourceId, int textId, ArrayList objects ) {
            super(c, resourceId, textId, objects);
        }

        public View getView(int position, View convertView,
                            ViewGroup parent) {

            View row = convertView;

            if (row==null){
                LayoutInflater inflater=getLayoutInflater();
                row=inflater.inflate(R.layout.row, parent, false);
            }

            TextView tVrow = (TextView) row.findViewById(R.id.tVrow);
            tVrow.setText(equipos.get(position).getNombre());

            ImageView iVrow=(ImageView)row.findViewById(R.id.iVrow);
            iVrow.setImageResource(equipos.get(position).getEscudo());


            return(row);
        }
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        Intent intent = new Intent(this,DescripcionEquipos.class);
        intent.putExtra("nombreEquipo", equipos.get(position).getNombre());
        startActivity(intent);
    }
}
