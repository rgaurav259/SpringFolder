package com.hotel.hotelrestapi.service;

import com.hotel.hotelrestapi.Repository.HotelRepository;
import com.hotel.hotelrestapi.models.Hotel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class HotelServiceImpl implements HotelService{

    @Autowired
    private HotelRepository hotelRepository;


    @Override
    public Hotel addHotel(Hotel hotel) {

       return hotelRepository.save(hotel);

    }

    @Override
    public void updateHotel(Hotel hotel) {
        hotelRepository.save(hotel);

    }

    @Override
    public Hotel getHotelById(int hotelId) {
        return hotelRepository.findById(hotelId).get();
    }

    @Override
    public void deleteHotel(int hotelId) {
        hotelRepository.deleteById(hotelId);
    }

    @Override
    public List<Hotel> getHotelsByCity(String city) {

        return hotelRepository.findByAddressCity(city);
    }

    @Override
    public List<Hotel> getHotelsByMenu(String menuName) {
        return hotelRepository.getHotelsByMenu(menuName);
    }

    @Override
    public List<Hotel> getHotelsByDelivery(String partnerName) {
        return hotelRepository.getHotelsByDelivery(partnerName);
    }

    @Override
    public List<Hotel> getHotelsByLocation(String location) {
        return hotelRepository.findByAddressStreetName(location);
    }

    @Override
    public List<Hotel> getHotelsByLocationAndMenu(String location, String menuName) {
        return hotelRepository.getHotelsByLocationAndMenu(location, menuName);
    }
}
