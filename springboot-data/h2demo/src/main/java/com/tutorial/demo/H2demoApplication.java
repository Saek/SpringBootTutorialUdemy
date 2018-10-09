package com.tutorial.demo;

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
import com.tutorial.service.DataLoader;


@ComponentScan("com.tutorial")
@SpringBootApplication
@EntityScan(basePackages = {"com.tutorial.domain"})
@EnableJpaRepositories("com.tutorial.repository") 
public class H2demoApplication {

	private static final Logger logger =  LoggerFactory.getLogger(H2demoApplication.class);
	
	// PostRepository
	@Autowired
	PostRepository postRepository;
	
	@Autowired
	DataLoader dataLoader;
	
	public static void main(String[] args) {
		SpringApplication.run(H2demoApplication.class, args);
	}
	
	// PostConstructor this mehod will call after everthing set up
	@PostConstruct
	void seePosts() {
		logger.info("seePosts() methods called!");
		for(Post post : postRepository.findAll()) {
			logger.info(post.toString());
		}
	}
}
