package com.springcloudrabbitmqdemo.person;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.integration.annotation.InboundChannelAdapter;

@EnableBinding(PersonBinding.class)
public class PersonProducer {

    @InboundChannelAdapter(PersonBinding.OUTPUT)
    public Person sendPerson() {
        System.out.println("PERSON SENT!");
        return Person.getRandomPersonMessage();
    }
}
