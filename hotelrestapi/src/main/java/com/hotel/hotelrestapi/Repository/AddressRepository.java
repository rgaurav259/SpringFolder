package com.hotel.hotelrestapi.Repository;

import com.hotel.hotelrestapi.models.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
