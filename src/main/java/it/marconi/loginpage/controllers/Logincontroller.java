package it.marconi.loginpage.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import it.marconi.loginpage.domains.User;

@Controller
@RequestMapping("/utente")
public class Logincontroller {
    
    @GetMapping("/login")
    public ModelAndView login(){
        return new ModelAndView("login-page").addObject(new User());
    }

    @GetMapping("/new")
    public ModelAndView newUser(){
        return new ModelAndView("newuser-page").addObject(new User());
    }

}
