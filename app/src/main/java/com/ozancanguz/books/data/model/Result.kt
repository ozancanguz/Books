package com.ozancanguz.books.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Result(
    val fiyat: String,
    val image: String,
    val indirim: String,
    val title: String,
    val url: String,
    val yayın: String,
    val yazar: String
):Parcelable