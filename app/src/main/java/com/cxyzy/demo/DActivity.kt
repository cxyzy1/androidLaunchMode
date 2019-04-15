package com.cxyzy.demo

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_d.*

class DActivity : BaseActivity() {
    override var tag = DActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
        val intent = Intent("devdiv.intent.action.activity4")

        button.setOnClickListener { startActivity(intent) }
    }
}
