package com.cxyzy.demo

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_a.*

class FActivity : BaseActivity() {
 override var tag = FActivity::class.java.simpleName
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f)
        button.setOnClickListener { startActivity(Intent(this, CActivity::class.java)) }
    }
}
