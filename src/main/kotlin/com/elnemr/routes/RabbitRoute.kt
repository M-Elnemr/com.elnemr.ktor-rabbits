package com.elnemr.routes

import com.elnemr.Constants
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.randomRabbit(){
    get("/randomrabbit") {
        call.respond(
            HttpStatusCode.OK,
            Constants.rabbits.random()
        )

    }
}