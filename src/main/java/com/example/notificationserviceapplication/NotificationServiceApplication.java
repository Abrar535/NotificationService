package com.example.notificationserviceapplication;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@Slf4j
public class NotificationServiceApplication implements CommandLineRunner {
    @Value("${spring.datasource.url}")
    public String dbUrl;
    public static void main(String[] args) {
        System.out.println("hello");
        SpringApplication.run(NotificationServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       log.info("dbUrl is "+ dbUrl);
    }
}
