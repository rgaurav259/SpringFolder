package com.gauravtech.productservice.Service;

import com.gauravtech.productservice.entity.Product;
import com.gauravtech.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;
    public List<Product> addProducts(List<Product> productList) {
        return productRepository.saveAll(productList);

    }

    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByIds(List<Long> productIdsList) {
        return productRepository.findAllById(productIdsList);
    }
}
