package com.ozancanguz.books.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.ozancanguz.books.R

class Util {

    companion object{
        fun ImageView.loadImage(uri: String?) {
            val options = RequestOptions()


            Glide.with(context)
                .setDefaultRequestOptions(options)
                .load(uri)
                .into(this)

        }
    }
}