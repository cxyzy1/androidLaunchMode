package com.cxyzy.demo2

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class D2Activity : BaseActivity() {
    override var tag = D2Activity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
        button.setOnClickListener { startActivity(Intent(this, E2Activity::class.java)) }
    }
}
