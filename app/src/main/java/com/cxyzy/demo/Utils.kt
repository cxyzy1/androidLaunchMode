package com.cxyzy.demo

import android.util.Log

fun log(tag: String, message: String) {
    Log.d(tag, "$message thread name:${Thread.currentThread().name}")
}