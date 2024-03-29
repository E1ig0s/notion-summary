package com.example.notion_summary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.opencv.android.OpenCVLoader

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        OpenCVLoader.initDebug()

        Log.d("Test", OpenCVLoader.OPENCV_VERSION);

    }
}