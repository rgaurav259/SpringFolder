package com.gauravCompany.bookauthorService.repository;

import com.gauravCompany.bookauthorService.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
