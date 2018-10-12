package com.tutorial.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.domain.Post;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

	// find the latest blog post to display on the home page
	Post findFirstByOrderByPostedOnDesc();

	List<Post> findAllByOrderByPostedOnDesc();

	Post findBySlug(String slug);

	
}
