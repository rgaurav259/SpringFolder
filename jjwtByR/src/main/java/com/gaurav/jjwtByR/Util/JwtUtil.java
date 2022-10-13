package com.gaurav.jjwtByR.Util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class JwtUtil {

    @Value(("${app.secret"))
    private String secret;

    //6 ..validate user name in token and database,expdate
    public boolean validateToken(String token,String username){

        String tokenUserName = getUsername(token);
        return (username.equals(tokenUserName) && !isTokenExp(token));
        //databse username taking and chcking still not expired token then validate
    }


    //5.validate expiration date or not checked
    public boolean isTokenExp(String token){
        Date expDate = getExpDate(token);
        return expDate.before(new Date(System.currentTimeMillis()));
    }



    //4. read subject/username subject means user which is logged in
    public String getUsername(String token){
        return getClaims(token).getSubject();
    }

    //3. Read exp date fromm token claims
    public Date getExpDate(String token){
        return getClaims(token).getExpiration();
    }


    //2.read token data  claims
    public Claims getClaims(String token){
        return Jwts.parser()
                .setSigningKey(secret.getBytes())
                .parseClaimsJws(token)
                .getBody();
    }


    //1.Generate Token

    public String generateToken(String subject){
        return Jwts.builder()
                .setSubject(subject)
                .setIssuer("gaurav")
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+ TimeUnit.MINUTES.toMillis(15)))
                .signWith(SignatureAlgorithm.HS512,secret.getBytes())
                .compact();
    }

}
