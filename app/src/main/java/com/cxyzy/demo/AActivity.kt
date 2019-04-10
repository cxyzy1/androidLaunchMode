package com.cxyzy.demo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_a.*

class AActivity : AppCompatActivity() {
    private val tag = AActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        log(tag, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        button.setOnClickListener { startActivity(Intent(this, BActivity::class.java)) }

    }

    override fun onDestroy() {
        log(tag, "onDestroy")
        super.onDestroy()
    }

}
