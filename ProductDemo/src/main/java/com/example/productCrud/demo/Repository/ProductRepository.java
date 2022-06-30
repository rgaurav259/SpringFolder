package com.example.productCrud.demo.Repository;

import com.example.productCrud.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
  public   Product findByName(String name);

 public Product findByQuantity(int quantity);
}
