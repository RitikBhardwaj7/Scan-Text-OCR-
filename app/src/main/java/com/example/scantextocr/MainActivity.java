package com.example.scantextocr;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.view.Window;
import android.widget.Button;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private final int  CAMERA_REQ_CODE = 100;
    ImageView imgCamera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        ImageView imgCamera = findViewById(R.id.imgCamera);
        Button capture = findViewById(R.id.capture);



        }
    }
