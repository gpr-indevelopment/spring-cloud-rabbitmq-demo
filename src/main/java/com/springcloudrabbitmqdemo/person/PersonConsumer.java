package com.springcloudrabbitmqdemo.person;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(PersonBinding.class)
public class PersonConsumer {

    @StreamListener(PersonBinding.INPUT)
    public void consumePerson(Person person) {
        String logMessage = String.format("RECEIVING PERSON WITH NAME %S AND AGE %d.", person.getName(), person.getAge());
        System.out.println(logMessage);
    }
}
