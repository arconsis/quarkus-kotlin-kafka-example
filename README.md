# Example Project: Quarkus Kotlin Kafka - Meetup

This is the example code shown in the talk "Supersonic Subatomic Messaging" by [Andreas Eberle](https://github.com/andreas-eberle) 
as presented for Stuttgart's and Karlsruhe's Kotlin User Groups.

You can find a recording of the [talk on YouTube](TODO: Link to YouTube video).

## Topic

The talk and this example project demonstrate the simplest way of interacting with Kafka from a Quarkus service using [SmallRye Reactive Messaging](https://smallrye.io/smallrye-reactive-messaging/smallrye-reactive-messaging/2/index.html).
Quarkus with SmallRye Reactive Messaging makes it very easy to send messages to Kafka or receive messages from Kafka. 
Since this is an introduction talk, only a very small part of the possibilities to interact with Kafka have been covered.

For further details, insights and explanations refer to the official documentations:
* [Quarkus Kafka Reactive Messaging Documentation (getting started)](https://quarkus.io/guides/kafka)
* [SmallRye Reactive Messaging Documentation](https://smallrye.io/smallrye-reactive-messaging/smallrye-reactive-messaging/2/index.html)
* [Quarkus Blog](https://quarkus.io/blog/index.html) (The Quarkus Blog offers great posts on many Quarkus related topics. For information regarding reactive messaging, watch out for the posts of [Clement Escoffier](https://github.com/cescoffier).)


## Prerequisites

A running Kafka is required to test this project. 
The easiest way to get a Kafka running for local development is to use the all-in-one Docker container from [Lenses](https://lenses.io).

### Lenses Box Setup
This project contains a docker compose file that can be used to start up a Lenses Box Kafka container. 
Please note that you need to have [Docker](https://www.docker.com/) installed to be able to use it.
You can get a free Lenses Box test license by going to [their website](https://lenses.io/box/) and enter your email address to be sent a trial key. 
The website also details what you can do with the Lenses Box.
While we will only use a Kafka, it can do a lot more and offers a nice UI to interact with Kafka.

After you've received your license key via email, please configure it in the file `docker-compose.yml` in line 14 by replacing `<YOUR_TRIAL_LICENSE_ID>` with the key. 
Now you're ready to start up the Lenses Box by either running `docker-compose.yml` file in your IDE or running `docker-compose up -d` in a terminal.

You can now go to the [Lenses Box dashboard](https://http://localhost:3030). 
In the `Explore` tab, you find the Kafka topics and can inspect them (at the beginning, none exist yet).


## Quarkus Kafka Messaging
To run the example code with Quarkus simply execute `./gradlew quarkusDev` in your command line in the project's directory.
This will start Quarkus' development mode which automatically recompiles and applies changes on every request. 

To test the service, you can either use the [Postman](https://www.postman.com/) collection in the project or any other tool to execute a POST request to `localhost:8080/messages`. 
The request must contain a body of `Content-Type: text/plain` with the message you want to send to Kafka.
If you want to use curl, this should do the trick:

```
curl --location --request POST 'localhost:8080/messages' \
--header 'Content-Type: text/plain' \
--data-raw 'Kotlin is awesome 42!'
```

To see the message in Kafka, check out the Lenses Box dashboard's `Explore` section and click on the topic `meetup-messages`.
All messages should appear there (you will have to refresh the page to get new messages).
Additionally, the service prints the received message to the console log.
