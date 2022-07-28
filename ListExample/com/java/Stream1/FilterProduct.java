package com.java.Stream1;

import java.util.ArrayList;
import java.util.List;


class Product{
    int id;
    String name;
    long price;
    
    public Product(int id,String name, long price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class FilterProduct {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1,"Hp",25000));
        productList.add(new Product(2,"Dell",35000));
        productList.add(new Product(3,"LENOVEO",45000));
        productList.add(new Product(1,"APPLE",5520000));
        productList.add(new Product(1,"SONY",40000));

        System.out.println("productList = " + productList);

        productList.stream().filter(product -> product.price >=35000).forEach(product -> System.out.println(product.name));



    }
}
