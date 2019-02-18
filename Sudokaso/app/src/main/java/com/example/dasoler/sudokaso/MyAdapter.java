package com.example.dasoler.sudokaso;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.dasoler.sudokaso.room.Numero;

import java.security.PublicKey;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>
{

    private List<Numero> numeros;
    private Context contxt;


    //Constructor
    public MyAdapter(Context c, List<Numero> num)
    {
        contxt = c;
        numeros = num;
    }


    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //View view = new EditText(parent.getContext());
        View view= LayoutInflater.from(contxt).inflate(R.layout.celdaeditable,parent,false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder viewHolder, int i) {

        //viewHolder.edt.setText(numeros.get(i).toString());
        Object num = numeros.get(i).getNum();

        if((int)num!=0) {
            viewHolder.edt.setText(num.toString());
            viewHolder.edt.setEnabled(false);}
        else
            viewHolder.edt.setText("");
    }

    @Override
    public int getItemCount() {
        return numeros.size();
    }

    //ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public EditText edt;

        public ViewHolder(View itemView){

            super(itemView);
            edt = (EditText) itemView.findViewById(R.id.edCelda);
        }
    }
}
