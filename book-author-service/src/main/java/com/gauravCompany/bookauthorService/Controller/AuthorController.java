package com.gauravCompany.bookauthorService.Controller;

import com.gauravCompany.bookauthorService.dto.AuthorDTO;
import com.gauravCompany.bookauthorService.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthorController {

    @Autowired
    private AuthorService authorService;

    @PostMapping("/authors/register")
    public ResponseEntity<Long> register(@RequestBody AuthorDTO authorDTO){
        Long authorId = authorService.register(authorDTO);
        ResponseEntity re = new ResponseEntity(authorId, HttpStatus.CREATED);
        return re;
    }

    @GetMapping("/authors/{authorId}/profile")
    public ResponseEntity<AuthorDTO> getProfile(@PathVariable Long authorId){
        AuthorDTO authorDTO = authorService.getAuthorDetail(authorId);
        ResponseEntity re = new ResponseEntity(authorDTO, HttpStatus.OK);
        return re;
    }
}
