package com.example.dasoler.listviewvm;

import android.arch.lifecycle.ViewModel;

import java.util.ArrayList;

public class MiViewModel extends ViewModel{

    //Propiedades
    private ArrayList<Equipo> equipos;


    //Getters y Setters
    public ArrayList<Equipo> getEquipos() {

        if(equipos==null)
        {
            rellenarDatos();
        }

        return equipos;
    }


    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }


    //Metodo rellenar datos
    private void rellenarDatos(){

        ArrayList<Equipo> eq = new ArrayList<Equipo>();
        eq.add(new Equipo(R.drawable.betis, "Betis"));
        eq.add(new Equipo(R.drawable.barca, "Barca"));
        eq.add(new Equipo(R.drawable.atletico, "Atletico"));
        eq.add(new Equipo(R.drawable.villarreal, "Villarreal"));
        eq.add(new Equipo(R.drawable.valencia, "Valencia"));
        eq.add(new Equipo(R.drawable.madrid, "Madrid"));

        setEquipos(eq);

    }

}
