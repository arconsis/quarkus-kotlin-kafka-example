package com.arconsis.meetup

import org.eclipse.microprofile.reactive.messaging.Channel
import org.eclipse.microprofile.reactive.messaging.Emitter
import org.eclipse.microprofile.reactive.messaging.Incoming
import org.eclipse.microprofile.reactive.messaging.Outgoing
import java.util.logging.Logger
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class MessagesService(@Channel("messages-out") private val emitter: Emitter<MeetupEventDto>) {

    private val logger = Logger.getLogger(MessagesService::class.java.name)

    private var counter = 0

    fun sendMessage(text: String) {
        emitter.send(MeetupEventDto(text, counter++))
    }

    @Incoming("messages-in")
    fun receiveMessage(eventDto: MeetupEventDto) {
        logger.info { "Received message: $eventDto" }
    }
}
