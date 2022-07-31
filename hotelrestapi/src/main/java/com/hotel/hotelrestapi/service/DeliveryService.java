package com.hotel.hotelrestapi.service;

import com.hotel.hotelrestapi.models.Delivery;
import com.hotel.hotelrestapi.models.Hotel;

public interface DeliveryService {

    void updateDelivery(Delivery delivery);

    void deleteDelivery(int deliveryId);

    Delivery getDeliveryById(int deliveryId);

    Delivery getDeliveryByPartner(String partnerName);
}
