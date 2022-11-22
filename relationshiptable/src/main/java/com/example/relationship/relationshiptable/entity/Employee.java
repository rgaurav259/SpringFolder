package com.example.relationship.relationshiptable.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.List;

@Entity
@Transactional
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    private String empName;
    private Integer empAge;

    //address_add_id;
    //  second column primarykeytablename ddress-add-id by default name is saved in databse but we have to create custom
//-------- one toOne--------------
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_add_id") //my own custom column
    //-----------------------------------------------------
    //---------------------------one to many -----------
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_emp_id",referencedColumnName ="emp_id")
    private List<Address> address;

}
