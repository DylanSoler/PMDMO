package com.example.dasoler.intentcamara;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView iv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = (ImageView) findViewById(R.id.imgVFoto);
        btn = (Button) findViewById(R.id.btnCamara);

        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent intCamara = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intCamara,1);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap imagen = (Bitmap) data.getExtras().get("data");
        iv.setImageBitmap(imagen);
    }
}
