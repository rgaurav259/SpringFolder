package com.example.jwtyoutube.controller;

import com.example.jwtyoutube.entity.JwtRequest;
import com.example.jwtyoutube.entity.JwtResponse;
import com.example.jwtyoutube.service.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class JwtController {
    @Autowired
    private JwtService jwtService;

    @PostMapping("/authenticate")
    public JwtResponse createJwtToken(@RequestBody JwtRequest jwtRequest) throws Exception {

       return jwtService.createJwtToken(jwtRequest);

    }
}
