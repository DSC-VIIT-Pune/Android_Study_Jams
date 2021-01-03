package com.example.timer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var timerText : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.i("onCreate called!")

        timerText = findViewById(R.id.textTimer)

        val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // Observing ViewModel's LiveData
        viewModel.seconds.observe(this) { newTime ->
            timerText.text = newTime
            Timber.i(newTime)
        }

    }

    override fun onStart() {
        super.onStart()
        Timber.i("onStart called!")
    }

    override fun onRestart() {
        super.onRestart()
        Timber.i("onRestart called!")
    }

    override fun onResume() {
        super.onResume()
        Timber.i("onResume called!")
    }

    override fun onPause() {
        super.onPause()
        Timber.i("onPause called!")
    }

    override fun onStop() {
        super.onStop()
        Timber.i("onStop called!")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.i("onDestroy called!")
    }

}