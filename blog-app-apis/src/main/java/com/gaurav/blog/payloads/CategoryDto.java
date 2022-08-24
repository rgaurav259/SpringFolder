package com.gaurav.blog.payloads;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

    private Integer categoryId;

    @NotBlank
    @Size(min = 4)
    private String categoryTitle;

    @NotBlank
    @Size(min = 10 ,message = "not minimum 10 letters")
    private String categoryDescription;
}
