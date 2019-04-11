package com.cxyzy.demo2

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_a.*

class AActivity : BaseActivity() {
    override var tag = AActivity::class.java.simpleName

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
        button.setOnClickListener { startActivity(Intent(this, BActivity::class.java)) }
    }

}
