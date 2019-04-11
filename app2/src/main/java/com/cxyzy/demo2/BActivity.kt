package com.cxyzy.demo2

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class BActivity : BaseActivity() {
    override var tag = BActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        val intent = Intent(this, CActivity::class.java)
        button.setOnClickListener { startActivity(intent) }
    }
}
