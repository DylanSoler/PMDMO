package com.example.dasoler.sudokaso;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.dasoler.sudokaso.room.DaoNumeros;
import com.example.dasoler.sudokaso.room.Numero;
import com.example.dasoler.sudokaso.room.SudokuDatabase;
import com.example.dasoler.sudokaso.room.SudokuRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.Executors;

//implements TextWatcher

public class FragmentSudoku extends Fragment implements View.OnClickListener {

    RecyclerView rv_sudoku;
    MyAdapter adapter;
    List<Numero> sudoku = new ArrayList<Numero>();
    Button btn;
    SudokuRepository rep = new SudokuRepository();
    ViewModelActivity2 vm;
    EditText ed;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //return inflater.inflate(R.layout.prueba, container, false);

        vm = ViewModelProviders.of(getActivity()).get(ViewModelActivity2.class);

        View v = inflater.inflate(R.layout.sudoku,container,false);

        rv_sudoku = (RecyclerView) v.findViewById(R.id.rvSudoku);

        rv_sudoku.setLayoutManager(new GridLayoutManager(this.getActivity(),9));

        vm.getSudokuEnJUego().observe(this, new android.arch.lifecycle.Observer<List<Numero>>() {
            @Override
            public void onChanged(@Nullable List<Numero> numeros) {

                sudoku = numeros;

                adapter = new MyAdapter(getActivity(),sudoku);

                rv_sudoku.setAdapter(adapter);
            }
        });

        return v;
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn = (Button) getActivity().findViewById(R.id.btnComprobar);
        btn.setVisibility(View.VISIBLE);
        btn.setOnClickListener(this);

        ed = (EditText) getActivity().findViewById(R.id.edCelda);

        //ed.addTextChangedListener(tw);
    }


    @Override
    public void onStop() {
        super.onStop();
        btn = (Button) getActivity().findViewById(R.id.btnComprobar);
        btn.setVisibility(View.INVISIBLE);

    }

    @Override
    public void onPause() {
        super.onPause();

        sudoku = adapter.getItems();
        vm.getSudokuEnJUego().postValue(sudoku);
        vm.getGuardar().postValue(true);
    }

    @Override
    public void onClick(View view) {

        sudoku = adapter.getItems();
        Boolean correcto = true;
        int[] solucion = vm.getSolucionSudoku1();
        String text;

        for(int i=0; i<81 && correcto; i++)
        {
            if(sudoku.get(i).getNum()!=solucion[i])
                correcto = false;
        }

        if(correcto)
           text = "Enhorabuena puto";
        else
           text = "No tio, lo siento, fallaste";

        Toast.makeText(getContext(), text, Toast.LENGTH_LONG).show();
    }
}
