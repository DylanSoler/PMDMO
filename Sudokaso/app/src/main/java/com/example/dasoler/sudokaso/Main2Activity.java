package com.example.dasoler.sudokaso;

import android.app.ListActivity;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends FragmentActivity {

    ViewModelActivity2 vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

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
