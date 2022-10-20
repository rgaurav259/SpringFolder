package com.example.springdatamongoAtlas.Repository;

import com.example.springdatamongoAtlas.Model.Task;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends MongoRepository<Task,String> {
    List<Task> findBySeverity(Integer severity);

    //using query
    @Query("{assignee : ?0}")
    List<Task> findByTskAssignee(String assignee);
}
