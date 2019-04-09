package com.cxyzy.demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private val tag = MainActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        log(tag, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener { startActivity(Intent(this, SecondActivity::class.java)) }
    }

    override fun onStart() {
        log(tag, "onStart")
        super.onStart()
    }

    override fun onResume() {
        log(tag, "onResume")
        super.onResume()
    }

    override fun onPause() {
        log(tag, "onPause")
        super.onPause()
    }

    override fun onStop() {
        log(tag, "onStop")
        super.onStop()
    }

    override fun onDestroy() {
        log(tag, "onDestroy")
        super.onDestroy()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        log(tag, "onSaveInstanceState")
        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        log(tag, "onRestoreInstanceState")
        super.onRestoreInstanceState(savedInstanceState)
    }
}
