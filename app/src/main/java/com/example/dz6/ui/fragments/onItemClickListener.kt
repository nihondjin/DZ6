package com.example.dz6.ui.fragments

import com.example.dz6.ui.model.GalleryModel

interface onItemClickListener {


        fun onClick(photo : GalleryModel)

        fun onLongClick(photo : GalleryModel)

}