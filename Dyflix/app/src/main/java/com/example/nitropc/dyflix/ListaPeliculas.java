package com.example.nitropc.dyflix;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;

public class ListaPeliculas implements Parcelable {

    private ArrayList<String> peliculas;

    public ListaPeliculas(){

        peliculas = new ArrayList<>();
    }

    public void aniadirPelicula(String peli){

        this.peliculas.add(peli);
    }

    public ArrayList<String> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<String> peliculas) {
        this.peliculas = peliculas;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeStringList(this.peliculas);
    }

    protected ListaPeliculas(Parcel in) {
        this.peliculas = in.createStringArrayList();
    }

    public static final Creator<ListaPeliculas> CREATOR = new Creator<ListaPeliculas>() {
        @Override
        public ListaPeliculas createFromParcel(Parcel source) {
            return new ListaPeliculas(source);
        }

        @Override
        public ListaPeliculas[] newArray(int size) {
            return new ListaPeliculas[size];
        }
    };
}
