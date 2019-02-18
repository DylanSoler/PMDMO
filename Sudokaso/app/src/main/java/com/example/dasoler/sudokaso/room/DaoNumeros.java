package com.example.dasoler.sudokaso.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface DaoNumeros {

    @Update
    public void updateNumero(Numero numero);

    @Query("UPDATE Numero SET num = 0 WHERE sudoku= :sudoku AND editable= 1")
    public void updateSudokuDefault(int sudoku);

    @Query("SELECT * FROM Numero WHERE sudoku = :numSudoku ORDER BY fila,columna")
    public List<Numero> obtenerSudoku(int numSudoku);
}
