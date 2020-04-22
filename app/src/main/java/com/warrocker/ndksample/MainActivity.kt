package com.warrocker.ndksample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView1.text = "number from .so is \"" + numberFromLibrary() + "\""
    }

    /**
     * number-utils
     */
    external fun numberFromLibrary(): String

    companion object {
        init {
            /**
             * .so wrapper
             */
            System.loadLibrary("number-utils")
        }
    }
}
