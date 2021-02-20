package com.polytech.iot.audiocast

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.ligne_layout.view.*

class ListMusicsActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager

    var db = FirebaseFirestore.getInstance()

    val musics : ArrayList<Music> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listmusics)

        viewManager = LinearLayoutManager(this)

        db.collection("musics")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    val music : Music = Music(document.id, document.getString("label")!!)
                    musics.add(music)
                }

                viewAdapter = MusicAdapter(musics)

                recyclerView = findViewById<RecyclerView>(R.id.recycler_musics_list).apply {
                    setHasFixedSize(true)
                    layoutManager = viewManager
                    adapter = viewAdapter
                }
            }
    }

    public override fun onStart() {
        super.onStart()
    }

    fun goToPlaylist(view : View) {
        intent  = Intent(this, PlaylistActivity::class.java)
        startActivity(intent)
    }
}