package com.gaurav.jjwtByR.Service;

import com.gaurav.jjwtByR.Model.User;

import java.util.Optional;

public interface IUserService {

    Integer saveUser(User user);

    Optional<User> findByUsername(String username);

}
