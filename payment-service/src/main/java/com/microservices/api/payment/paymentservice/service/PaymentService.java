package com.microservices.api.payment.paymentservice.service;

import com.microservices.api.payment.paymentservice.entity.Payment;
import com.microservices.api.payment.paymentservice.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Random;
import java.util.UUID;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;


    public Payment doPaymnet(Payment payment){
        payment.setPaymentStatus(paymentProcessing());
        payment.setTransactionId(UUID.randomUUID().toString());
        return repository.save(payment);

    }


    public String paymentProcessing(){
        //api call shoul be 3rd party payment gateway(paypal,paytm)
        return new Random().nextBoolean()?"success":"false";
    }
}
