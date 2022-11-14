package com.example.dz6.ui.fragments

import com.example.dz6.ui.model.GalleryModel

class RepositoryClass {

    private val galleryList = mutableListOf<GalleryModel>()

    fun getPhotos(): List<GalleryModel> {
        galleryList.add(
            GalleryModel(
                1,
                "https://wallpapers.com/images/high/darling-in-the-franxx-couple-pilot-y2ser1vhdswg2nd4.webp"
            )
        )
        galleryList.add(
            GalleryModel(
                2,
                "https://wallpapers.com/images/high/young-darling-in-the-franxx-gvn2hxx7clfszb6k.webp"
            )
        )
        galleryList.add(
            GalleryModel(
                3,
                "https://wallpapers.com/images/high/parasites-of-darling-in-the-franxx-4p4mylr32r9nae6x.webp"
            )
        )
        galleryList.add(
            GalleryModel(
                4,
                "https://wallpapers.com/images/high/darling-in-the-franxx-fireworks-lb6nu4xzk5yxkqwc.webp"
            )
        )
        galleryList.add(
            GalleryModel(
                5,
                "https://wallpapers.com/images/high/darling-in-the-franxx-ichigo-cefyhrdnacwdo8gc.webp"
            )
        )
        galleryList.add(
            GalleryModel(
                6,
                "https://wallpapers.com/images/hd/orange-strelizia-darling-in-the-franxx-y4bb0knvo47w7zqh.webp"
            )
        )
        galleryList.add(
            GalleryModel(
                7,
                "https://wallpapers.com/images/hd/darling-in-the-franxx-02-lollipop-bw4s2rvmbwxoy6y9.webp"
            )
        )
        galleryList.add(
            GalleryModel(
                8,
                "https://wallpapers.com/images/high/parasites-of-darling-in-the-franxx-4p4mylr32r9nae6x.webp"
            )
        )
        galleryList.add(
            GalleryModel(
                9,
                "https://wallpapers.com/images/hd/darling-in-the-franxx-002-sjlqu9bwp72luq9p.webp"
            )
        )
        galleryList.add(
            GalleryModel(
                10,
                "https://wallpapers.com/images/hd/delphinium-darling-in-the-franxx-w95y5q40ogaccsk1.webp"
            )
        )
        galleryList.add(
            GalleryModel(
                11,
                "https://wallpapers.com/images/hd/darling-in-the-franxx-embrace-by5zftbryvtbw60y.webp"
            )
        )
        galleryList.add(
            GalleryModel(
                12,
                "https://wallpapers.com/images/high/darling-in-the-franxx-lovely-couple-o31g3xt2x8baqsm1.webp"
            )
        )

        return galleryList
    }
}