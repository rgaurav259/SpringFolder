package com.hotel.hotelrestapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id")
    private Address address;


    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name = "hotel_id")
    private Set<Menu> menuList;



    @ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
    @JoinTable( name = "hotel_delivery",
            joinColumns = @JoinColumn(name = "hotel_id"),
            inverseJoinColumns = @JoinColumn(name = "delivery_id")

    )
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
