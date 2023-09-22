package com.ardanu.challenge_ch3

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class MenuMakanan(
    val imageResId: Int,
    val nama: String,
    val harga: Int,
    val deksripsi: String,
    val lokasi: String,
    val urlLokasi: String
) : Parcelable
