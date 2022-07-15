package com.example.data.dtoexample.dto;


import lombok.Data;

@Data
public class UserLocationDto {

    private long userId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;
}
