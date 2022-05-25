package com.test.toasterlib

import android.content.Context
import android.widget.Toast

object ToasterMsg {

    fun msg(context: Context, msg: String){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}