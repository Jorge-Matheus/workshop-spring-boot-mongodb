package com.jorgematheus.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jorgematheus.workshopmongo.domain.Post;
import com.jorgematheus.workshopmongo.repository.PostRespository;
import com.jorgematheus.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRespository postRepository;
	

	public Post findById(String id) {
		Optional<Post> obj = postRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encotrado"));
	}
	
	public List<Post> findByTitle(String text) {
		return postRepository.searchTitle(text);
	}
}
