package com.springcloudrabbitmqdemo.string;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(StringBinding.class)
public class Consumer {

    @StreamListener(StringBinding.INPUT)
    public void consumeMessage(String message) {
        System.out.println("Receiving message: " + message);
    }
}
