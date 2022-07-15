package com.example.data.dtoexample;

import com.example.data.dtoexample.model.Location;
import com.example.data.dtoexample.model.User;
import com.example.data.dtoexample.repositroy.LocationRepository;
import com.example.data.dtoexample.repositroy.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DtoexampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DtoexampleApplication.class, args);
	}


	@Autowired
	private Userrepository userrepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {

		Location location= new Location();
		location.setPlace("pune");
		location.setDescription("is great place");
		location.setLongitude(40.5);
		location.setLatitude(38.6);
		locationRepository.save(location);


		//now user data save
		User user1= new User();
		user1.setFirstName("gaurav");
		user1.setLastName("kumar");
		user1.setEmail("rgaurav259@gmail.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userrepository.save(user1);


		//2nd user


		User user2= new User();
		user2.setFirstName("abhishek");
		user2.setLastName("kumar");
		user2.setEmail("abhishek@gmail.com");
		user2.setPassword("1258");
		user2.setLocation(location);
		userrepository.save(user2);


	}


}


//@SpringBootApplication
//public class DtoexampleApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(DtoexampleApplication.class, args);
//	}
//
//}