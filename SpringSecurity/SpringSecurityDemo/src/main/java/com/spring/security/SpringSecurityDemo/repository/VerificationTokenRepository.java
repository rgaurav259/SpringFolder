package com.spring.security.SpringSecurityDemo.repository;

import com.spring.security.SpringSecurityDemo.entity.VerificationToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VerificationTokenRepository extends JpaRepository<VerificationToken,Long> {




}
