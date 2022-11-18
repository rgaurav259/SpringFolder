package com.gauravCompany.bookauthorService.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.gauravCompany.bookauthorService.entity.BookEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
//@JsonInclude(JsonInclude.Include.NON_NULL)
//@JsonIgnoreProperties(ignoreUnknown = true)
public class AuthorDTO {
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String password;

    private List<BookEntity> books;
}
