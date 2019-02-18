package com.example.dasoler.sudokaso.room;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Numero {

    //Propiedades
    @PrimaryKey(autoGenerate=true)
    int id;
    int sudoku;
    int fila;
    int columna;
    int num;
    boolean editable;

    //Getters y setters

    public int getSudoku() {
        return sudoku;
    }

    public void setSudoku(int sudoku) {
        this.sudoku = sudoku;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isEditable() {
        return editable;
    }

    public void setEditable(boolean editable) {
        this.editable = editable;
    }
}
