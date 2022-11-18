package com.example.mongoportal.examPortalUsingMongodb.repository;

import com.example.mongoportal.examPortalUsingMongodb.Entity.CourseEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<CourseEntity,String> {
}
