package com.example.nitropc.fragmentprueba;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class ViewModelOpcion extends ViewModel {


    private MutableLiveData<Integer> opcion;

    public MutableLiveData<Integer> getOpcion() {

        if(opcion == null) {
            opcion = new MutableLiveData<>();
        }

        return opcion;
    }


}
