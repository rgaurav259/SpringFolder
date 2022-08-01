package com.hotel.hotelrestapi.controller;

import com.hotel.hotelrestapi.models.Hotel;
import com.hotel.hotelrestapi.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels-restapi")
public class HotelController {


    @Autowired
    HotelService hotelService;



    @PostMapping("/hotels")
  public ResponseEntity<Hotel>  addHotel(@RequestBody Hotel hotel){

    Hotel newHotel = hotelService.addHotel(hotel);
    HttpHeaders header=new HttpHeaders();
    header.add("Desc","one hotel added");
    return ResponseEntity.ok().headers(header).body(newHotel);

}

    @PutMapping("/hotels")
    public ResponseEntity<String> updateHotel(@RequestBody Hotel hotel){
    hotelService.updateHotel(hotel);
    return ResponseEntity.ok("updated");
    }


    @GetMapping("/hotels/hotel-by-id/{hotelId}")
    public ResponseEntity<Hotel> getHotelById(@PathVariable int hotelId){
    Hotel newhotel = hotelService.getHotelById(hotelId);
    HttpHeaders header= new HttpHeaders();
    header.add("Desc","getting one hotel instance");
    return ResponseEntity.ok().headers(header).body(newhotel);
    }





//    void deleteHotel(int hotelId);
//
//
//    List<Hotel> getHotelsByCity(String city);
//    List<Hotel> getHotelsByMenu(String menuName);
//    List<Hotel> getHotelsByDelivery(String partnerName);
//    List<Hotel> getHotelsByLocation(String location);
//    List<Hotel> getHotelsByLocationAndMenu(String location,String menuName);




}
