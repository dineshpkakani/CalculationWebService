package com.javacodegeeks.example.rest.subtraction.SubtractionServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.logging.Logger;

@SpringBootApplication
@EnableDiscoveryClient
public class SubtractionServerApplication {
	protected Logger logger = Logger.getLogger(SubtractionServerApplication.class.getName());
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "subtraction-server");
		SpringApplication.run(SubtractionServerApplication.class, args);
	}

}
