package com.example.reddit.redditclonebackend.service;

import com.example.reddit.redditclonebackend.Model.User;
import com.example.reddit.redditclonebackend.Model.VerificationToken;
import com.example.reddit.redditclonebackend.dto.RegisterRequest;
import com.example.reddit.redditclonebackend.repository.UserRepository;
import com.example.reddit.redditclonebackend.repository.VerificationTokenRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.Instant;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AuthService {
//constructor based injection
    //@Autowired
    private  final PasswordEncoder passwordEncoder;

    //@Autowired
    private final UserRepository userRepository;
    private final VerificationTokenRepository verificationTokenRepository;


    @Transactional
    public void signup(RegisterRequest registerRequest){

        User user = new User();
        user.setUsername(registerRequest.getUsername());
        user.setEmail(registerRequest.getEmail());
        user.setPassword(passwordEncoder.encode(registerRequest.getPassword()));
        user.setCreated(Instant.now());
        user.setEnabled(false);
        userRepository.save(user);
        String token = generateVerificationToken(user);
    }

    //generateverificationtoken
    private String generateVerificationToken(User user){
        String token = UUID.randomUUID().toString();
        VerificationToken verificationToken = new VerificationToken();
        verificationToken.setToken(token);
        verificationToken.setUser(user);

        verificationTokenRepository.save(verificationToken);
        return token;
    }
}
