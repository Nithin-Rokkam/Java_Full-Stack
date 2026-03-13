package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Msb01BookInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(Msb01BookInformationApplication.class, args);
	}

    @Bean
    RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
