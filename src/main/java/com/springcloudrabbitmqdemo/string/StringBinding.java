package com.springcloudrabbitmqdemo.string;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

public interface StringBinding {

    String INPUT = "string-channel-in";

    String OUTPUT = "string-channel-out";

    @Input(INPUT)
    SubscribableChannel receiveInputMessage();

    @Output(OUTPUT)
    MessageChannel sendOutputMessage();
}
