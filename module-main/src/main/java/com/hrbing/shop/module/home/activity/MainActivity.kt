package com.hrbing.shop.module.home.activity

import android.os.Bundle
import android.view.View
import com.hrbing.shop.core.base.activity.BaseActivity
import com.hrbing.shop.module.home.R
import kotlinx.android.synthetic.main.activity_main.*

/**
 * @author ...
 */
class MainActivity : BaseActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appTitle.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
    }
}
