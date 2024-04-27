package it.marconi.loginpage.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.web.servlet.ModelAndView;

import it.marconi.loginpage.domains.NewUser;

@Controller
@RequestMapping("/utente")
public class Logincontroller {

    @GetMapping
    public ModelAndView page(@RequestParam(name = "type") String type) {
        if (type.equals("new")) {
            return new ModelAndView("registration-page").addObject(new NewUser());
        } else if (type.equals("login")) {
            return new ModelAndView("login-page").addObject(new NewUser());
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Errore nel caricamento");
        }
    }

    @PostMapping("/birillo")
    public ModelAndView registrazione(@RequestParam String nickname, /* @RequestParam String email, */
            @RequestParam String pwd) {
        ModelAndView mv = new ModelAndView();

        mv.setViewName("recap-page");
        mv.addObject("nickname", nickname);
        // mv.addObject("email", email);
        mv.addObject("pwd", pwd);

        return mv;
    }

}
