package com.example.dasoler.sudokaso;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.content.Context;

import com.example.dasoler.sudokaso.room.Numero;
import com.example.dasoler.sudokaso.room.SudokuDatabase;
import com.example.dasoler.sudokaso.room.SudokuRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

public class ViewModelActivity2 extends ViewModel
{
    //Propiedades privadas
    private MutableLiveData<List<Numero>> sudokuEnJuego;

    private MutableLiveData<Integer> opcion;

    private MutableLiveData<Boolean> guardar;

    private int[]solucionSudoku1 = {3,6,2,5,1,7,8,4,9,7,8,5,4,9,6,3,1,2,1,9,4,2,8,3,7,5,6,5,7,1,6,3,2,4,9,8,6,4,9,8,7,1,5,2,3,8,2,3,9,5,4,1,6,7,4,3,7,1,2,9,6,8,5,9,1,8,7,6,5,2,3,4,2,5,6,3,4,8,9,7,1};


    //Propiedades publicas
    public MutableLiveData<Integer> getOpcion() {

        if(opcion == null) {
            opcion = new MutableLiveData<>();
        }

        return opcion;
    }

    public MutableLiveData<List<Numero>> getSudokuEnJUego() {

        if(sudokuEnJuego == null) {
            sudokuEnJuego = new MutableLiveData<>();
        }

        return sudokuEnJuego;
    }

    public MutableLiveData<Boolean> getGuardar() {

        if(guardar == null) {
            guardar = new MutableLiveData<>();
        }

        return guardar;
    }

    public int[] getSolucionSudoku1() {
        return solucionSudoku1;
    }

    public void setSolucionSudoku1(int[] solucionSudoku1) {
        this.solucionSudoku1 = solucionSudoku1;
    }
}
