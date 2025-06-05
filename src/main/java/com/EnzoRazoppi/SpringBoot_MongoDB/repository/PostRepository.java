package com.EnzoRazoppi.SpringBoot_MongoDB.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.EnzoRazoppi.SpringBoot_MongoDB.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
