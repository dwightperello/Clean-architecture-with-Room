package com.meat.cleanarchitecture_with_room.data.remote.dto


import androidx.annotation.Keep

@Keep
data class License(
    val name: String,
    val url: String
)