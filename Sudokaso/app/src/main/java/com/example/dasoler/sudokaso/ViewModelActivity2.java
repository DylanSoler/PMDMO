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

    private MutableLiveData<List<Numero>> sudokuEnJuego;

    private List<Integer> sudokuResuelto1;

    private List<Integer> sudokuUsuario;

    private MutableLiveData<Integer> opcion;

    //------------------------------------------------------------------------------

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

    /*public List<Numero> getSudokuEnJuego() {
        return sudokuEnJuego;
    }

    public void setSudokuEnJuego(List<Numero> sudokuEnJuego) {
        this.sudokuEnJuego = sudokuEnJuego;
    }*/

    public List<Integer> getSudokuResuelto1() {
        return sudokuResuelto1;
    }


}
