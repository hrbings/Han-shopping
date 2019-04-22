package com.hrbing.shop.font

import android.content.Context
import android.graphics.Typeface
import androidx.core.content.res.ResourcesCompat

/**
 * @author RuiBing
 *
 * create a TypeFace after select one of Fonts:
 */
class FontUtil() {

    companion object {

        /**
         * @return new a Typeface
         */
        fun getTypeface(context: Context, fontName: String): Typeface? {
            return ResourcesCompat.getFont(context, getFontFileResId(fontName))
        }

        /**
         * @param fontName Optional fontName apply to the font resId, may be null, app default font is haus_din_regular
         *
         * @return font resId correspond to font.ttf file
         */
        private fun getFontFileResId(fontName: String): Int {
            return when (fontName) {
                "appHausDin-bold" -> R.font.app_haus_din_bold
                "appHausDin-regular" -> R.font.app_haus_din_regular
                "appHausDin-con" -> R.font.app_haus_din_con
                "appHausDin-con-italic" -> R.font.app_haus_din_con_italic
                "appNeuePro-bold" -> R.font.app_neue_pro_bold
                "appNeuePro-light" -> R.font.app_neue_pro_light
                "appYeezyTstar-Bold" -> R.font.app_yeezy_tstar_bold
                "appYeezyTstar-regular" -> R.font.app_yeezy_tstar_regular
                "appYeezyTstar-heavy" -> R.font.app_yeezy_tstar_heavy
                else -> R.font.app_haus_din_regular
            }
        }
    }
}
