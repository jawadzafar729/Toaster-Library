package com.test.mylib

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.test.toasterlib.ToasterMsg

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.button).setOnClickListener {
            ToasterMsg.msg(this, "Custom Msg")
        }
    }
}