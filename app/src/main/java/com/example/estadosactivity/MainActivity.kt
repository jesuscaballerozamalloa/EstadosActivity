package com.example.estadosactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private  val tag: String="INF-STATE";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(tag, "MainActivity-->onCreate")
    }
    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main)
        Log.i(tag, "MainActivity-->onStart")
    }

    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
        Log.i(tag, "MainActivity-->onResume")
    }
    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
        Log.i(tag, "MainActivity-->onPause")
    }
    override fun onStop() {
        super.onStop()
        setContentView(R.layout.activity_main)
        Log.i(tag, "MainActivity-->onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        setContentView(R.layout.activity_main)
        Log.i(tag, "MainActivity-->onDestroy")
    }

}