package com.example.mongoportal.examPortalUsingMongodb.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.Instant;
@Data
@AllArgsConstructor
public class CommonDBProperties {
    private Instant createTime;
    private Instant updateTime;
    private String createdBy;
    private String updatedBy;
}
