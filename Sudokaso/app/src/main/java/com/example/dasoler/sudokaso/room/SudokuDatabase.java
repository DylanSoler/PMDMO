package com.example.dasoler.sudokaso.room;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.room.Database;
import android.arch.persistence.room.OnConflictStrategy;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.TypeConverters;
import android.content.ContentValues;
import android.content.Context;
import android.support.annotation.NonNull;

@Database(entities = {Numero.class}, version = 1)
public abstract class SudokuDatabase extends RoomDatabase {

    public abstract DaoNumeros DaoNumeros();

    private static SudokuDatabase INSTANCE;

    public static SudokuDatabase getDatabase(final Context context) {

        RoomDatabase.Callback dbCallback = new Callback() {
            @Override
            public void onCreate(@NonNull SupportSQLiteDatabase db) {
                super.onCreate(db);

                ContentValues cv = new ContentValues();

                //sudoku level 1
                //fila 1
                cv.put("sudoku",1);cv.put("fila",1);cv.put("columna",1);cv.put("num",3);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",1);cv.put("columna",2);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",1);cv.put("columna",3);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",1);cv.put("columna",4);cv.put("num",5);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",1);cv.put("columna",5);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",1);cv.put("columna",6);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",1);cv.put("columna",7);cv.put("num",8);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",1);cv.put("columna",8);cv.put("num",4);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",1);cv.put("columna",9);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                //fila 2
                cv.put("sudoku",1);cv.put("fila",2);cv.put("columna",1);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",2);cv.put("columna",2);cv.put("num",8);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",2);cv.put("columna",3);cv.put("num",5);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",2);cv.put("columna",4);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",2);cv.put("columna",5);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",2);cv.put("columna",6);cv.put("num",6);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",2);cv.put("columna",7);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",2);cv.put("columna",8);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",2);cv.put("columna",9);cv.put("num",2);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                //fila 3
                cv.put("sudoku",1);cv.put("fila",3);cv.put("columna",1);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",3);cv.put("columna",2);cv.put("num",9);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",3);cv.put("columna",3);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",3);cv.put("columna",4);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",3);cv.put("columna",5);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",3);cv.put("columna",6);cv.put("num",3);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",3);cv.put("columna",7);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",3);cv.put("columna",8);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",3);cv.put("columna",9);cv.put("num",6);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                //fila 4
                cv.put("sudoku",1);cv.put("fila",4);cv.put("columna",1);cv.put("num",5);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",4);cv.put("columna",2);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",4);cv.put("columna",3);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",4);cv.put("columna",4);cv.put("num",6);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",4);cv.put("columna",5);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",4);cv.put("columna",6);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",4);cv.put("columna",7);cv.put("num",4);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",4);cv.put("columna",8);cv.put("num",9);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",4);cv.put("columna",9);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                //fila 5
                cv.put("sudoku",1);cv.put("fila",5);cv.put("columna",1);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",5);cv.put("columna",2);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",5);cv.put("columna",3);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",5);cv.put("columna",4);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",5);cv.put("columna",5);cv.put("num",7);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",5);cv.put("columna",6);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",5);cv.put("columna",7);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",5);cv.put("columna",8);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",5);cv.put("columna",9);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                //fila 6
                cv.put("sudoku",1);cv.put("fila",6);cv.put("columna",1);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",6);cv.put("columna",2);cv.put("num",2);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",6);cv.put("columna",3);cv.put("num",3);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",6);cv.put("columna",4);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",6);cv.put("columna",5);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",6);cv.put("columna",6);cv.put("num",4);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",6);cv.put("columna",7);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",6);cv.put("columna",8);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",6);cv.put("columna",9);cv.put("num",7);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                //fila 7
                cv.put("sudoku",1);cv.put("fila",7);cv.put("columna",1);cv.put("num",4);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",7);cv.put("columna",2);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",7);cv.put("columna",3);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",7);cv.put("columna",4);cv.put("num",1);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",7);cv.put("columna",5);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",7);cv.put("columna",6);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",7);cv.put("columna",7);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",7);cv.put("columna",8);cv.put("num",8);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",7);cv.put("columna",9);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                //fila 8
                cv.put("sudoku",1);cv.put("fila",8);cv.put("columna",1);cv.put("num",9);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",8);cv.put("columna",2);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",8);cv.put("columna",3);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",8);cv.put("columna",4);cv.put("num",7);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",8);cv.put("columna",5);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",8);cv.put("columna",6);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",8);cv.put("columna",7);cv.put("num",2);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",8);cv.put("columna",8);cv.put("num",3);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",8);cv.put("columna",9);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                //fila 9
                cv.put("sudoku",1);cv.put("fila",9);cv.put("columna",1);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",9);cv.put("columna",2);cv.put("num",5);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",9);cv.put("columna",3);cv.put("num",6);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",9);cv.put("columna",4);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",9);cv.put("columna",5);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",9);cv.put("columna",6);cv.put("num",8);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",9);cv.put("columna",7);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",9);cv.put("columna",8);cv.put("num",0);cv.put("editable",1);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);
                cv.put("sudoku",1);cv.put("fila",9);cv.put("columna",9);cv.put("num",1);cv.put("editable",0);
                db.insert("Numero", OnConflictStrategy.IGNORE,cv);

            }
        };

        if(INSTANCE == null) {
             synchronized (SudokuDatabase.class) {
                if(INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            SudokuDatabase.class,"sudoku_database.db")
                            .allowMainThreadQueries()
                            .addCallback(dbCallback)
                            .build();
                }
            }
        }
        return INSTANCE;
    }


}
