package com.example.jwtyoutube.service;

import com.example.jwtyoutube.dao.RoleDao;
import com.example.jwtyoutube.dao.UserDao;
import com.example.jwtyoutube.entity.Role;
import com.example.jwtyoutube.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {


    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User registerNewUser(User user){

        Role role = roleDao.findById("User").get();

        Set<Role> roles = new HashSet<>();
        roles.add(role);
        user.setRole(roles);

        user.setUserPassword(getEncodedPassword(user.getUserPassword()));

        return userDao.save(user);

    }

    //roles added table and column db if it's deleted anyway
//when we run the prgram table will be deleted and every time it will create the role and ..
    public void initRolesAndUser(){

        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role");
        roleDao.save(adminRole);

        //user role

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default role for newly created user");
        roleDao.save(userRole);

        User adminUser = new User();
        adminUser.setUserFirstName("admin");
        adminUser.setUserLastName("admin");
        adminUser.setUserName("admin123");
        adminUser.setUserPassword(getEncodedPassword("admin@pass"));
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);



        //---------------------------
//        User user = new User();
//        user.setUserFirstName("raj");
//        user.setUserLastName("sharma");
//        user.setUserName("raj123");
//        user.setUserPassword(getEncodedPassword("raj@pass"));
//        Set<Role> userRoles = new HashSet<>();
//        userRoles.add(userRole);
//        user.setRole(userRoles);
//
//        userDao.save(user);

    }

    public String getEncodedPassword(String password){
        return passwordEncoder.encode(password);
    }


}
