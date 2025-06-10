package com.EnzoRazoppi.SpringBoot_MongoDB.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.EnzoRazoppi.SpringBoot_MongoDB.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
	
	@Query("{ 'title': { $regex: ?0, $options: 'i' } }")  //consulta do MongoDB em forma de JSON
	List<Post> searchTitle(String text);

	List<Post> findByTitleContainingIgnoreCase(String text); // pelo nome do método o Spring Data consegue gerar a consulta
}
