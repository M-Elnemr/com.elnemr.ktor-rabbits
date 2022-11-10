package com.elnemr

import com.elnemr.data.model.Rabbit

object Constants {
    const val BASE_URL = "http://192.168.1.2:8100"

    val rabbits = listOf(
        Rabbit("Rabbit Number 1", "Describtion Number 1", "$BASE_URL/images/rabbit1.jpg"),
        Rabbit("Rabbit Number 2", "Describtion Number 2", "$BASE_URL/images/rabbit2.jpg"),
        Rabbit("Rabbit Number 3", "Describtion Number 3", "$BASE_URL/images/rabbit3.jpg")
    )
}