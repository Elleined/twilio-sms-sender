package com.elleined.smssender.smssendertwilio;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SmsSenderTwilioApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SmsSenderTwilioApplication.class, args);
    }

    @Value("${twilio.account.sid}")
    String name;

    @Value("${username}")
    String username;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(name + " " + username);
    }
}
