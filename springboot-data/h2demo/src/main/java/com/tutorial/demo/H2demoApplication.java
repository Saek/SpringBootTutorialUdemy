package com.tutorial.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class H2demoApplication {

	private static final Logger logger =  LoggerFactory.getLogger(H2demoApplication.class);
	
	// PostRepository
	
	public static void main(String[] args) {
		SpringApplication.run(H2demoApplication.class, args);
	}
	
	// PostConstructor
}
