package com.example.monster.facerecognitiontest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import org.opencv.android.CameraRenderer;

public class MainActivity extends AppCompatActivity {

    static{
        System.loadLibrary("opencv_java3");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
}
