package com.gauravCompany.bookauthorService.Controller;

import com.gauravCompany.bookauthorService.dto.BookDTO;
import com.gauravCompany.bookauthorService.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/authors/{authorId}/books")
    public ResponseEntity<Long> addBook(@PathVariable Long authorId, @RequestBody BookDTO bookDTO){

        Long bookId = bookService.addBook(authorId, bookDTO);
       ResponseEntity<Long> re =  new ResponseEntity<>(bookId, HttpStatus.CREATED);
       return re;

    }
}
