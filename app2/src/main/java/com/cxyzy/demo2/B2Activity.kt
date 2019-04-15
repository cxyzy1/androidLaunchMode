package com.cxyzy.demo2

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class B2Activity : BaseActivity() {
    override var tag = B2Activity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val intent = Intent(this, C2Activity::class.java)
        button.setOnClickListener { startActivity(intent) }
    }
}
