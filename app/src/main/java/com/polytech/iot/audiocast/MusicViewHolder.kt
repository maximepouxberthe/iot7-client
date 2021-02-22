package com.polytech.iot.audiocast

import android.graphics.Color
import android.view.View
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.ligne_layout.view.*

class MusicViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    private val labelView = itemView.label
    private val imageView = itemView.image

    fun MusicViewHolder(@NonNull itemView:View) {
        super.itemView;
    }

    fun updateWithMusic(music : Music) {
        this.labelView.text = "\n" + music.label + "                                                     > \n\n\n\n";

        Picasso.get().load("https://firebasestorage.googleapis.com/v0/b/audiocast-2109.appspot.com/o/logo_music.png?alt=media&token=c465488a-d9f5-46f9-936c-f8d790037528").into(imageView);
    }
}