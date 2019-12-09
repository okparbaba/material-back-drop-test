package com.ginntopopin.materialbackdrop.backdropview.ui.gallery

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ginntopopin.materialbackdrop.R
import kotlinx.android.synthetic.main.item_gallery.view.*
import com.ginntopopin.materialbackdrop.backdropview.inflate
import com.ginntopopin.materialbackdrop.backdropview.ui.common.BaseListAdapter
import com.ginntopopin.materialbackdrop.backdropview.load
import com.ginntopopin.materialbackdrop.domain.ItemData


class GalleryAdapter : BaseListAdapter<ItemData, GalleryAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, itemType: Int): ViewHolder =
        ViewHolder(parent.inflate(R.layout.item_gallery))

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view), BaseListAdapter.Bindable<ItemData> {
        override fun bind(item: ItemData) {
            itemView.image.load(item.image)
            itemView.title.text = item.title
        }
    }
}