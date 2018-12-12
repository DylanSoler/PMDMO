package com.example.dasoler.listviewdinamic;

import android.media.Image;
import android.widget.ImageView;

public class Equipo {

    //Propiedades
    private int escudo;
    private String nombre;


    //Constructor
    public Equipo(int escudo, String nombre){

        this.escudo=escudo;
        this.nombre=nombre;
    }


    //Getters y Setters
    public int getEscudo() {
        return escudo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEscudo(int escudo) {
        this.escudo = escudo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
