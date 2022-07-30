package com.hotel.hotelrestapi.models;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Menu {

    @Id
    @GeneratedValue(generator = "menu_id",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "menu_id",sequenceName = "menu_id")

    private Integer menuId;
    private String menuName;
    private double price;


    @ManyToMany
    private Hotel hotel;

    public Menu(String menuName, double price) {
        this.menuName = menuName;
        this.price = price;
    }



    //tostring


    @Override
    public String toString() {
        return "Menu{" +
                "menuName='" + menuName + '\'' +
                ", price=" + price +
                '}';
    }
}
