package com.gauravCompany.bookauthorService.repository;

import com.gauravCompany.bookauthorService.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<AuthorEntity,Long> {
}
