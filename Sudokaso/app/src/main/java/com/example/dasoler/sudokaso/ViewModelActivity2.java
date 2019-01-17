package com.example.dasoler.sudokaso;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

import java.util.List;

public class ViewModelActivity2 extends ViewModel
{

    private List<Integer> sudokuEnJuego;

    private List<Integer> sudokuResuelto;

    private List<Integer> sudokuUsuario;

    private MutableLiveData<Integer> opcion;

    public MutableLiveData<Integer> getOpcion() {

        if(opcion == null) {
            opcion = new MutableLiveData<>();
        }

        return opcion;
    }

    public List<Integer> getSudokuEnJuego() {
        return sudokuEnJuego;
    }

    public void setSudokuEnJuego(List<Integer> sudokuEnJuego) {
        this.sudokuEnJuego = sudokuEnJuego;
    }

    public List<Integer> getSudokuResuelto() {
        return sudokuResuelto;
    }

    public void setSudokuResuelto(List<Integer> sudokuResuelto) {
        this.sudokuResuelto = sudokuResuelto;
    }
}
