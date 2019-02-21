package com.example.dasoler.sudokaso;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
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
    //private MyEditTextLIstener lIstener;


    //Constructor
    public MyAdapter(Context c, List<Numero> num)
    {
        contxt = c;
        numeros = num;
        //lIstener = new MyEditTextLIstener();
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

        Object num = numeros.get(i).getNum();

        /*if((int)num!=0) {
            viewHolder.edt.setText(num.toString());
            viewHolder.edt.setEnabled(false); }
        else {
            viewHolder.edt.setText("");
            viewHolder.edt.addTextChangedListener(new MyEditTextLIstener(i));
        }*/
        if(!numeros.get(i).isEditable()) {
            viewHolder.edt.setText(num.toString());
            viewHolder.edt.setEnabled(false); }
        else {
            if((int)num == 0) {
                viewHolder.edt.setText("");
                viewHolder.edt.addTextChangedListener(new MyEditTextLIstener(i));}
            else {
                viewHolder.edt.setText(num.toString());
                viewHolder.edt.addTextChangedListener(new MyEditTextLIstener(i));
            }
        }
    }

    @Override
    public int getItemCount() {
        return numeros.size();
    }

    public List<Numero> getItems(){
        return numeros;
    }

    //ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder{

        public EditText edt;

        public ViewHolder(View itemView){

            super(itemView);
            edt = (EditText) itemView.findViewById(R.id.edCelda);
        }
    }

    //MyEditTextListener
    public class MyEditTextLIstener implements TextWatcher
    {
        private int position;

        public MyEditTextLIstener(int position){
            this.position = position;
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            String s = charSequence.toString();

            if(!s.equals(""))
             numeros.get(position).setNum(Integer.parseInt(s));
            else
             numeros.get(position).setNum(0);
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    }

}
