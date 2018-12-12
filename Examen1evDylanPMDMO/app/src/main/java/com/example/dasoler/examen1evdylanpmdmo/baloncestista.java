package com.example.dasoler.examen1evdylanpmdmo;

import android.os.Parcel;
import android.os.Parcelable;



public class baloncestista implements Parcelable {

    private String nombre;
    private int foto;
    private int puntoPorPartido;
    private int rebotesPorPartido;
    private int asistenciasPorPartido;

    public baloncestista(String nombre, int foto, int puntoPorPartido, int rebotesPorPartido, int asistenciasPorPartido) {
        this.nombre = nombre;
        this.foto = foto;
        this.puntoPorPartido = puntoPorPartido;
        this.rebotesPorPartido = rebotesPorPartido;
        this.asistenciasPorPartido = asistenciasPorPartido;
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

    public int getPuntoPorPartido() {
        return puntoPorPartido;
    }

    public void setPuntoPorPartido(int puntoPorPartido) {
        this.puntoPorPartido = puntoPorPartido;
    }

    public int getRebotesPorPartido() {
        return rebotesPorPartido;
    }

    public void setRebotesPorPartido(int rebotesPorPartido) {
        this.rebotesPorPartido = rebotesPorPartido;
    }

    public int getAsistenciasPorPartido() {
        return asistenciasPorPartido;
    }

    public void setAsistenciasPorPartido(int asistenciasPorPartido) {
        this.asistenciasPorPartido = asistenciasPorPartido;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.nombre);
        dest.writeInt(this.foto);
        dest.writeInt(this.puntoPorPartido);
        dest.writeInt(this.rebotesPorPartido);
        dest.writeInt(this.asistenciasPorPartido);
    }

    protected baloncestista(Parcel in) {
        this.nombre = in.readString();
        this.foto = in.readInt();
        this.puntoPorPartido = in.readInt();
        this.rebotesPorPartido = in.readInt();
        this.asistenciasPorPartido = in.readInt();
    }

    public static final Creator<baloncestista> CREATOR = new Creator<baloncestista>() {
        @Override
        public baloncestista createFromParcel(Parcel source) {
            return new baloncestista(source);
        }

        @Override
        public baloncestista[] newArray(int size) {
            return new baloncestista[size];
        }
    };
}
