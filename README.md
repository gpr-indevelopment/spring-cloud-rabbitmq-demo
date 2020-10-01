# spring-cloud-rabbitmq-demo
Demo app with Spring Boot and RabbitMQ's messaging

# RabbitMQ
Start RabbitMQ server using docker:
```
$ docker run -d --name rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management
```

# Terminology
From the [docs](https://www.rabbitmq.com/tutorials/amqp-concepts.html).

> To draw an analogy:
> 
> * **Queue** is like your destination in New York city
> * **Exchange** is like JFK airport
> * **Bindings** are routes from JFK to your destination. There can be zero or many ways to reach it
