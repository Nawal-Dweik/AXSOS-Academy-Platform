package com.axsosacademy.axsosplatform.validators;


import com.axsosacademy.axsosplatform.models.User;
import com.axsosacademy.axsosplatform.services.UserService;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;


@Component
public class UserValidator implements Validator {
    private UserService userService;

    public UserValidator(UserService userService) {
        this.userService = userService;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        User user = (User) target;

        // CHECK TO SEE IF THE PASSWORD CONFIRMATION MATCHES THE PASSWORD
        if(!user.getPasswordConfirmation().equals(user.getPassword())) {
            errors.rejectValue("passwordConfirmation",  "Match");
        }
        // IF A USER IS RETURNED, THAT EMAIL IS ALREADY IN USE. DISPLAY ERROR
        if(userService.findByEmail(user.getEmail()) != null) {
            errors.rejectValue("email",  "DuplicateEmail");
        }
    }
}