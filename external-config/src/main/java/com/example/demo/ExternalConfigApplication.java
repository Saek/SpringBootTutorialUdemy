package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.example")
@SpringBootApplication
public class ExternalConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExternalConfigApplication.class, args);
	}
}
