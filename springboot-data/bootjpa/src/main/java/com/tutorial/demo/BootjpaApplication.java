package com.tutorial.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan("com.tutorial")
@SpringBootApplication
public class BootjpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootjpaApplication.class, args);
	}
}
