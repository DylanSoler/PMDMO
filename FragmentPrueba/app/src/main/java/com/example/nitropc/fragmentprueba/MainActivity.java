package com.example.nitropc.fragmentprueba;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
//import android.arch.lifecycle.ViewModelProviders;


public class MainActivity extends FragmentActivity {

    ViewModelOpcion vmopc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        vmopc = ViewModelProviders.of(this).get(ViewModelOpcion.class);

        FragmentTransaction frTrans = getSupportFragmentManager().beginTransaction();

        FragmentBotones frbtn = new FragmentBotones();

        frTrans.add(R.id.fragBtn, frbtn);
        frTrans.addToBackStack(null);

        frTrans.commit();


        final Observer<Integer> opcionObserver = new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer integer) {

                FragmentTransaction frTrans = getSupportFragmentManager().beginTransaction();

                //Resolucion pequeña
                if(findViewById(R.id.frameLayout)==null) {

                    //Segun la opcion pulsada
                    switch (integer) {
                        case 1:

                            Fragment1 fr1 = new Fragment1();

                            frTrans.replace(R.id.fragBtn, fr1);
                            frTrans.addToBackStack(null);

                            frTrans.commit();

                            break;

                        case 2:

                            Fragment2 fr2 = new Fragment2();

                            frTrans.replace(R.id.fragBtn, fr2);
                            frTrans.addToBackStack(null);

                            frTrans.commit();

                            break;
                    }
                //Resolucion grande
                } else {

                    //Segun la opcion pulsada
                    switch (integer){
                        case 1:

                            Fragment1 fr1= new Fragment1();
                            fr1.setArguments(getIntent().getExtras());

                            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fr1).commit();

                            break;

                        case 2:

                            Fragment2 fr2= new Fragment2();
                            fr2.setArguments(getIntent().getExtras());

                            getSupportFragmentManager().beginTransaction().replace(R.id.frameLayout, fr2).commit();


                            break;
                    }
                }

            }
        };

        vmopc.getOpcion().observe(this,opcionObserver);
    }

    public void modificarOpcion(int opc){

        vmopc.getOpcion().setValue(opc);

    }

}
