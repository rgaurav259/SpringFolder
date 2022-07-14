package com.gaurav.blog.payloads;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private int id;

    @Column(name = "user_name",nullable = false,length = 100)
    private String name;

    private String email;

    private String password;

    private String about;

}
