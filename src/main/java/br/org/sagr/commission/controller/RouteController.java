package br.org.sagr.commission.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RouteController {
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/painel")
    public String mainWindow() {
        return "userPanel/index";
    }

}
