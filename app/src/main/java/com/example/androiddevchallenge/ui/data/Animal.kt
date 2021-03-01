package com.example.androiddevchallenge.ui.data

import androidx.annotation.DrawableRes
import java.io.Serializable

data class Animal(
    @DrawableRes
    var avatarResId: Int,
    var name: String,
    var desc: String,
): Serializable
