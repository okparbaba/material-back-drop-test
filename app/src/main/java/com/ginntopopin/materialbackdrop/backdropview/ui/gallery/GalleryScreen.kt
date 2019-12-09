package com.ginntopopin.materialbackdrop.backdropview.ui.gallery

import android.view.View
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import com.ginntopopin.materialbackdrop.R
import com.ginntopopin.materialbackdrop.backdropview.ui.common.Screen
import kotlinx.android.synthetic.main.screen_gallery.view.*
import com.ginntopopin.materialbackdrop.domain.ItemsFactory


@Suppress("NULLABILITY_MISMATCH_BASED_ON_JAVA_ANNOTATIONS")
class GalleryScreen : Screen() {

    companion object {
        private const val SNAP_COUNT = 2
    }

    override val layoutId: Int = R.layout.screen_gallery

    private val galleryAdapter = GalleryAdapter()
    private val snapHelper = LinearSnapHelper()

    override fun onInitView(view: View) {

        with(view.recyclerView) {
            setHasFixedSize(true)
            layoutManager = GridLayoutManager(context, SNAP_COUNT, GridLayoutManager.HORIZONTAL, false)
            adapter = galleryAdapter
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.HORIZONTAL).apply {
                context.getDrawable(R.drawable.divider_empty)?.let { this.setDrawable(it) }
            })
            addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL).apply {
                context.getDrawable(R.drawable.divider_empty)?.let { this.setDrawable(it) }
            })
        }
        with(snapHelper) {
            attachToRecyclerView(view.recyclerView)
        }

        galleryAdapter.setItems(ItemsFactory.getDefault())
    }
}