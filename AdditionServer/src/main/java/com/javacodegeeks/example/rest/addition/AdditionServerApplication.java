package com.javacodegeeks.example.rest.addition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

import java.util.logging.Logger;

@EnableAutoConfiguration
@EnableDiscoveryClient
@ComponentScan
public class AdditionServerApplication {

	protected Logger logger = Logger.getLogger(AdditionServerApplication.class.getName());
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "addition-server");
		SpringApplication.run(AdditionServerApplication.class, args);
	}

}
