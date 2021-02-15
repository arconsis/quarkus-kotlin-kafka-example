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
Please note that you need to have Docker installed to be able to use it.
You can get a free Lenses Box test license by going to [their website](https://lenses.io/box/) and enter your email address to be sent a trial key. 
The website also details what you can do with the Lenses Box.
While we will only use a Kafka, it can do a lot more and offers a nice UI to interact with Kafka.

After you've received your license key via email, please configure it in the file `docker-compose.yml` in line 14 by replacing `<YOUR_TRIAL_LICENSE_ID>` with the key. 
Now you're ready to start up the Lenses Box by either running the 





# meetup project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
./gradlew quarkusDev
```

## Packaging and running the application

The application can be packaged using:
```shell script
./gradlew build
```
It produces the `meetup-1.0.0-SNAPSHOT-runner.jar` file in the `/build` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `build/lib` directory.

If you want to build an _über-jar_, execute the following command:
```shell script
./gradlew build -Dquarkus.package.type=uber-jar
```

The application is now runnable using `java -jar build/meetup-1.0.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: 
```shell script
./gradlew build -Dquarkus.package.type=native
```

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: 
```shell script
./gradlew build -Dquarkus.package.type=native -Dquarkus.native.container-build=true
```

You can then execute your native executable with: `./build/meetup-1.0.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/gradle-tooling.

# RESTEasy JAX-RS

<p>A Hello World RESTEasy resource</p>

Guide: https://quarkus.io/guides/rest-json

# RESTEasy JSON serialisation using Jackson

<p>This example demonstrate RESTEasy JSON serialisation by letting you list, add and remove quark types from a list.</p>
<p><b>Quarked!</b></p>

Guide: https://quarkus.io/guides/rest-json
