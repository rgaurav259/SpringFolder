package com.example.data.dtoexample.repositroy;

import com.example.data.dtoexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User,Long> {


}
