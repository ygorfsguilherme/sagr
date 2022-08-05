package br.org.sagr.commission.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.org.sagr.commission.authentication.Auth;

@Controller
public class LoginController {

    @GetMapping("/")
    public String login() {
        if (new Auth().isAuthenticated()) {
            return "redirect:painel";
        }

        return "index";
    }
}
