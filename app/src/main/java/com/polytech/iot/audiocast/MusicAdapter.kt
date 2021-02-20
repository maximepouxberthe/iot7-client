package com.polytech.iot.audiocast

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter(private val musics : ArrayList<Music>) : RecyclerView.Adapter<MusicViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int) = MusicViewHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.ligne_layout, parent, false)
    )

    override fun onBindViewHolder(holder: MusicViewHolder, position: Int) {
        holder.updateWithMusic(musics[position])
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = musics.size

}