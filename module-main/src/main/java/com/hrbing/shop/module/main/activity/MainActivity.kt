package com.hrbing.shop.module.main.activity

import android.os.Bundle
import android.view.View
import com.hrbing.shop.core.base.activity.BaseActivity
import com.hrbing.shop.module.main.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author ...
 */
class MainActivity : BaseActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appTitle.setOnClickListener(this)
        appTitle.text = "加载个人信息页面"
    }

    override fun onClick(v: View?) {
    }
}
