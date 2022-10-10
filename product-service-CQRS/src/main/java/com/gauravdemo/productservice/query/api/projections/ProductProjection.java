package com.gauravdemo.productservice.query.api.projections;

import com.gauravdemo.productservice.command.api.data.Product;
import com.gauravdemo.productservice.command.api.data.ProductRepository;
import com.gauravdemo.productservice.command.api.model.ProductRestModel;
import com.gauravdemo.productservice.query.api.queries.GetProductsQuery;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductProjection {

    private ProductRepository productRepository;

    public ProductProjection(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @QueryHandler
    public List<ProductRestModel> handle(GetProductsQuery getProductsQuery){
        List<Product> productList = productRepository.findAll();

       List<ProductRestModel> productRestModels= productList.stream()
                .map(product -> ProductRestModel.builder().quantity(product.getQuantity())
                        .price(product.getPrice())
                        .name(product.getName())
                        .build()).collect(Collectors.toList());

                return productRestModels;

    }


}
