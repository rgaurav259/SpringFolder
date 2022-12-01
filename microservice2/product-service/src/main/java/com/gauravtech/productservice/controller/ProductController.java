package com.gauravtech.productservice.controller;

import com.gauravtech.productservice.Service.ProductService;
import com.gauravtech.productservice.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProducts")
    public List<Product> addProduct (@RequestBody List<Product> productList){
        return productService.addProducts(productList);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        return productService.getProducts();
    }


    @GetMapping("/getProducts/{productIdsList}")
    public List<Product> getProductsByIds(@PathVariable List<Long> productIdsList){
        return productService.getProductsByIds(productIdsList);
    }
}
