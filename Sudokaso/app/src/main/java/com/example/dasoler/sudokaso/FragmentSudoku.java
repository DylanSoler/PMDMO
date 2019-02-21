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

public class FragmentSudoku extends Fragment  {

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

        ed = (EditText) getActivity().findViewById(R.id.edCelda);

        //ed.addTextChangedListener(tw);
    }


    @Override
    public void onStop() {
        super.onStop();
        btn = (Button) getActivity().findViewById(R.id.btnComprobar);
        btn.setVisibility(View.INVISIBLE);

        //vm.getSudokuEnJUego();
    }

    @Override
    public void onPause() {
        super.onPause();

        sudoku = adapter.getItems();
        vm.getSudokuEnJUego().postValue(sudoku);
        vm.getGuardar().postValue(true);
    }
//------------------------------------------------------------------------------------------------------------------
//Probando
    /*TextWatcher tw = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    };*/

//-------------------------------------------------------------------------------------------------------------------
}
