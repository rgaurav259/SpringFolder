package com.hotel.hotelrestapi.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Address {
    @Id
    @GeneratedValue(generator = "add_id",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "add_id",sequenceName = "address_id")
    private Integer addressId;
    private String city;
    private long zipcode;
    private String state;

    public Address(String city, long zipcode, String state) {
        super();
        this.city = city;
        this.zipcode = zipcode;
        this.state = state;
    }

    //tostring

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", zipcode=" + zipcode +
                ", state='" + state + '\'' +
                '}';
    }
}
