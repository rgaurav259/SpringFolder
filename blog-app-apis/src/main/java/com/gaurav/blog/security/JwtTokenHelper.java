package com.gaurav.blog.security;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Component
public class JwtTokenHelper {

    public static final long JWT_TOKEN_VALIDITY=5 * 60 * 60;

    private String secret = "jwtTokenKey";

    //retrieve username from jwt token

    public String getUserNameFromToken(String token){
        return getClaimFromToKen(token, Claims::getSubject);
    }

    //retrieve expiration date from jwt token

    public Date getExpirationDateFromToken(String token){
        return getClaimFromToKen(token,Claims::getExpiration);
    }

    public <T> T getClaimFromToKen(String token, Function<Claims,T> claimsResolver){
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    //for retrieveing any information from token we will need tge secret key
    private Claims getAllClaimsFromToken(String token){
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    }

    //check if the token has expired
    private Boolean isTokenExpired(String token){
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }

    //generate token from user
    public String generateToken(UserDetails userDetails){
        Map<String,Object> claims= new HashMap<>();
        return doGenerateToken(claims,userDetails.getUsername());
    }
    //while creating the token
    //1.define claims of the token,like issuer,expiration,subject and the ID
    //2. sign the jwt using the HS512  algortihm and secret key
    //3.According to JWS compact serialization (https.tools.org/html)
    //4.compaction of the jwt to a url -sfe string

    private String doGenerateToken(Map<String,Object> claims,String subject){
        return Jwts.builder().setClaims(claims)
                .setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY *100))
                .signWith(SignatureAlgorithm.HS512,secret).compact();
    }
    //validate token
    public Boolean validateToken (String token,UserDetails userDetails){
        final String userName = getUserNameFromToken(token);
        return (userName.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }



}
