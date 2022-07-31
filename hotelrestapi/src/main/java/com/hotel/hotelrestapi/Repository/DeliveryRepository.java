package com.hotel.hotelrestapi.Repository;

import com.hotel.hotelrestapi.models.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryRepository extends JpaRepository<Delivery,Integer> {

    //Derived Queries
    Delivery findByPartnerName(String partnerName);
}
