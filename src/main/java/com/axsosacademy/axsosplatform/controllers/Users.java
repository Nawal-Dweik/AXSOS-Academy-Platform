package com.axsosacademy.axsosplatform.controllers;

import com.axsosacademy.axsosplatform.models.User;
import com.axsosacademy.axsosplatform.services.UserService;
import com.axsosacademy.axsosplatform.validators.UserValidator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

@Controller
public class Users {
    private UserService userService;
    private final UserValidator userValidator;


    public Users(UserService userService , UserValidator userValidator) {
        this.userService = userService;
        this.userValidator =userValidator;
    }

    @RequestMapping("/registration")
    public String registerForm( @ModelAttribute("user") User user, HttpSession session) {
        Long userId = (Long) session.getAttribute("userId");
        if(userId != null) {
            return "redirect:/registration";    //this needs to change
        }
        return "registrationPage.jsp";
    }

    // <---------- POST REQUEST TO CREATE A USER USING FORM:FORM ---------->
    @RequestMapping(value="/users", method= RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
        userValidator.validate(user, result);
        if(result.hasErrors()) {
            return "registrationPage.jsp"; //this needs to change
        } else {
            User u = userService.registerUser(user);
            session.setAttribute("userId",  u.getId());;
            return "redirect:/registration";
        }
    }

    // <---------- POST REQUEST TO LOGIN A USER USING NORMAL FORM ---------->
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session, @ModelAttribute("user") User user) {
        // checks if the email and password credentials are valid
        boolean isAuthenticated = userService.authenticateUser(email, password);
        if(isAuthenticated) {
            // if valid, save the user's id into session
            User u = userService.findByEmail(email);
            session.setAttribute("userId", u.getId());
            return "redirect:/registration"; //this needs to change
        } else {
            model.addAttribute("error", "Invalid Credentials. Please try again.");
            return "registrationPage.jsp";
        }
    }


}
