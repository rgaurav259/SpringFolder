package com.hotel.hotelrestapi.Repository;

import com.hotel.hotelrestapi.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu,Integer> {

}
