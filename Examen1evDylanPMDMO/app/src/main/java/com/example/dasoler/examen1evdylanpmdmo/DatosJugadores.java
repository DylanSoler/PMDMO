package com.example.dasoler.examen1evdylanpmdmo;

import java.util.ArrayList;

public class DatosJugadores {


    public static ArrayList<Object> rellenarListado(){

        ArrayList<Object> listado = new ArrayList<>();

        ArrayList<String> pos = new ArrayList<String>();

        pos.add("mediapunta");
        pos.add("centrocampista");
        listado.add(new futbolista("De Bruyne", R.drawable.kevin_de_bruyne_f, pos));
        pos.add("extremoIzquierdo");
        listado.add(new futbolista("Coutinho", R.drawable.generico, pos));
        listado.add(new baloncestista("Pau Gasol",R.drawable.pau_gasol_b,10,8,8));
        pos.clear();
        pos.add("delantero");
        listado.add(new futbolista("Lukaku", R.drawable.romelu_lukaku_f, pos));
        listado.add(new baloncestista("Marc Gasol",R.drawable.marc_gasol_b,9,10,8));
        listado.add(new baloncestista("Lebron James",R.drawable.lebron_james_b,14,12,10));
        pos.add("extremoIzquierdo");
        listado.add(new futbolista("Salah", R.drawable.generico, pos));
        pos.add("mediapunta");
        listado.add(new futbolista("Messi", R.drawable.generico, pos));
        listado.add(new baloncestista("Navarro",R.drawable.generico,8,12,6));
        listado.add(new futbolista("Griezzman", R.drawable.generico, pos));
        pos.clear();
        pos.add("extremoDerecho");
        pos.add("mediapunta");
        listado.add(new futbolista("Joaquin", R.drawable.generico, pos));

        return listado;
    }
}
