package com.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Msl03LoanServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Msl03LoanServiceApplication.class, args);
	}

}
