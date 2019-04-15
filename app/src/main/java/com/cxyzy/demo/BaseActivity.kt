package com.cxyzy.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cxyzy.demo2.log

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