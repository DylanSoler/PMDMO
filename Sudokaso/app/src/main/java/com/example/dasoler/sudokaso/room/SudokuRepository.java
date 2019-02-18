package com.example.dasoler.sudokaso.room;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class SudokuRepository {

    public void updateNumero(Numero numero, Context context)
    {
        SudokuDatabase.getDatabase(context).DaoNumeros().updateNumero(numero);
    }

    public List<Numero> obtenerSudoku(Context context, int n)
    {
        List<Numero> nums = SudokuDatabase.getDatabase(context).DaoNumeros().obtenerSudoku(n);

        return nums;
    }

    public void reiniciarSudoku(int n, Context context)
    {
        SudokuDatabase.getDatabase(context).DaoNumeros().updateSudokuDefault(n);
    }

}
