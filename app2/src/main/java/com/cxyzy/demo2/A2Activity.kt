package com.cxyzy.demo2

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class A2Activity : BaseActivity() {
    override var tag = A2Activity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        button.setOnClickListener { startActivity(Intent(this, B2Activity::class.java)) }
    }

}
