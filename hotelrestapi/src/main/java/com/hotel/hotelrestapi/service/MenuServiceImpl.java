package com.hotel.hotelrestapi.service;

import com.hotel.hotelrestapi.Repository.MenuRepository;
import com.hotel.hotelrestapi.models.Menu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService{
    @Autowired
    MenuRepository menuRepository;

    @Override
    public List<Menu> getMenusByHotel(String hotelName) {
        //return menuRepository.findByHotelHotelName(hotelName);
        //return menuRepository.findByHotel(hotelName);
        return menuRepository.findByHotelssss(hotelName);
    }
}
