package com.example.productCrud.demo.service;


import com.example.productCrud.demo.Repository.ProductRepository;
import com.example.productCrud.demo.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;


    public Product saveProduct(Product product){
        return repository.save(product);

    }



    public List<Product> saveProducts(List<Product> products){
        return repository.saveAll(products);
    }


    //get
    public List<Product> getProducts(){
        return repository.findAll();
    }


    public Product getProductsById(int id){
        return repository.findById(id).orElse(null);
    }


    public Product getProductByName(String name){
        return repository.findByName(name);
    }


    public List<Product> getProductByQuantity(int quantity){
        return repository.findAll();

    }


//delete

    public  String deleteProductById(int id){
        repository.deleteById(id);
        return "Product removed with id: "+id;

    }

//update

    public Product updateProduct(Product product){
       Product existingProduct= repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setPrice(product.getPrice());
        existingProduct.setQuantity(product.getQuantity());
        return repository.save(existingProduct);
    }


}
