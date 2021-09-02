package com.carros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class}) // Usado o exclude apenas para teste, nao e recomendado
public class CarrosApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarrosApplication.class, args);
    }
}
