package com.hrbing.shop.core.base.application

import android.app.Application
import android.content.Context

class BaseApplication() : Application(){

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }

    override fun onCreate() {
        super.onCreate()
    }
}