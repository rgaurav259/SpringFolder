package com.example.productCrud.demo.Controller;


import com.example.productCrud.demo.Repository.ProductRepository;
import com.example.productCrud.demo.entity.Product;
import com.example.productCrud.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return productService.saveProduct(product);
    }

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return productService.saveProducts(products);
    }

    //get

    @GetMapping("/products")
    public List<Product> findAllProducts(){
        return productService.getProducts();
    }

    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable  int id){
        return productService.getProductsById(id);
    }

    @GetMapping("/productByName/{name}")
    public Product findProductByName(@PathVariable  String name) {
        return productService.getProductByName(name);
    }

    @GetMapping("/getProductByQuantity/{quantity}")
    public List<Product> getProductByQuantity(@PathVariable int quantity){
        return productService.getProductByQuantity(quantity);
    }

    //put
    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product){
        return productService.updateProduct(product);
    }


    @DeleteMapping("delete/{id}")
    public String deleteProductById(@PathVariable int id){
        return productService.deleteProductById(id);
    }




}
