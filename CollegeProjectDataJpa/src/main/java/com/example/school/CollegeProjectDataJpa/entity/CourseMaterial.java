package com.example.school.CollegeProjectDataJpa.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString(exclude = "course")//because we have lazy type fetching that's why
public class CourseMaterial {

    @Id
    @SequenceGenerator(
            name = "course_material_sequence",
            sequenceName = "course_material_sequence",
            allocationSize = 1
    )

    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "course_material_sequence"
    )

    private Long courseMaterialId;
    private String url;

    @OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
             optional = false
    )//lazy means only coursematerial proide eager means both table data fetch
    //by default optional true it means loosely coupled not mandatory
    @JoinColumn(
            name = "course_id",
            referencedColumnName = "courseId"

    )
    private Course course;

    //whenever you try to save course it's not optional
    //it's mandatory to save coursematerial as well
}
