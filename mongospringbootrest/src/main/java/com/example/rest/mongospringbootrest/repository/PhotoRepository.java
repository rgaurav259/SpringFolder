package com.example.rest.mongospringbootrest.repository;

import com.example.rest.mongospringbootrest.collection.Photo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends MongoRepository<Photo,String> {
}
