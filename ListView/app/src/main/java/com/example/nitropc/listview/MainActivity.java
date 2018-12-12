package com.example.nitropc.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String[] nombres = {"Dylan","Andres","Marina","Angela","Pepe","Paco"};
    ListView listV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listV = (ListView) findViewById(R.id.lview);

        ArrayAdapter adap = new ArrayAdapter<String>(this, R.layout.filas, R.id.txtVitems,nombres);
        listV.setAdapter(adap);

    }
}
