# spring-cloud-rabbitmq-demo
Demo app with Spring Boot and RabbitMQ's messaging

### Terminology
From the [docs](https://www.rabbitmq.com/tutorials/amqp-concepts.html).
 
> * **Queue** is like your destination in New York city
> * **Exchange** is like JFK airport
> * **Bindings** are routes from JFK to your destination. There can be zero or many ways to reach it
> * **Channels** can be thought of as "lightweight connections that share a single TCP connection"

### Reference articles
1. [Spring Cloud Stream: Simplificando o uso de Message Broker — Parte 1](https://medium.com/@jvoliveiran/spring-cloud-stream-simplificando-o-uso-de-message-broker-71f1731f5f5)
2. [Spring Cloud Stream: Simplificando o uso de Message Broker — Parte 2](https://medium.com/@jvoliveiran/spring-cloud-stream-simplificando-o-uso-de-message-broker-parte-2-e82d02e1371c)
3. [Introduction to Spring Cloud Stream](https://www.baeldung.com/spring-cloud-stream)

### Goals
1. Get started with Spring Boot and RabbitMQ integration.
2. Publish and consume a string message from a Spring Boot app.
3. Publish and consume a JSON message from a Spring Boot app. On this demo a serialized Person class was used.
4. Make a synchronous RPC to a server through the message broker and wait for the response. Used this [documentation](https://www.rabbitmq.com/tutorials/tutorial-six-spring-amqp.html) as reference.

# Running the demo

### RabbitMQ
Start RabbitMQ server using docker:
```
$ docker run -d --name rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management
```

Start Spring Boot app from the project's root folder:
```
$ mvn spring-boot:run
```

Access RabbitMQ's dashboard on `localhost:15672`. On the exchanges tab there will be a rate of messages being published and written to both the person and string exchanges.

![RabbitMQ dashboard](https://i.imgur.com/n1x7G2c.jpg)
