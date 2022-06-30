package com.example.productCrud.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "Product_Table")
public class Product {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int price;
    private int  quantity;
}
