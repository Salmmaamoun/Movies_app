package com.example.movies

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.movies.databinding.ItemImgBinding

class ImagePagerAdapter() :
    RecyclerView.Adapter<ImagePagerAdapter.ImageViewHolder>() {
    private var imageUrls: List<String> = emptyList()
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ImagePagerAdapter.ImageViewHolder {
        val binding = ItemImgBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImageViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ImagePagerAdapter.ImageViewHolder, position: Int) {
        val imageUrl = imageUrls[position]
        Glide.with(holder.itemView)
            .load(imageUrl)
            .into(holder.binding.imgItem)
    }

    override fun getItemCount(): Int {
        return imageUrls.size
    }

    fun setImageUrls(urls: List<String>) {
        imageUrls = urls
        notifyDataSetChanged()
    }
    inner class ImageViewHolder(val binding: ItemImgBinding) : RecyclerView.ViewHolder(binding.root) {
    }
}