package com.example.mangalib.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.mangalib.R
import com.example.mangalib.model.FakeMangas

class MangaAdapter(private val fakeMangas: MutableList<FakeMangas>): RecyclerView.Adapter<MangaAdapter.MangaViewHolder>() {
    var onItemClick : ((FakeMangas) -> Unit)? = null
    inner class MangaViewHolder(itemView: View) : ViewHolder(itemView){
        val coverImage: ImageView
        val txtCoverName: TextView
        val txtNumberCaps: TextView
        val txtDescription: TextView

        init {
            coverImage = itemView.findViewById(R.id.imgCoverManga)
            txtCoverName = itemView.findViewById(R.id.txtMangaTitle)
            txtNumberCaps = itemView.findViewById(R.id.txtNumCaps)
            txtDescription = itemView.findViewById(R.id.txtDesc)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MangaViewHolder {
        val view =  LayoutInflater.from(parent.context).inflate(R.layout.item_home_list, parent, false)
        return MangaViewHolder(view)
    }

    override fun getItemCount(): Int {
        return fakeMangas.size
    }

    override fun onBindViewHolder(holder: MangaViewHolder, position: Int) {
        var rs = fakeMangas[position]
        holder.coverImage.setImageResource(rs.coverManga)
        holder.txtCoverName.text = rs.mangaName
        holder.txtNumberCaps.text = "Chapters: ${rs.numCaps}"
        holder.txtDescription.text = rs.description
        

        holder.itemView.setOnClickListener{
            onItemClick?.invoke(rs)
        }
    }
}