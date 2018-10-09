package com.tutorial.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.domain.Author;

@Repository
public interface AuthorRepository extends CrudRepository<Author, Long> {

}
