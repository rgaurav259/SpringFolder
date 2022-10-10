package com.example.reactivewebfluxprogramming.handler;


import com.example.reactivewebfluxprogramming.dao.CustomerDao;
import com.example.reactivewebfluxprogramming.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerHandler {
    @Autowired
    private CustomerDao dao;

    public Mono<ServerResponse> loadCustomers(ServerRequest request){
        Flux<Customer> customerList = dao.getCustomerList();
        return ServerResponse.ok().body(customerList,Customer.class);

    }



}