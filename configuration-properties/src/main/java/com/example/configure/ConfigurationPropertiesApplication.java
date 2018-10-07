package com.example.configure;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ConfigurationPropertiesApplication.class, args);
		MyAppConfig myAppConfig = (MyAppConfig) ctx.getBean("myAppConfig");
		
//		String[] beanNames = ctx.getBeanDefinitionNames();
//		Arrays.sort(beanNames);
//		for(String name : beanNames) {
//			System.out.println("name: " + name);
//		}
		
		System.out.println("myAppConfig: " + myAppConfig.toString());
	}
	
	
	
}
