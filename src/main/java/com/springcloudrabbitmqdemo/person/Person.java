package com.springcloudrabbitmqdemo.person;

import java.io.Serializable;
import java.util.Random;

public class Person implements Serializable {

    private String name;

    private Integer age;

    public static Person getRandomPersonMessage() {
        Person person = new Person();
        person.setName("SOME_NAME");
        person.setAge(new Random().nextInt(100));
        return person;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
