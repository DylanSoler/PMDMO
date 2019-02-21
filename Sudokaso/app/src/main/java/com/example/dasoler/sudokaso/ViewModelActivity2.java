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

}
