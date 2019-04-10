package com.cxyzy.demo

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_a.*

class BActivity : AppCompatActivity() {
    private val tag = BActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        log(tag, "onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        button.setOnClickListener { startActivity(Intent(this, CActivity::class.java)) }
    }
    override fun onDestroy() {
        log(tag, "onDestroy")
        super.onDestroy()
    }


}
