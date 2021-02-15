package com.arconsis.meetup

import io.quarkus.kafka.client.serialization.ObjectMapperDeserializer

class MeetupEventDtoDeserializer : ObjectMapperDeserializer<MeetupEventDto>(MeetupEventDto::class.java)
