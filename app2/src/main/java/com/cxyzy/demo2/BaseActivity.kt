package com.cxyzy.demo2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    open var tag = BaseActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        log(tag, "onCreate,taskId:${this.taskId}")
        super.onCreate(savedInstanceState)
    }

    override fun onDestroy() {
        log(tag, "onDestroy,taskId:${this.taskId}")
        super.onDestroy()
    }

}