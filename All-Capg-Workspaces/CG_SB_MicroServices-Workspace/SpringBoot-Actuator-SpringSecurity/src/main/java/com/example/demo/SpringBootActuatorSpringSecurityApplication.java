package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootActuatorSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorSpringSecurityApplication.class, args);
		System.out.println("Spring Boot Actuator with Spring Security is running...");
	}

}
