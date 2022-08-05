package com.hotel.hotelrestapi.service;

import com.hotel.hotelrestapi.Repository.HotelRepository;
import com.hotel.hotelrestapi.exception.HotelNotFoundException;
import com.hotel.hotelrestapi.exception.IdNotFoundException;
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

//        return hotelRepository.findById(hotelId).get();
//        using exception handling
        return hotelRepository.findById(hotelId)
                .orElseThrow(()-> new IdNotFoundException("id not found"));

    }

    @Override
    public void deleteHotel(int hotelId) {
        if (hotelId <=0){
            throw new RuntimeException("Id should e greater than zero..");
        }
        hotelRepository.deleteById(hotelId);
    }

    @Override
    public List<Hotel> getHotelsByCity(String city) {

//        return hotelRepository.findByAddressCity(city);
        //uisng exception handling
        List<Hotel> hotelList= hotelRepository.findByAddressCity(city);
        if (hotelList.isEmpty()){
            throw new HotelNotFoundException("hotel with city not found");
        }
        return hotelList;
    }

    @Override
    public List<Hotel> getHotelsByMenu(String menuName) {
        //without exception handling
        //return hotelRepository.getHotelsByMenu(menuName);

        //using exception handling
        List<Hotel> hotelList= hotelRepository.getHotelsByMenu(menuName);
        if (hotelList.isEmpty()){
            throw new HotelNotFoundException("hotel with menuuu not found..");
        }
        return hotelList;
        //below same as above
    }

    @Override
    public List<Hotel> getHotelsByDelivery(String partnerName) {
        List<Hotel> hotelList= hotelRepository.getHotelsByDelivery(partnerName);
        if (hotelList.isEmpty()){
            throw new HotelNotFoundException("hotel with this delivery not found");
        }
        return hotelList;
    }

    @Override
    public List<Hotel> getHotelsByLocation(String location) {
        List<Hotel> hotelList= hotelRepository.findByAddressStreetName(location);

        if (hotelList.isEmpty()){
            throw new HotelNotFoundException("hotel with location is not found..");
        }
        return hotelList;
    }

    @Override
    public List<Hotel> getHotelsByLocationAndMenu(String location, String menuName) {
        List<Hotel> hotelList= hotelRepository.getHotelsByLocationAndMenu(location, menuName);
        if (hotelList.isEmpty()){
            throw new HotelNotFoundException("hotel with this location and menu not found");
        }
        return hotelList;

    }
}
