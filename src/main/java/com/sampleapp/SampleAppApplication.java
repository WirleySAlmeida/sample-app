package com.sampleapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleAppApplication.class, args);
    }

    @GetMapping(value = "/person")
    public Person getPerson() {
        Person jose = new Person();
        jose.name = "José";
        jose.address = "Rua Principal, 123, Centro, Santana";
        return jose;
    }
}

class Person {
    public String name;
    public String address;
}
