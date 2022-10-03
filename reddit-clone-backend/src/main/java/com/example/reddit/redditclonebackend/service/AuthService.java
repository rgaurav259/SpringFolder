package com.example.reddit.redditclonebackend.service;

import com.example.reddit.redditclonebackend.Model.NotificationEmail;
import com.example.reddit.redditclonebackend.Model.User;
import com.example.reddit.redditclonebackend.Model.VerificationToken;
import com.example.reddit.redditclonebackend.dto.RegisterRequest;
import com.example.reddit.redditclonebackend.exeptions.SpringRedditException;
import com.example.reddit.redditclonebackend.repository.UserRepository;
import com.example.reddit.redditclonebackend.repository.VerificationTokenRepository;
import lombok.AllArgsConstructor;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.Instant;
import java.util.Optional;
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
    private final MailService mailService;


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

        mailService.sendMail(new NotificationEmail("please activate Your account",
                user.getEmail(),"thank you for signing up to spring reddit, " +

                "please click on the below url to activate your account: "+
                "http://localhost:8080/api/auth/accountVerification/" +token

                ));

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

    public void verifyAccount(String token) {

        Optional<VerificationToken> verificationToken = verificationTokenRepository.findByToken(token);

        verificationToken.orElseThrow(()-> new SpringRedditException("Invalid exception"));
        fetchUserAndEnable(verificationToken.get());


    }

    @Transactional
    private void fetchUserAndEnable(VerificationToken verificationToken) {

        String username = verificationToken.getUser().getUsername();
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new SpringRedditException("user not found with name -" + username));

        user.setEnabled(true);
        userRepository.save(user);
    }
}
