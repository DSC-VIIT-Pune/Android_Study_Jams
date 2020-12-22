package com.sjcoders.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var textView : TextView
    lateinit var buttonAdd : Button
    lateinit var buttonSub : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView = findViewById(R.id.textView)
        buttonAdd = findViewById(R.id.buttonAdd)
        buttonSub = findViewById(R.id.buttonSub)

        var counter = 0

        buttonAdd.setOnClickListener {

            counter++
            textView.text = counter.toString()

        }

        buttonSub.setOnClickListener {

            counter--
            textView.text = counter.toString()

        }


    }
}