package com.userdto.userDto.repo;

import com.userdto.userDto.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {


}
