package com.hotel.hotelrestapi;

import com.hotel.hotelrestapi.models.Address;
import com.hotel.hotelrestapi.models.Delivery;
import com.hotel.hotelrestapi.models.Hotel;
import com.hotel.hotelrestapi.models.Menu;
import com.hotel.hotelrestapi.service.DeliveryService;
import com.hotel.hotelrestapi.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class HotelrestapiApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HotelrestapiApplication.class, args);
	}

	@Autowired
	HotelService hotelService;
	@Autowired
	DeliveryService deliveryService;
	@Override
	public void run(String... args) throws Exception {

		Address address = new Address("JPNAGARA","GURUGRAM",201240,"Bihar");

		Menu menu1 = new Menu("RASGULLA",2000);
		Menu menu2 = new Menu("IDLI",18);
		Set<Menu> menulist = new HashSet<>(Arrays.asList(menu1,menu2));

		Delivery del1 = deliveryService.getDeliveryByPartner("SWIGGY");
		//Delivery del2 = new Delivery("Uber",190);

		Set<Delivery> deliverylist = new HashSet<>(Arrays.asList(del1));

		Hotel hotel = new Hotel("TAJ",address,menulist,deliverylist);

		hotelService.addHotel(hotel);


		//get dataaaa

//		Hotel hotel = hotelService.getHotelById(152);
//		System.out.println(hotel);
//		hotel.getAddress().setCity("karwar");
//		hotelService.updateHotel(hotel);
//		hotel=hotelService.getHotelById(152);
//		System.out.println(hotel);


		//get
//		hotelService.getHotelsByCity("Bangalore")
//				.stream()
//				.forEach((h)->System.out.println(h.getHotelName()+h.getAddress().getCity()));
//		System.out.println();
//		hotelService.getHotelsByLocation("NRICITY")
//				.stream()
//				.forEach((h)->System.out.println(h.getHotelName()+h.getMenuList()));
//


		//get
//		hotelService.getHotelsByMenu("IDLI")
//				.stream()
//				.forEach((h)->System.out.println(h.getHotelName()+" "+h.getAddress().getStreetName()));
//
//		System.out.println();
//
//		hotelService.getHotelsByDelivery("SWIGGY")
//				.stream()
//				.forEach(h->System.out.println(h.getHotelName()+" "+h.getAddress().getStreetName()));


		//get

		hotelService.getHotelsByLocationAndMenu("JPNAGARA","IDLI")
				.forEach((h)-> System.out.println(h.getHotelName()+" "+h.getAddress().getCity()));

	}
}
