package com.cxyzy.demo

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_a.*

class EActivity : BaseActivity() {
    override var tag = EActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e)
        button.setOnClickListener { startActivity(Intent(this, FActivity::class.java)) }
    }

}
