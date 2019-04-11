package com.cxyzy.demo

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class CActivity : BaseActivity() {
    override var tag = CActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        button.setOnClickListener { startActivity(Intent(this, DActivity::class.java)) }
    }

}
