package com.EnzoRazoppi.SpringBoot_MongoDB.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EnzoRazoppi.SpringBoot_MongoDB.domain.Post;
import com.EnzoRazoppi.SpringBoot_MongoDB.repository.PostRepository;
import com.EnzoRazoppi.SpringBoot_MongoDB.services.exceptions.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
}
