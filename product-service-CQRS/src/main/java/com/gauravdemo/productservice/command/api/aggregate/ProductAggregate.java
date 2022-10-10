package com.gauravdemo.productservice.command.api.aggregate;

import com.gauravdemo.productservice.command.api.commands.CreateProductCommand;
import com.gauravdemo.productservice.command.api.events.ProductCreatedEvent;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

@Aggregate
public class ProductAggregate {

    @AggregateIdentifier
    private String productId;
    private String  name;
    private BigDecimal price;
    private Integer quantity;

    //parameter constructo

    @CommandHandler
    public ProductAggregate(CreateProductCommand createProductCommand){
        // you can perform all the validations

//        ProductCreatedEvent productCreatedEvent =
//                ProductCreatedEvent.builder()
//                        .build();
        //we can copy properties object as well so ..
        ProductCreatedEvent productCreatedEvent =
                new ProductCreatedEvent();
        BeanUtils.copyProperties(createProductCommand,productCreatedEvent);
        //all the properties copy source to target

        AggregateLifecycle.apply(productCreatedEvent);
    }


    //default constructo
    public ProductAggregate(){

    }

    @EventSourcingHandler
    public void on(ProductCreatedEvent productCreatedEvent){
        this.quantity= productCreatedEvent.getQuantity();
        this.productId=productCreatedEvent.getProductId();
        this.price=productCreatedEvent.getPrice();
        this.name=productCreatedEvent.getName();
    }
}
