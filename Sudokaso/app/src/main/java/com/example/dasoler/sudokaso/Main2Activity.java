package com.example.dasoler.sudokaso;

import android.app.ListActivity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.dasoler.sudokaso.room.Numero;
import com.example.dasoler.sudokaso.room.SudokuDatabase;
import com.example.dasoler.sudokaso.room.SudokuRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;

public class Main2Activity extends FragmentActivity {

    ViewModelActivity2 vm;
    Button btnComprobar;

    List<Numero> nums;
    SudokuRepository rep = new SudokuRepository();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        btnComprobar = (Button) findViewById(R.id.btnComprobar);

        //ViewModel
        vm = ViewModelProviders.of(this).get(ViewModelActivity2.class);

        //Insertar listfragment
        FragmentTransaction frTrans = getSupportFragmentManager().beginTransaction();
        FragmentListaSudokus frNiveles = new FragmentListaSudokus();
        frTrans.add(R.id.frlayout, frNiveles);
        //frTrans.addToBackStack(null);
        frTrans.commit();


        //observer de opcion
        final Observer<Integer> opcionObserver = new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer integer) {

                if(findViewById(R.id.frlayoutsudoku)==null){

                    //Resolucion pequeña
                            FragmentTransaction frTrans = getSupportFragmentManager().beginTransaction();
                            FragmentSudoku frSudokuPrueba = new FragmentSudoku();

                            frTrans.replace(R.id.frlayout, frSudokuPrueba);
                            frTrans.addToBackStack(null);

                            frTrans.commit();

                            //nums = rep.obtenerSudoku(getApplicationContext(),1);

                            vm.getSudokuEnJUego().postValue(rep.obtenerSudoku(getApplicationContext(),vm.getOpcion().getValue()));

                } else {

                    //Resolucion grande
                            FragmentTransaction frTrans = getSupportFragmentManager().beginTransaction();
                            FragmentSudoku frSudokuPrueba = new FragmentSudoku();

                            frTrans.replace(R.id.frlayoutsudoku, frSudokuPrueba);
                            frTrans.addToBackStack(null);

                            frTrans.commit();

                }
            }
        };

        vm.getOpcion().observe(this,opcionObserver);

    }

}
