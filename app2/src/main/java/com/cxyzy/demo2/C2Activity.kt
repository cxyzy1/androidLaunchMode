package com.cxyzy.demo2

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class C2Activity : BaseActivity() {
    override var tag = C2Activity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        button.setOnClickListener { startActivity(Intent(this, D2Activity::class.java)) }
    }

}
