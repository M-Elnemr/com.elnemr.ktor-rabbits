package com.elnemr.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Rabbit(
    val name: String,
    val desc: String,
    val imageUrl: String
)
