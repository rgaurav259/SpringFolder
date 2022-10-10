package com.gauravdemo.productservice.command.api.events;

import com.gauravdemo.productservice.command.api.data.Product;
import com.gauravdemo.productservice.command.api.data.ProductRepository;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.messaging.interceptors.ExceptionHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
@ProcessingGroup("product")
public class ProductEventHandler {

    private ProductRepository productRepository;

    public ProductEventHandler(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    @EventHandler
    public void on(ProductCreatedEvent event) throws Exception {

        Product product=new Product();
        BeanUtils.copyProperties(event,product);
        productRepository.save(product);
        throw new Exception("exception occured");
    }

    @ExceptionHandler
    public void hadnle(Exception e) throws Exception {
        throw e;
    }
}
