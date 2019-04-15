package com.cxyzy.demo2

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class F2Activity : BaseActivity() {
 override var tag = F2Activity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f)
        button.setOnClickListener { startActivity(Intent(this, C2Activity::class.java)) }
    }
}
