package com.hrbing.shop.core.ui.view

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.appcompat.R
import androidx.appcompat.widget.AppCompatButton

class AppButton(context: Context,
                attributeSet: AttributeSet?,
                defStyleAttr: Int) : AppCompatButton(context, attributeSet, defStyleAttr) {

    constructor(context: Context, attr: AttributeSet? = null) : this(context, attr,  R.attr.buttonStyle)

    private var lastClickTime: Long = 0


    @SuppressLint("ClickableViewAccessibility")
    override fun onTouchEvent(event: MotionEvent?): Boolean {
        if (event?.action == MotionEvent.ACTION_DOWN) {
            val currentTime = System.currentTimeMillis()
            if (currentTime - lastClickTime > CLICK_THRESHOLD) {
                lastClickTime = currentTime
                return true
            } else {
                lastClickTime = currentTime
                return false
            }
        }
        return super.onTouchEvent(event)
    }

    companion object {
        //set the time between clicks
        private const val CLICK_THRESHOLD = 500
    }
}
