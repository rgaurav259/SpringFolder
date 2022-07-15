package com.example.data.dtoexample.service;


import com.example.data.dtoexample.dto.UserLocationDto;
import com.example.data.dtoexample.model.User;
import com.example.data.dtoexample.repositroy.Userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {


    @Autowired
    private Userrepository userrepository;



    public List<UserLocationDto> getAllUsersLocation(){
        return userrepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }


    //convert entity to dto
    private UserLocationDto convertEntityToDto(User user){
        UserLocationDto userLocationDto = new UserLocationDto();
        userLocationDto.setUserId(user.getId());
        userLocationDto.setEmail(user.getEmail());
        userLocationDto.setPlace(user.getLocation().getPlace());
        userLocationDto.setLongitude(user.getLocation().getLongitude());
        userLocationDto.setLatitude(user.getLocation().getLatitude());
        return userLocationDto;
    }






}
