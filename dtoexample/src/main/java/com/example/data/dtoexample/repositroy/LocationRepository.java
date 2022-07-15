package com.example.data.dtoexample.repositroy;

import com.example.data.dtoexample.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location,Long> {



}
