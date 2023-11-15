package com.jorgematheus.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jorgematheus.workshopmongo.domain.Post;

@Repository
public interface PostRespository extends MongoRepository<Post, String> {
	
}
