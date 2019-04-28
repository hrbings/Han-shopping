package com.hrbing.shop.core.ui.font

import android.content.Context
import android.graphics.Typeface
import androidx.core.content.res.ResourcesCompat
import com.hrbing.shop.core.ui.R

/**
 * @author ...
 *
 * create a TypeFace after select one of Fonts:
 */
class FontUtil() {

    companion object {

        const val APP_HAUS_DIN_BOLD = "appHausDin-bold"
        const val APP_HAUS_DIN_REGULAR = "appHausDin-regular"
        const val APP_HAUS_DIN_CON = "appHausDin-con"
        const val APP_HAUS_DIN_CON_ITALIC = "appHausDin-con-italic"
        const val APP_NEUE_PRO_BOLD = "appNeuePro-bold"
        const val APP_NEUE_PRO_LIGHT = "appNeuePro-light"
        const val APP_YEEZY_TSTAR_BOLD = "appYeezyTstar-Bold"
        const val APP_YEEZY_TSTAR_REGULAR = "appYeezyTstar-regular"
        const val APP_YEEZY_TSTAR_HEAVY = "appYeezyTstar-heavy"

        /**
         * @return new a Typeface
         */
        fun getTypeface(context: Context, fontName: String): Typeface? {
            return ResourcesCompat.getFont(context, getFontFileResId(fontName))
        }

        /**
         * @param fontName Optional fontName apply to the font resId, may be null, app default font is haus_din_regular
         *
         * @return font resId should be correspond to font.ttf file
         */
        private fun getFontFileResId(fontName: String): Int {
            return when (fontName) {
                APP_HAUS_DIN_BOLD -> R.font.app_haus_din_bold
                APP_HAUS_DIN_REGULAR -> R.font.app_haus_din_regular
                APP_HAUS_DIN_CON -> R.font.app_haus_din_con
                APP_HAUS_DIN_CON_ITALIC -> R.font.app_haus_din_con_italic
                APP_NEUE_PRO_BOLD -> R.font.app_neue_pro_bold
                APP_NEUE_PRO_LIGHT -> R.font.app_neue_pro_light
                APP_YEEZY_TSTAR_BOLD -> R.font.app_yeezy_tstar_bold
                APP_YEEZY_TSTAR_REGULAR -> R.font.app_yeezy_tstar_regular
                APP_YEEZY_TSTAR_HEAVY -> R.font.app_yeezy_tstar_heavy
                else -> R.font.app_haus_din_regular
            }
        }
    }
}
