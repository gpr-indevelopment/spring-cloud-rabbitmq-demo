package com.springcloudrabbitmqdemo.rpc;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Server {

    @RabbitListener(queues = ConfigRPC.QUEUE_NAME)
    public int multiplyByTwo(int a) {
        return a*2;
    }
}
