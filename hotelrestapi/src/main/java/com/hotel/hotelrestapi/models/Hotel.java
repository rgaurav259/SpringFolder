package com.hotel.hotelrestapi.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Hotel {

    @Id
    @GeneratedValue(generator = "hotel_id",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "hotel_id",sequenceName = "hotel_id")
    private Integer hotelId;
    private String hotelName;

    @OneToOne
    private Address address;

    @OneToMany
    private Set<Menu> menuList;

    @ManyToMany
    private Set<Delivery> delivery;

    //constructor

    public Hotel(String hotelName, Address address, Set<Menu> menuList, Set<Delivery> delivery) {
        super();
        this.hotelName = hotelName;
        this.address = address;
        this.menuList = menuList;
        this.delivery = delivery;
    }


    //tostring


    @Override
    public String toString() {
        return "Hotel{" +
                "hotelName='" + hotelName + '\'' +
                ", address=" + address +
                ", menuList=" + menuList +
                ", delivery=" + delivery +
                '}';
    }
}
