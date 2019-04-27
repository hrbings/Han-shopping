package com.hrbing.shop.core.ui.view

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.R
import androidx.appcompat.widget.AppCompatEditText

class AppEditView(context: Context,
                  attributeSet: AttributeSet?,
                  defStyleAttr: Int) : AppCompatEditText(context, attributeSet, defStyleAttr) {

    constructor(context: Context, attr: AttributeSet? = null) : this(context, attr, R.attr.editTextStyle)
}
