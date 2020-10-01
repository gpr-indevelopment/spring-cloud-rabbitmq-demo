package com.springcloudrabbitmqdemo.person;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface PersonBinding {

    String INPUT = "person-channel-in";

    String OUTPUT = "person-channel-out";

    @Input(INPUT)
    SubscribableChannel receiveInputMessage();

    @Output(OUTPUT)
    MessageChannel sendOutputMessage();
}
