package com.hrbing.shop.core.ui.view

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.R
import androidx.appcompat.widget.Toolbar

/**
 * @author ...
 */
class AppToolBar(context: Context,
                 attr: AttributeSet?,
                 defStyleAttr: Int) : Toolbar(context, attr, defStyleAttr) {

    constructor(context: Context, attr: AttributeSet? = null) : this(context, attr, R.attr.toolbarStyle)
}
