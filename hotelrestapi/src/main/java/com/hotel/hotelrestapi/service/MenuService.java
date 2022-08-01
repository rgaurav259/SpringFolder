package com.hotel.hotelrestapi.service;

import com.hotel.hotelrestapi.models.Menu;

import java.util.List;

public interface MenuService {
    List<Menu>getMenusByHotel(String hotelName);


}
