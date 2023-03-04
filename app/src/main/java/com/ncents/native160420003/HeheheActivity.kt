package com.ncents.native160420003

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hehehe.*

class HeheheActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hehehe)

        button2.setOnClickListener {
            var counter: Int = counterText.text.toString().toInt()
            counter += 1
            counterText.setText(counter.toString())
        }
    }
}