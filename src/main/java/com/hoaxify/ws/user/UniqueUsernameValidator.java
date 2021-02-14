package com.hoaxify.ws.user;

import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername, String> {
    @Autowired
    UserRepository userRepository;

    @Override
    public boolean isValid(String Username, ConstraintValidatorContext context) {
        User user = userRepository.findByUsername(Username);
        if (user != null) {
            return false;
        }
        return true;
    }
}
