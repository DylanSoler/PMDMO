package com.example.dasoler.examen1evdylanpmdmo;

import android.os.Parcel;
import android.os.Parcelable;


import java.util.ArrayList;

public class futbolista implements Parcelable {

    private String nombre;
    private int foto;
    private ArrayList<String> posiciones;

    public futbolista(String nombre, int foto, ArrayList<String> posiciones) {
        this.nombre = nombre;
        this.foto = foto;
        this.posiciones = posiciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public ArrayList<String> getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(ArrayList<String> posiciones) {
        this.posiciones = posiciones;
    }


    @Override
    public int describeContents() {
          return 0;
     }

     @Override
      public void writeToParcel(Parcel dest, int flags) {
         dest.writeString(this.nombre);
         dest.writeInt(this.foto);
         dest.writeStringList(this.posiciones);
                                        }

      protected futbolista(Parcel in) {
                                       this.nombre = in.readString();
                                       this.foto = in.readInt();
                                       this.posiciones = in.createStringArrayList();
                                        }

       public static final Creator<futbolista> CREATOR = new Creator<futbolista>() {
          @Override
           public futbolista createFromParcel(Parcel source) {
             return new futbolista(source);
               }

           @Override
            public futbolista[] newArray(int size) {
               return new futbolista[size];
                }

    };
}
