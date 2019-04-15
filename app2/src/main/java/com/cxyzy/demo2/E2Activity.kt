package com.cxyzy.demo2

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class E2Activity : BaseActivity() {
    override var tag = E2Activity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e)
        button.setOnClickListener { startActivity(Intent(this, F2Activity::class.java)) }
    }

}
