package com.example.mongoportal.examPortalUsingMongodb.Entity;

import com.example.mongoportal.examPortalUsingMongodb.common.Topic;
import lombok.Data;
import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("CourseEntity")
@Value
public class CourseEntity extends CommonDBProperties {

    @Id
    private String id;
    private String name;
    private List<Topic> topics;

}
