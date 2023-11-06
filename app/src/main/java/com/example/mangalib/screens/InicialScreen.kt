package com.example.mangalib.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.fragment.app.Fragment
import com.example.mangalib.R
import com.example.mangalib.databinding.ActivityInicialScreenBinding
import com.example.mangalib.fragments.HomeFragment
import com.example.mangalib.fragments.NewManga
import com.example.mangalib.fragments.ProfileFragment

class InicialScreen : AppCompatActivity() {

    private lateinit var binding: ActivityInicialScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)/*
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        this.window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        supportActionBar?.hide()*/
        binding = ActivityInicialScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(HomeFragment())

        binding.bottomNavView.setOnItemSelectedListener{
            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.addNewManga -> replaceFragment(NewManga())
                R.id.settings -> replaceFragment(ProfileFragment())
                else -> {

                }
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }
}