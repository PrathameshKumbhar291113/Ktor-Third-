package com.pratham.plugins

import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.serialization.Serializable

fun Application.configureRouting() {
    routing {
        get("/") {
            var userResponse = UserInformation("pratham11pmx@gmail.com","myPassword")
            call.respond(userResponse)
        }

    }
}

@Serializable
data class UserInformation(
    var email : String,
    var password : String
)
