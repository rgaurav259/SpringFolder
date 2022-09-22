package com.example.jwtDemo1;

import com.example.jwtDemo1.entity.User;
import com.example.jwtDemo1.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class JwtDemo1Application {

	@Autowired
	private UserRepository repository;
	@PostConstruct
	public void initUsers(){
		List<User> users = Stream.of(
				new User(101,"gaurav","password","gaurav@gmail.com"),
				new User(102,"user1","pwd1","user1@gmail.com"),
				new User(103,"user2","pwd2","user2@gmail.com"),
				new User(104,"user3","pwd2","user3@gmail.com")

		).collect(Collectors.toList());
		repository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(JwtDemo1Application.class, args);
	}

}
