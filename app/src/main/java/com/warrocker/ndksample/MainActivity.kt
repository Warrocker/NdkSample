package com.warrocker.ndksample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView1.text = "encodeString is \"" + encodeString("String to encode") + "\""
        textView2.text = "number from .so is \"" + numberFromLibrary() + "\""
    }

    /**
     * string-utils
     */
    external fun encodeString(input: String): String

    /**
     * number-utils
     */
    external fun numberFromLibrary(): String

    companion object {
        init {
            /**
             * Local library
             */
            System.loadLibrary("string-utils")
            /**
             * .so wrapper
             */
            System.loadLibrary("number-utils")
        }
    }
}
