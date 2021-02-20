package com.polytech.iot.audiocast

import android.graphics.Color
import android.view.View
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.ligne_layout.view.*

class MusicViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    private val labelView = itemView.label

    fun MusicViewHolder(@NonNull itemView:View) {
        super.itemView;
    }

    fun updateWithMusic(music : Music) {
        this.labelView.text = music.label;
    }
}