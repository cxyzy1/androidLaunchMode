package com.cxyzy.demo

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_a.*

class DActivity : BaseActivity() {
    override var tag = DActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
        button.setOnClickListener { startActivity(Intent(this, EActivity::class.java)) }
    }
}
