package com.arconsis.meetup

import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/messages")
class MessagesResource(private val messagesService: MessagesService) {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    fun sendMessage(text: String) {
        messagesService.sendMessage(text)
    }


}
