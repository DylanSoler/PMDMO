package com.example.dasoler.sumarvalores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    EditText et1,et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 = (EditText) findViewById(R.id.valor1);
        et2 = (EditText) findViewById(R.id.valor2);
        Button btnSumar = (Button) findViewById(R.id.btnsumar);
        final TextView resultadoSuma = (TextView) findViewById(R.id.resultado);

        btnSumar.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              int aux1 = Integer.valueOf(et1.getText().toString());
              int aux2 = Integer.valueOf(et2.getText().toString());
              int result = aux1 + aux2;
              resultadoSuma.setText(""+result);
          }
        });
    }
}
