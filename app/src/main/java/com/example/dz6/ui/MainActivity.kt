package com.example.dz6.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dz6.R
import com.example.dz6.ui.fragments.GalleryFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var fragmentManager = supportFragmentManager

        fragmentManager.beginTransaction()
            .replace(R.id.fragment_container, GalleryFragment())
            .commit()
    }
}