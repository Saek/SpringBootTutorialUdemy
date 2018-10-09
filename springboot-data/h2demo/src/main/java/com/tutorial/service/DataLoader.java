package com.tutorial.service;

import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.domain.Author;
import com.tutorial.domain.Post;
import com.tutorial.repository.AuthorRepository;
import com.tutorial.repository.PostRepository;

@Service
public class DataLoader {

	private PostRepository postRepository;
	private AuthorRepository authorRepository;
	
	@Autowired
	public DataLoader(PostRepository postRepository, AuthorRepository authorRepository) {
		this.postRepository = postRepository;
		this.authorRepository = authorRepository;
	}
	
	@PostConstruct
	private void loadData() {
		// create an author
		System.out.println("show author infos");
//		List<Author> authorList = (ArrayList<Author>) authorRepository.findAll()
//		for(Author author : author)
		int size = 0;
		for(Author author : authorRepository.findAll()) {
			size++;
		}
		System.out.println("size is " + size);
		
		Author author = new Author("AAA", "BBBB");
//		author.set
		authorRepository.save(author);
		
		// create a post
		Post post = new Post("Spring 1111");
		post.setBody("Let's post");
		post.setPostedOn(new Date());
		post.setAuthor(author);
		
		postRepository.save(post);
	}
	
	
}
