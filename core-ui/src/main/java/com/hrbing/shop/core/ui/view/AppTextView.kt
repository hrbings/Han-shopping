package com.hrbing.shop.core.ui.view

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView

/**
 * @author ...
 */
class AppTextView(context: Context,
                  attributeSet: AttributeSet?,
                  defStyleAttr: Int) : AppCompatTextView(context, attributeSet, defStyleAttr) {

    constructor(context: Context, attr: AttributeSet? = null) : this(context, attr, android.R.attr.textViewStyle)
}
