package com.example.nitropc.fragmentprueba;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentBotones extends Fragment implements View.OnClickListener {

    Button btn;
    Button btn2;
    ViewModelOpcion vmopc;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fr_botones, container, false);

        btn = (Button) view.findViewById(R.id.button1);
        btn2 = (Button) view.findViewById(R.id.button2);
        vmopc = ViewModelProviders.of(this).get(ViewModelOpcion.class);

        btn.setOnClickListener(this);
        btn2.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {


        switch (view.getId()){

            case R.id.button1 :

                vmopc.getOpcion().setValue(1);

                break;

            case R.id.button2 :

                vmopc.getOpcion().setValue(2);

                break;

        }

    }
}
