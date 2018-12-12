package com.example.dasoler.cambiarimagenporotra;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imgV;
    int alt2 = R.drawable.alt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgV = (ImageView) findViewById(R.id.imageView);

        imgV.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(imgV.getTag() == "alt1") {
            imgV.setImageResource(R.drawable.alt2);
            imgV.setTag("alt2");}
        else {
            imgV.setImageResource(R.drawable.alt);
            imgV.setTag("alt1");}

    }
}
