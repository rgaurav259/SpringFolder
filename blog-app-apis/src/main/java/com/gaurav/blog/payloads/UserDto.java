package com.gaurav.blog.payloads;

import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {


    private int id;

    //@NotNull
    //@Column(name = "user_name",nullable = false,length = 100)
    @NotEmpty
    @Size(min = 4,message = "name must not be less than  4 characters")
    private String name;

    @Email(message = "email address not valid !!!!")
    private String email;

//    @NotNull
    @NotEmpty
    @Size(min = 3,max = 10,message = "size not less than 3 and not maximum 10")
    private String password;

//    @NotNull
    @NotEmpty
    private String about;

}
