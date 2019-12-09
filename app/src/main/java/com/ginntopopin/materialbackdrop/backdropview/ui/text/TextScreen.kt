package com.ginntopopin.materialbackdrop.backdropview.ui.text

import android.view.View
import com.ginntopopin.materialbackdrop.R
import com.ginntopopin.materialbackdrop.backdropview.ui.common.Screen
import kotlinx.android.synthetic.main.screen_text.view.*
import com.ginntopopin.materialbackdrop.backdropview.load


class TextScreen : Screen() {

    override val layoutId: Int = R.layout.screen_text

    override fun onInitView(view: View) {

        view.image.load("https://habrastorage.org/webt/r9/p8/fi/r9p8figkbszo_cyhdg-6nad4mp0.png")
    }
}