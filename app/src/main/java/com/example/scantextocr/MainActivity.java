package com.example.scantextocr;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
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
        setContentView(R.layout.activity_main);

        ImageView imgCamera = findViewById(R.id.imgCamera);
        Button btnCamera = findViewById(R.id.btnCamera);

        btnCamera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent iCamera = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(iCamera, CAMERA_REQ_CODE );
            }

        });


        }
    }
}