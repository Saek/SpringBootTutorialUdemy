package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.model.User;


@ComponentScan("com.example")
@SpringBootApplication
//@Configuration
public class SpringBeanDemoFromUdemyApplication {

	@Bean
	public User user() {
		return new User("Test123", "Test123");
	}
	
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SpringBeanDemoFromUdemyApplication.class, args); 
		
		String[] beanNames = ctx.getBeanDefinitionNames();
		System.out.println("beanNames: " + beanNames);
		Arrays.sort(beanNames);
		for(String name : beanNames) {
			System.out.println("name: " + name);
		}
		
		System.out.println("user bean is =>" + ctx.getBean("user").toString());
	}
}
