package com.hrbing.shop.module.main.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.hrbing.shop.core.base.activity.BaseActivity
import com.hrbing.shop.module.main.R
import kotlinx.android.synthetic.main.activity_welcome.*

/**
 * @author ...
 */
class WelcomeActivity : BaseActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        appTitle.text = "加载main页面"
        appTitle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        startActivityForResult(Intent(this,MainActivity::class.java),100)
    }
}
