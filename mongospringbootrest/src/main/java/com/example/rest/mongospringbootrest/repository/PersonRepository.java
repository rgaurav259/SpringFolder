package com.example.rest.mongospringbootrest.repository;

import com.example.rest.mongospringbootrest.collection.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends MongoRepository<Person,String> {

    List<Person> findByFirstNameStartsWith(String name);

    //List<Person> findByAgeBetween(Integer min,Integer max);
    //using query find max and min age between
    //i have given different method name here
    //and also we  can skip the addresses if we want to skip

    @Query(value = "{ 'age' : { $gt :?0, $lt :?1 }}",
    fields = "{addresses: 0}")//0 means i don't need 1 means i need
    List<Person> findPersonByAgeBetween(Integer min,Integer max);


//age should be first parameter 0 min and 1 is second parameter max



}
