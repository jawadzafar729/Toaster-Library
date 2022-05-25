package com.test.toastlib

import android.content.Context
import android.widget.Toast

object ToastMsg {
    fun showMyToast(context: Context, msg:String){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}