package com.bmaexperiences.misterautotodolist.customization

import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class MarginCustomerList : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {
        with(outRect){
            left = 20
            right= 20
        }
    }
}