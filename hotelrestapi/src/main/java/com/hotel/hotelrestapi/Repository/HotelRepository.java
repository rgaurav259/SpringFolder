package com.hotel.hotelrestapi.Repository;

import com.hotel.hotelrestapi.models.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface HotelRepository extends JpaRepository<Hotel,Integer> {


}
