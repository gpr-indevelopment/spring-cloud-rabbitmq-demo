package com.springcloudrabbitmqdemo.rpc;

import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class Client {

    @Autowired
    private RabbitTemplate template;

    @Scheduled(fixedRate = 2000L)
    public void sendMessageAndPrintReturn() {
        String exchangeName = ConfigRPC.EXCHANGE_NAME;
        String routingKey = ConfigRPC.ROUTING_KEY;
        System.out.println(template.convertSendAndReceive(exchangeName , routingKey, new Random().nextInt(10)));
    }
}
