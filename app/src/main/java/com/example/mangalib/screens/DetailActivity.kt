package com.example.mangalib.screens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.mangalib.R
import com.example.mangalib.fragments.HomeFragment
import com.example.mangalib.model.FakeMangas
import org.w3c.dom.Text

class DetailActivity : AppCompatActivity() {
    private lateinit var btnBackDetail: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val manga = intent.getParcelableExtra<FakeMangas>("rs")
        if(manga != null){
            val imgDetail: ImageView = findViewById(R.id.imgDetail)
            val txtTitleDetail: TextView = findViewById(R.id.txtTitleDetail)
            val txtDescDetail: TextView = findViewById(R.id.txtDescDetail)
            val txtCapsDetail: TextView = findViewById(R.id.txtCapsDetail)

            imgDetail.setImageResource(manga.coverManga)
            txtTitleDetail.text = manga.mangaName
            txtCapsDetail.text = "Chapters: ${manga.numCaps}"
            txtDescDetail.text = manga.description
        }

        btnBackDetail = findViewById(R.id.btnBackDetail)
        btnBackDetail.setOnClickListener{
           finish()
        }

    }
}