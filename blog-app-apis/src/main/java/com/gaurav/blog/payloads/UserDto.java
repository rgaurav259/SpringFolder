package com.gaurav.blog.payloads;

import lombok.*;

import javax.persistence.Column;

@Getter
@Setter
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
