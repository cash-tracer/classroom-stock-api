package com.tally.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
        scanBasePackages = {
                "com.tally.domain",
                "com.tally.db",
                "com.tally.api"
        }
)
public class ClassroomApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClassroomApiApplication.class, args);
    }

}
