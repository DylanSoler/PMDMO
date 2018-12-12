package com.example.dasoler.examen1evdylanpmdmo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    //listado de jugadores
    ArrayList<Object> jugadores;
    ListView lvJugadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvJugadores = (ListView)findViewById(R.id.lvJUgadores);

        lvJugadores.setOnItemClickListener(this);

        //rellenar arraylist jugadores con el listado devuelto de DatosJugadores
        jugadores = DatosJugadores.rellenarListado();

        //asignar adaptador
        lvJugadores.setAdapter(new JugAdapter(this, jugadores));
    }

    //adaptador personalizado
    class JugAdapter extends BaseAdapter {

        private Context context; //context
        private ArrayList<Object> jugadores; //data source of the list adapter

        //public constructor
        public JugAdapter(Context context, ArrayList<Object> items) {
            this.context = context;
            this.jugadores = items;
        }

        @Override
        public int getCount() {
            return jugadores.size(); //returns total of items in the list
        }

        @Override
        public Object getItem(int position) {
            return jugadores.get(position); //returns list item at the specified position
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public int getViewTypeCount() {
            return 2;
        }

        //Devuelve el tipo de cada item, 0 si es futbolista, 1 si es baloncestista
        @Override
        public int getItemViewType(int position) {
            int type;
            if (jugadores.get(position) instanceof futbolista) {
                type = 0;
            } else {
                type = 1;
            }

            return type;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View row = convertView;
            //ViewHolder futbolistas
            ViewHolderF holderF;
            //ViewHolder baloncestistas
            ViewHolderB holderB;

            //rowfutbolistas
            TextView tvNombreF;
            TextView tvPosicionF;
            ImageView ivF;
            //rowbaloncestistas
            TextView tvNombreB;
            TextView tvPtosB;
            TextView tvRebB;
            TextView tvAsisB;
            ImageView ivB;


            if (row == null) {
                LayoutInflater inflater = getLayoutInflater();

                //Si es futbolista
                if (getItemViewType(position) == 0) {
                    row = inflater.inflate(R.layout.rowfutbolistas, parent, false);

                    tvNombreF = (TextView) row.findViewById(R.id.tvNombreF);
                    tvPosicionF = (TextView) row.findViewById(R.id.tvPosicionF);
                    ivF = (ImageView) row.findViewById(R.id.ivFotoF);
                    holderF = new ViewHolderF(tvNombreF,tvPosicionF,ivF);
                    row.setTag(holderF);

                } else { //Si es baloncestista
                    row = inflater.inflate(R.layout.rowbaloncestistas, parent, false);

                    tvNombreB = (TextView) row.findViewById(R.id.tvNombreB);
                    tvPtosB = (TextView) row.findViewById(R.id.tvPuntosB);
                    tvRebB = (TextView) row.findViewById(R.id.tvRebotesB);
                    tvAsisB = (TextView) row.findViewById(R.id.tvAsisB);
                    ivB = (ImageView) row.findViewById(R.id.ivFotoB);
                    holderB = new ViewHolderB(tvNombreB,tvPtosB,tvRebB,tvAsisB,ivB);
                    row.setTag(holderB);
                }
            }

            //Rellenamos ViewHolder del item con sus datos segun si es futbolista o baloncestista
            if (getItemViewType(position) == 0) {
                holderF = (ViewHolderF) row.getTag();
                holderF.getLabNombre().setText(((futbolista) jugadores.get(position)).getNombre());
                holderF.getLabPosicion().setText(((futbolista) jugadores.get(position)).getPosiciones().get(0));
                holderF.getImg().setImageResource(((futbolista) jugadores.get(position)).getFoto());
            } else {
                holderB = (ViewHolderB) row.getTag();
                holderB.getImgB().setImageResource(((baloncestista) jugadores.get(position)).getFoto());
                holderB.getLabNombre().setText(((baloncestista) jugadores.get(position)).getNombre());
                holderB.getLabPuntos().setText(((baloncestista) jugadores.get(position)).getPuntoPorPartido());
                holderB.getLabRebotes().setText(((baloncestista) jugadores.get(position)).getRebotesPorPartido());
                holderB.getLabAsis().setText(((baloncestista) jugadores.get(position)).getAsistenciasPorPartido());
            }

            return (row);

        }
    }
    //ViewHolder futbolistas (rowfutbolistas)
    class ViewHolderF {
        TextView tvN;
        TextView tvP;
        ImageView ivF;

        ViewHolderF(TextView tv, TextView tv2, ImageView iv) {
            this.tvN = tv;
            this.tvP = tv2;
            this.ivF = iv;
        }

        public TextView getLabNombre() {
            return this.tvN;
        }

        public TextView getLabPosicion() {
            return this.tvP;
        }

        public ImageView getImg() {
            return this.ivF;
        }
    }

    //ViewHolder baloncestistas (rowbaloncestistas)
    class ViewHolderB {

        TextView tvN;
        TextView tvP;
        TextView tvR;
        TextView tvA;
        ImageView ivFoto;

        ViewHolderB(TextView tvNombre, TextView tvPtos, TextView tvReb, TextView tvAsis, ImageView ivFoto) {
            this.tvN = tvNombre;
            this.tvP = tvPtos;
            this.tvR = tvReb;
            this.tvA = tvAsis;
            this.ivFoto = ivFoto;
        }

        public TextView getLabNombre() {
            return this.tvN;
        }

        public TextView getLabPuntos() {
            return this.tvP;
        }

        public TextView getLabRebotes() {
            return this.tvR;
        }

        public TextView getLabAsis() { return this.tvA; }

        public ImageView getImgB() { return this.ivFoto; }
    }

    //metodo activo cuando se pulsa un item, abrira la actividad Detalles, que contiene los
    //detalles de dicho jugador con la posiblidad de editarlos, y borrar al jugador
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


        if(jugadores.get(i) instanceof futbolista){

            futbolista f = (futbolista)jugadores.get(i);
            Intent ifut = new Intent(this,Detalles.class);
            ifut.putExtra("jugador",f);
            startActivity(ifut);
        }
        else {

            baloncestista b= (baloncestista) jugadores.get(i);
            Intent ib = new Intent(this,Detalles.class);
            ib.putExtra("jugador",b);
            startActivity(ib);
        }

    }
}

