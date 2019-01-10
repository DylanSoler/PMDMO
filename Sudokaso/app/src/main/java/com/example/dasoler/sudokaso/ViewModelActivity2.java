package com.example.dasoler.sudokaso;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class ViewModelActivity2 extends ViewModel
{

    private MutableLiveData<Integer> opcion;

    public MutableLiveData<Integer> getOpcion() {

        if(opcion == null) {
            opcion = new MutableLiveData<>();
        }

        return opcion;
    }

}
