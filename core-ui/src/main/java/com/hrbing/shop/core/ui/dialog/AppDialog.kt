package com.hrbing.shop.core.ui.dialog

import android.app.Dialog
import android.content.Context

/**
 * @author ...
 */
open class AppDialog(context: Context,
                themeResId: Int) : Dialog(context, themeResId) {

    constructor(context: Context) : this(context, 0)
}
