package com.example.mongoportal.examPortalUsingMongodb.service;

import com.example.mongoportal.examPortalUsingMongodb.dto.CourseResponse;
import com.example.mongoportal.examPortalUsingMongodb.repository.CourseRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class CourseService {

    private CourseRepository repository;


    public List<CourseResponse> getAllCourses(){
        return repository.findAll().stream()
                .map(entity -> CourseResponse
                        .builder()
                        .id(entity.getId())
                        .name(entity.getName())
                        .topics(entity.getTopics())
                        .build()).collect(Collectors.toList());
    }
}
