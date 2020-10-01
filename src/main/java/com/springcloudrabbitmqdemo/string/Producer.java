package com.springcloudrabbitmqdemo.string;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.InboundChannelAdapter;

@EnableBinding(StringBinding.class)
public class Producer {

    @InboundChannelAdapter(StringBinding.OUTPUT)
    public String sendMessage() {
        String message = "SOME MESSAGE";
        System.out.println("Sending message: " + message);
        return message;
    }
}
