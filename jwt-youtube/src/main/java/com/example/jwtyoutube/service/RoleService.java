package com.example.jwtyoutube.service;

import com.example.jwtyoutube.dao.RoleDao;
import com.example.jwtyoutube.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {


    @Autowired
    private RoleDao roleDao;

    public Role createNewRole(Role role){
      return roleDao.save(role);

    }

}
