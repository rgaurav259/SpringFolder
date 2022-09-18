package com.example.user.login.registerloginemail.registration;

import com.example.user.login.registerloginemail.appUser.AppUser;
import com.example.user.login.registerloginemail.appUser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    private final EmailValidator emailValidator;


    public String register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());

        if (!isValidEmail){
            throw new IllegalStateException("emait not valid");
        }

        return appUserService.signUpUser(new AppUser(
                request.getFirstName(),

        ));
    }
}
