package com.example.dz6.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.dz6.R
import com.example.dz6.ui.fragments.GalleryFragment
import com.example.dz6.ui.model.GalleryModel

class GalleryAdapter(
    private val galleryList: ArrayList<GalleryModel>,
    private val onItemClickListener: GalleryFragment
) :
    RecyclerView.Adapter<GalleryAdapter.PhotoViewHolder>(), View.OnClickListener,
    View.OnLongClickListener {

    inner class PhotoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private var ivPhoto: ImageView? = null

        init {
            ivPhoto = view.findViewById(R.id.iv_photo)
        }

        fun onBind(photo: GalleryModel) {
            ivPhoto?.let {
                Glide.with(it.context).load(photo.photoUrl).into(it)
            }
            itemView.tag = photo
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhotoViewHolder {
        return PhotoViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PhotoViewHolder, position: Int) {
        holder.itemView.setOnClickListener(this)
        holder.itemView.setOnLongClickListener(this)
        holder.onBind(galleryList[position])
        holder.itemView.setOnLongClickListener {
            galleryList.removeAt(holder.adapterPosition)
            notifyItemRemoved(holder.adapterPosition)
            true
        }
    }

    override fun getItemCount(): Int {
        return galleryList.size;
    }

    override fun onClick(view: View?) {
        onItemClickListener.onClick(view?.tag as GalleryModel)
    }

    override fun onLongClick(view: View?): Boolean {
        onItemClickListener.onLongClick(view?.tag as GalleryModel)
        return true
    }
}