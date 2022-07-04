package com.example.relationship.relationshiptable.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;


@Entity
@Transactional
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        @Column(name = "add_id")
        private Long addressId;
        private String city;
        private String addressType;

//        @OneToOne(mappedBy = "address")
//        private Employee employee;

        // in oneToMany no need to mapped by employee table here in addrss


}
