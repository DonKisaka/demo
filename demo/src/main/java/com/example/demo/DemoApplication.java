package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.resilience.annotation.EnableResilientMethods;
import org.springframework.resilience.annotation.Retryable;
import org.springframework.web.service.registry.ImportHttpServices;

@SpringBootApplication
@ImportHttpServices(basePackages = "com.example")
@EnableResilientMethods
public class DemoApplication {

	static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

    @Retryable(
            maxRetries = 3,
            delay = 2000,
            multiplier = 2,
            includes = IllegalArgumentException.class
    )
    public String foo() {
        return "Hello World!";
    }
}
