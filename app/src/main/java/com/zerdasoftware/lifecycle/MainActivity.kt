 package com.zerdasoftware.lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

 class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("onCreate","Worked")
    }

     override fun onStart() {
         super.onStart()
         Log.e("onStart","Worked")
     }

     override fun onResume() {
         super.onResume()
         Log.e("onResume","Worked")
     }

     override fun onPause() {
         super.onPause()
         Log.e("onPause","Worked")
     }

     override fun onStop() {
         super.onStop()
         Log.e("onStop","Worked")
     }

     override fun onDestroy() {
         super.onDestroy()
         Log.e("onDestroy","Worked")
     }

     override fun onRestart() {
         super.onRestart()
         Log.e("onRestart","Worked")
     }
}