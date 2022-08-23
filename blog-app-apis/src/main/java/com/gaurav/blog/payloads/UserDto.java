package com.gaurav.blog.payloads;

import lombok.*;

import javax.persistence.Column;
import javax.validation.constraints.*;

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
    @Pattern(regexp = "^((?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$&*])(?=.*[0-9])){4,12}$",
            message = "password must contain atleast 1 uppercase, 1 lowercase, 1 special character and 1 digit ")
    private String password;

//    @NotNull
    @NotEmpty
    private String about;

}
