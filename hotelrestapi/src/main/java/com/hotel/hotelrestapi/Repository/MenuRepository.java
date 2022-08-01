package com.hotel.hotelrestapi.Repository;

import com.hotel.hotelrestapi.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MenuRepository extends JpaRepository<Menu,Integer> {

//Derived Queries
//List<Menu> findByHotelHotelName(String hotelName);


    //Query with JPQL
//    @Query("FROM Menu m INNER JOIN m.hotel h WHERE h.hotelName=?1")
//    List<Menu> findByHotel(String hotelName);//above same as below


    //Query with sql native uery

    @Query(value = "select * from menu m inner join hotel h on m.hotel_id = h.hotel_id where h.hotel_name =?1",nativeQuery = true)
    List<Menu> findByHotelssss(String hotelName);



}
