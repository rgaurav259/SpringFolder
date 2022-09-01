package com.example.jwtyoutube.configuration;

import io.jsonwebtoken.ExpiredJwtException;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class JwtRequestFilter  extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request,
                                    HttpServletResponse response,
                                    FilterChain filterChain) throws ServletException, IOException {

       final String header = request.getHeader("Authorization");

       String jwtToken = null;

       if (header != null && header.startsWith("Bearer ") ){
           jwtToken = header.substring(7);//bearar length 7 space counts also
       }
       try {

       }catch (IllegalArgumentException e){
           System.out.println("unable to get JWT token....");
       }catch (ExpiredJwtException e){
           System.out.println("Jwt token is expired.......");
       }



    }
}
