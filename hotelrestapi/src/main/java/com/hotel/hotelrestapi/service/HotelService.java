package com.hotel.hotelrestapi.service;

import com.hotel.hotelrestapi.models.Hotel;
import java.util.List;

public interface HotelService {
    Hotel addHotel(Hotel hotel);
    void updateHotel(Hotel hotel);
    Hotel getHotelById(int hotelId);
    void deleteHotel(int hotelId);


    List<Hotel> getHotelsByCity(String city);
    List<Hotel> getHotelsByMenu(String menuName);
    List<Hotel> getHotelsByDelivery(String partnerName);
    List<Hotel> getHotelsByLocation(String location);
    List<Hotel> getHotelsByLocationAndMenu(String location,String menuName);


}
