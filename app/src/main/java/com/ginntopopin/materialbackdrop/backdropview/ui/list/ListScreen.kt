package com.ginntopopin.materialbackdrop.backdropview.ui.list

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.ginntopopin.materialbackdrop.R
import kotlinx.android.synthetic.main.screen_list.view.*
import com.ginntopopin.materialbackdrop.backdropview.ui.common.Screen
import com.ginntopopin.materialbackdrop.domain.ItemsFactory


class ListScreen : Screen() {

    override val layoutId: Int = R.layout.screen_list

    private val listAdapter = ListItemsAdapter()

    override fun onInitView(view: View) {
        with(view.recyclerView) {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = listAdapter
        }

        listAdapter.setItems(ItemsFactory.getDefault())
    }
}