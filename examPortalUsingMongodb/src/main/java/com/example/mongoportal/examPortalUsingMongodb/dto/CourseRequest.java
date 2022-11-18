package com.example.mongoportal.examPortalUsingMongodb.dto;

import com.example.mongoportal.examPortalUsingMongodb.common.Topic;
import lombok.Value;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@Value
public class CourseRequest {
    @NotBlank
    private String name;
    @NotEmpty
    private List<Topic> topics;
    @NotBlank
    private String userName;
}
