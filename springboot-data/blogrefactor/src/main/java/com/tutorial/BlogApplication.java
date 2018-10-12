package com.tutorial;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.tutorial.domain.Post;
import com.tutorial.repository.PostRepository;

//@ComponentScan("com.tutorial")
@SpringBootApplication
//@EntityScan(basePackages = {"com.tutorial.domain"})
//@EnableJpaRepositories("com.tutorial.repository") 
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

}
