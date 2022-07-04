package com.example.relationship.relationshiptable.repositry;

import com.example.relationship.relationshiptable.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Long> {
}
