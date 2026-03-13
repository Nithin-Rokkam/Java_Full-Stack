package com.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Msl04DemantAccountServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Msl04DemantAccountServiceApplication.class, args);
	}

}
