package com.example.dasoler.listviewvm;

import android.app.ListActivity;
import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    MiViewModel mVM;
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mVM = ViewModelProviders.of(this).get(MiViewModel.class);

        lv = (ListView) findViewById(R.id.list);

        lv.setAdapter(new IconicAdapter<Equipo>(this, R.layout.row, R.id.tVrow, mVM.getEquipos()));
        
    }


    class IconicAdapter<T> extends ArrayAdapter<T> {
        IconicAdapter(Context c, int resourceId, int textId, ArrayList objects ) {
            super(c, resourceId, textId, objects);
        }

        public View getView(int position, View convertView,
                            ViewGroup parent) {

            View row = convertView;

            if (row==null){
                LayoutInflater inflater=getLayoutInflater();
                row=inflater.inflate(R.layout.row, parent, false);
            }

            TextView tVrow = (TextView) row.findViewById(R.id.tVrow);
            tVrow.setText(mVM.getEquipos().get(position).getNombre());

            ImageView iVrow=(ImageView)row.findViewById(R.id.iVrow);
            iVrow.setImageResource(mVM.getEquipos().get(position).getEscudo());


            return(row);
        }
    }


}
