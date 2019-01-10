package com.example.dasoler.sudokaso;

import android.app.ListActivity;
import android.arch.lifecycle.ViewModelProviders;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Main2Activity extends FragmentActivity {

    ViewModelActivity2 vm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //ViewModel
        vm = ViewModelProviders.of(this).get(ViewModelActivity2.class);

        //Poner la lista en el frmLayout
        FragmentTransaction frTrans = getSupportFragmentManager().beginTransaction();

        FragmentListaSudokus frNiveles = new FragmentListaSudokus();

        frTrans.add(R.id.frlayout, frNiveles);
        frTrans.addToBackStack(null);

        frTrans.commit();


        //Cuando cambia la opcion (observer)


        //Control resoluciones
        /*if(findViewById(R.id.frlayoutsudoku)==null){

            if (savedInstanceState != null) {
                return;
            }

            //Resolucion pequenia
        } else {

            //Resolucion grande
        }*/
    }
}
