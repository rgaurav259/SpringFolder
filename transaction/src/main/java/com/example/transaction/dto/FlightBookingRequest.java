package com.example.transaction.dto;

import com.example.transaction.entity.PassengerInfo;
import com.example.transaction.entity.PaymentInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FlightBookingRequest {

    @Autowired
    private PassengerInfo passengerInfo;

    @Autowired
    private PaymentInfo paymentInfo;

}
