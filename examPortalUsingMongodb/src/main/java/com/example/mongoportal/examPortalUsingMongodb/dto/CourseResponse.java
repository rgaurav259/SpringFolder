package com.example.mongoportal.examPortalUsingMongodb.dto;


import com.example.mongoportal.examPortalUsingMongodb.common.Topic;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class CourseResponse {
    private String id;
    private String name;
    private List<Topic> topics;
}
